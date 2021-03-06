package brunocasamassa.studio.teste.activities;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.Toast;

import java.io.IOException;
import java.util.ArrayList;

import brunocasamassa.studio.activities.R;
import brunocasamassa.studio.teste.adapters.RepoAdapter;
import brunocasamassa.studio.teste.models.Repo;
import brunocasamassa.studio.teste.models.Repositories;
import brunocasamassa.studio.teste.models.User;
import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements HttpRequestCode {

    @BindView(R.id.list_repos)
    RecyclerView listRepos;

    @BindView(R.id.toolbar_main)
    Toolbar toolbar;

    private RepoAdapter repoAdapter;
    private ArrayList<Repo> repoList;
    private ArrayList<User> userList;
    private int httpResult;
    private Call<Repositories> repos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        listRepos.setLayoutManager(layoutManager);

        toolbar.setTitle("Github Java Repos");
        toolbar.setBackgroundColor(Color.BLACK);

        try {
            getRequest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void getRequest() throws IOException {

        startRequest(getResources().getString(R.string.base_url), this);

    }

    public void startRequest(final String base_url, @Nullable final HttpRequestCode httpRequestCode) throws IOException {

        repos = initRetrofit(base_url).listRepos("Java");

        repos.enqueue(new Callback<Repositories>() {

            @Override
            public void onResponse(Call<Repositories> call, Response<Repositories> response) {

                httpRequestCode.onReceiveRequestCode(response.code());

                if (response.isSuccessful()) {
                    Repositories repos = response.body();
                    repoList = new ArrayList<>();
                    userList = new ArrayList<>();

                    for (final Repo repo : repos.getRepositories()) {
                        repoList.add(repo);

                        Call<User> userCall = initRetrofit(base_url).userInfo(repo.getUsername());
                        userCall.enqueue(new Callback<User>() {
                            @Override
                            public void onResponse(Call<User> call, Response<User> response) {
                                userList.add(response.body());
                                //System.out.println("user list name: " + userList.get(userList.size()-1).getName());
                                setRepoList();
                            }

                            @Override
                            public void onFailure(Call<User> call, Throwable t) {
                                t.printStackTrace();

                            }
                        });

                    }

                }


            }

            @Override
            public void onFailure(Call<Repositories> call, Throwable t) {

            }

        });

    }

    private Network initRetrofit(String base_url) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        Network service = retrofit.create(Network.class);
        return service;
    }

    private void setRepoList() {

        repoAdapter = new RepoAdapter(repoList, MainActivity.this, userList);
        repoAdapter.notifyItemInserted(repoAdapter.getItemCount());
        listRepos.setAdapter(repoAdapter);

    }

    public int getHttpCodeStatus() {
        try {
            int status = initRetrofit(getResources().getString(R.string.base_url)).listRepos("Java").execute().code();
            return status;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public void onReceiveRequestCode(int httpCode) {

        Toast.makeText(getApplicationContext(), "STATUS HTTP: " + httpCode, Toast.LENGTH_SHORT).show();
        Log.d("HTTP RESULT ", String.valueOf(httpResult));

    }


}
