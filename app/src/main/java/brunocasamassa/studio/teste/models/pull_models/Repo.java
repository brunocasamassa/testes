
package brunocasamassa.studio.teste.models.pull_models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Repo {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("owner")
    @Expose
    private Owner owner;
    @SerializedName("private")
    @Expose
    private boolean _private;
    @SerializedName("html_url")
    @Expose
    private String htmlUrl;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("fork")
    @Expose
    private boolean fork;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("forks_url")
    @Expose
    private String forksUrl;
    @SerializedName("keys_url")
    @Expose
    private String keysUrl;
    @SerializedName("collaborators_url")
    @Expose
    private String collaboratorsUrl;
    @SerializedName("teams_url")
    @Expose
    private String teamsUrl;
    @SerializedName("hooks_url")
    @Expose
    private String hooksUrl;
    @SerializedName("issue_events_url")
    @Expose
    private String issueEventsUrl;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;
    @SerializedName("assignees_url")
    @Expose
    private String assigneesUrl;
    @SerializedName("branches_url")
    @Expose
    private String branchesUrl;
    @SerializedName("tags_url")
    @Expose
    private String tagsUrl;
    @SerializedName("blobs_url")
    @Expose
    private String blobsUrl;
    @SerializedName("git_tags_url")
    @Expose
    private String gitTagsUrl;
    @SerializedName("git_refs_url")
    @Expose
    private String gitRefsUrl;
    @SerializedName("trees_url")
    @Expose
    private String treesUrl;
    @SerializedName("statuses_url")
    @Expose
    private String statusesUrl;
    @SerializedName("languages_url")
    @Expose
    private String languagesUrl;
    @SerializedName("stargazers_url")
    @Expose
    private String stargazersUrl;
    @SerializedName("contributors_url")
    @Expose
    private String contributorsUrl;
    @SerializedName("subscribers_url")
    @Expose
    private String subscribersUrl;
    @SerializedName("subscription_url")
    @Expose
    private String subscriptionUrl;
    @SerializedName("commits_url")
    @Expose
    private String commitsUrl;
    @SerializedName("git_commits_url")
    @Expose
    private String gitCommitsUrl;
    @SerializedName("comments_url")
    @Expose
    private String commentsUrl;
    @SerializedName("issue_comment_url")
    @Expose
    private String issueCommentUrl;
    @SerializedName("contents_url")
    @Expose
    private String contentsUrl;
    @SerializedName("compare_url")
    @Expose
    private String compareUrl;
    @SerializedName("merges_url")
    @Expose
    private String mergesUrl;
    @SerializedName("archive_url")
    @Expose
    private String archiveUrl;
    @SerializedName("downloads_url")
    @Expose
    private String downloadsUrl;
    @SerializedName("issues_url")
    @Expose
    private String issuesUrl;
    @SerializedName("pulls_url")
    @Expose
    private String pullsUrl;
    @SerializedName("milestones_url")
    @Expose
    private String milestonesUrl;
    @SerializedName("notifications_url")
    @Expose
    private String notificationsUrl;
    @SerializedName("labels_url")
    @Expose
    private String labelsUrl;
    @SerializedName("releases_url")
    @Expose
    private String releasesUrl;
    @SerializedName("deployments_url")
    @Expose
    private String deploymentsUrl;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("pushed_at")
    @Expose
    private String pushedAt;
    @SerializedName("git_url")
    @Expose
    private String gitUrl;
    @SerializedName("ssh_url")
    @Expose
    private String sshUrl;
    @SerializedName("clone_url")
    @Expose
    private String cloneUrl;
    @SerializedName("svn_url")
    @Expose
    private String svnUrl;
    @SerializedName("homepage")
    @Expose
    private String homepage;
    @SerializedName("size")
    @Expose
    private int size;
    @SerializedName("stargazers_count")
    @Expose
    private int stargazersCount;
    @SerializedName("watchers_count")
    @Expose
    private int watchersCount;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("has_issues")
    @Expose
    private boolean hasIssues;
    @SerializedName("has_projects")
    @Expose
    private boolean hasProjects;
    @SerializedName("has_downloads")
    @Expose
    private boolean hasDownloads;
    @SerializedName("has_wiki")
    @Expose
    private boolean hasWiki;
    @SerializedName("has_pages")
    @Expose
    private boolean hasPages;
    @SerializedName("forks_count")
    @Expose
    private int forksCount;
    @SerializedName("mirror_url")
    @Expose
    private Object mirrorUrl;
    @SerializedName("archived")
    @Expose
    private boolean archived;
    @SerializedName("open_issues_count")
    @Expose
    private int openIssuesCount;
    @SerializedName("license")
    @Expose
    private License license;
    @SerializedName("forks")
    @Expose
    private int forks;
    @SerializedName("open_issues")
    @Expose
    private int openIssues;
    @SerializedName("watchers")
    @Expose
    private int watchers;
    @SerializedName("default_branch")
    @Expose
    private String defaultBranch;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Repo withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Repo withName(String name) {
        this.name = name;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Repo withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Repo withOwner(Owner owner) {
        this.owner = owner;
        return this;
    }

    public boolean isPrivate() {
        return _private;
    }

    public void setPrivate(boolean _private) {
        this._private = _private;
    }

    public Repo withPrivate(boolean _private) {
        this._private = _private;
        return this;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Repo withHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Repo withDescription(String description) {
        this.description = description;
        return this;
    }

    public boolean isFork() {
        return fork;
    }

    public void setFork(boolean fork) {
        this.fork = fork;
    }

    public Repo withFork(boolean fork) {
        this.fork = fork;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Repo withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getForksUrl() {
        return forksUrl;
    }

    public void setForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
    }

    public Repo withForksUrl(String forksUrl) {
        this.forksUrl = forksUrl;
        return this;
    }

    public String getKeysUrl() {
        return keysUrl;
    }

    public void setKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
    }

    public Repo withKeysUrl(String keysUrl) {
        this.keysUrl = keysUrl;
        return this;
    }

    public String getCollaboratorsUrl() {
        return collaboratorsUrl;
    }

    public void setCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
    }

    public Repo withCollaboratorsUrl(String collaboratorsUrl) {
        this.collaboratorsUrl = collaboratorsUrl;
        return this;
    }

    public String getTeamsUrl() {
        return teamsUrl;
    }

    public void setTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
    }

    public Repo withTeamsUrl(String teamsUrl) {
        this.teamsUrl = teamsUrl;
        return this;
    }

    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public Repo withHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    public String getIssueEventsUrl() {
        return issueEventsUrl;
    }

    public void setIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
    }

    public Repo withIssueEventsUrl(String issueEventsUrl) {
        this.issueEventsUrl = issueEventsUrl;
        return this;
    }

    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public Repo withEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    public String getAssigneesUrl() {
        return assigneesUrl;
    }

    public void setAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
    }

    public Repo withAssigneesUrl(String assigneesUrl) {
        this.assigneesUrl = assigneesUrl;
        return this;
    }

    public String getBranchesUrl() {
        return branchesUrl;
    }

    public void setBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
    }

    public Repo withBranchesUrl(String branchesUrl) {
        this.branchesUrl = branchesUrl;
        return this;
    }

    public String getTagsUrl() {
        return tagsUrl;
    }

    public void setTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
    }

    public Repo withTagsUrl(String tagsUrl) {
        this.tagsUrl = tagsUrl;
        return this;
    }

    public String getBlobsUrl() {
        return blobsUrl;
    }

    public void setBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
    }

    public Repo withBlobsUrl(String blobsUrl) {
        this.blobsUrl = blobsUrl;
        return this;
    }

    public String getGitTagsUrl() {
        return gitTagsUrl;
    }

    public void setGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
    }

    public Repo withGitTagsUrl(String gitTagsUrl) {
        this.gitTagsUrl = gitTagsUrl;
        return this;
    }

    public String getGitRefsUrl() {
        return gitRefsUrl;
    }

    public void setGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
    }

    public Repo withGitRefsUrl(String gitRefsUrl) {
        this.gitRefsUrl = gitRefsUrl;
        return this;
    }

    public String getTreesUrl() {
        return treesUrl;
    }

    public void setTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
    }

    public Repo withTreesUrl(String treesUrl) {
        this.treesUrl = treesUrl;
        return this;
    }

    public String getStatusesUrl() {
        return statusesUrl;
    }

    public void setStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
    }

    public Repo withStatusesUrl(String statusesUrl) {
        this.statusesUrl = statusesUrl;
        return this;
    }

    public String getLanguagesUrl() {
        return languagesUrl;
    }

    public void setLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
    }

    public Repo withLanguagesUrl(String languagesUrl) {
        this.languagesUrl = languagesUrl;
        return this;
    }

    public String getStargazersUrl() {
        return stargazersUrl;
    }

    public void setStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
    }

    public Repo withStargazersUrl(String stargazersUrl) {
        this.stargazersUrl = stargazersUrl;
        return this;
    }

    public String getContributorsUrl() {
        return contributorsUrl;
    }

    public void setContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
    }

    public Repo withContributorsUrl(String contributorsUrl) {
        this.contributorsUrl = contributorsUrl;
        return this;
    }

    public String getSubscribersUrl() {
        return subscribersUrl;
    }

    public void setSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
    }

    public Repo withSubscribersUrl(String subscribersUrl) {
        this.subscribersUrl = subscribersUrl;
        return this;
    }

    public String getSubscriptionUrl() {
        return subscriptionUrl;
    }

    public void setSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
    }

    public Repo withSubscriptionUrl(String subscriptionUrl) {
        this.subscriptionUrl = subscriptionUrl;
        return this;
    }

    public String getCommitsUrl() {
        return commitsUrl;
    }

    public void setCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
    }

    public Repo withCommitsUrl(String commitsUrl) {
        this.commitsUrl = commitsUrl;
        return this;
    }

    public String getGitCommitsUrl() {
        return gitCommitsUrl;
    }

    public void setGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
    }

    public Repo withGitCommitsUrl(String gitCommitsUrl) {
        this.gitCommitsUrl = gitCommitsUrl;
        return this;
    }

    public String getCommentsUrl() {
        return commentsUrl;
    }

    public void setCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
    }

    public Repo withCommentsUrl(String commentsUrl) {
        this.commentsUrl = commentsUrl;
        return this;
    }

    public String getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public Repo withIssueCommentUrl(String issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    public String getContentsUrl() {
        return contentsUrl;
    }

    public void setContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
    }

    public Repo withContentsUrl(String contentsUrl) {
        this.contentsUrl = contentsUrl;
        return this;
    }

    public String getCompareUrl() {
        return compareUrl;
    }

    public void setCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
    }

    public Repo withCompareUrl(String compareUrl) {
        this.compareUrl = compareUrl;
        return this;
    }

    public String getMergesUrl() {
        return mergesUrl;
    }

    public void setMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
    }

    public Repo withMergesUrl(String mergesUrl) {
        this.mergesUrl = mergesUrl;
        return this;
    }

    public String getArchiveUrl() {
        return archiveUrl;
    }

    public void setArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
    }

    public Repo withArchiveUrl(String archiveUrl) {
        this.archiveUrl = archiveUrl;
        return this;
    }

    public String getDownloadsUrl() {
        return downloadsUrl;
    }

    public void setDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
    }

    public Repo withDownloadsUrl(String downloadsUrl) {
        this.downloadsUrl = downloadsUrl;
        return this;
    }

    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public Repo withIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    public String getPullsUrl() {
        return pullsUrl;
    }

    public void setPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
    }

    public Repo withPullsUrl(String pullsUrl) {
        this.pullsUrl = pullsUrl;
        return this;
    }

    public String getMilestonesUrl() {
        return milestonesUrl;
    }

    public void setMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
    }

    public Repo withMilestonesUrl(String milestonesUrl) {
        this.milestonesUrl = milestonesUrl;
        return this;
    }

    public String getNotificationsUrl() {
        return notificationsUrl;
    }

    public void setNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
    }

    public Repo withNotificationsUrl(String notificationsUrl) {
        this.notificationsUrl = notificationsUrl;
        return this;
    }

    public String getLabelsUrl() {
        return labelsUrl;
    }

    public void setLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
    }

    public Repo withLabelsUrl(String labelsUrl) {
        this.labelsUrl = labelsUrl;
        return this;
    }

    public String getReleasesUrl() {
        return releasesUrl;
    }

    public void setReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
    }

    public Repo withReleasesUrl(String releasesUrl) {
        this.releasesUrl = releasesUrl;
        return this;
    }

    public String getDeploymentsUrl() {
        return deploymentsUrl;
    }

    public void setDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
    }

    public Repo withDeploymentsUrl(String deploymentsUrl) {
        this.deploymentsUrl = deploymentsUrl;
        return this;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Repo withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Repo withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getPushedAt() {
        return pushedAt;
    }

    public void setPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
    }

    public Repo withPushedAt(String pushedAt) {
        this.pushedAt = pushedAt;
        return this;
    }

    public String getGitUrl() {
        return gitUrl;
    }

    public void setGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
    }

    public Repo withGitUrl(String gitUrl) {
        this.gitUrl = gitUrl;
        return this;
    }

    public String getSshUrl() {
        return sshUrl;
    }

    public void setSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
    }

    public Repo withSshUrl(String sshUrl) {
        this.sshUrl = sshUrl;
        return this;
    }

    public String getCloneUrl() {
        return cloneUrl;
    }

    public void setCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
    }

    public Repo withCloneUrl(String cloneUrl) {
        this.cloneUrl = cloneUrl;
        return this;
    }

    public String getSvnUrl() {
        return svnUrl;
    }

    public void setSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
    }

    public Repo withSvnUrl(String svnUrl) {
        this.svnUrl = svnUrl;
        return this;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Repo withHomepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Repo withSize(int size) {
        this.size = size;
        return this;
    }

    public int getStargazersCount() {
        return stargazersCount;
    }

    public void setStargazersCount(int stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public Repo withStargazersCount(int stargazersCount) {
        this.stargazersCount = stargazersCount;
        return this;
    }

    public int getWatchersCount() {
        return watchersCount;
    }

    public void setWatchersCount(int watchersCount) {
        this.watchersCount = watchersCount;
    }

    public Repo withWatchersCount(int watchersCount) {
        this.watchersCount = watchersCount;
        return this;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Repo withLanguage(String language) {
        this.language = language;
        return this;
    }

    public boolean isHasIssues() {
        return hasIssues;
    }

    public void setHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
    }

    public Repo withHasIssues(boolean hasIssues) {
        this.hasIssues = hasIssues;
        return this;
    }

    public boolean isHasProjects() {
        return hasProjects;
    }

    public void setHasProjects(boolean hasProjects) {
        this.hasProjects = hasProjects;
    }

    public Repo withHasProjects(boolean hasProjects) {
        this.hasProjects = hasProjects;
        return this;
    }

    public boolean isHasDownloads() {
        return hasDownloads;
    }

    public void setHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
    }

    public Repo withHasDownloads(boolean hasDownloads) {
        this.hasDownloads = hasDownloads;
        return this;
    }

    public boolean isHasWiki() {
        return hasWiki;
    }

    public void setHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
    }

    public Repo withHasWiki(boolean hasWiki) {
        this.hasWiki = hasWiki;
        return this;
    }

    public boolean isHasPages() {
        return hasPages;
    }

    public void setHasPages(boolean hasPages) {
        this.hasPages = hasPages;
    }

    public Repo withHasPages(boolean hasPages) {
        this.hasPages = hasPages;
        return this;
    }

    public int getForksCount() {
        return forksCount;
    }

    public void setForksCount(int forksCount) {
        this.forksCount = forksCount;
    }

    public Repo withForksCount(int forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    public Object getMirrorUrl() {
        return mirrorUrl;
    }

    public void setMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
    }

    public Repo withMirrorUrl(Object mirrorUrl) {
        this.mirrorUrl = mirrorUrl;
        return this;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public Repo withArchived(boolean archived) {
        this.archived = archived;
        return this;
    }

    public int getOpenIssuesCount() {
        return openIssuesCount;
    }

    public void setOpenIssuesCount(int openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
    }

    public Repo withOpenIssuesCount(int openIssuesCount) {
        this.openIssuesCount = openIssuesCount;
        return this;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Repo withLicense(License license) {
        this.license = license;
        return this;
    }

    public int getForks() {
        return forks;
    }

    public void setForks(int forks) {
        this.forks = forks;
    }

    public Repo withForks(int forks) {
        this.forks = forks;
        return this;
    }

    public int getOpenIssues() {
        return openIssues;
    }

    public void setOpenIssues(int openIssues) {
        this.openIssues = openIssues;
    }

    public Repo withOpenIssues(int openIssues) {
        this.openIssues = openIssues;
        return this;
    }

    public int getWatchers() {
        return watchers;
    }

    public void setWatchers(int watchers) {
        this.watchers = watchers;
    }

    public Repo withWatchers(int watchers) {
        this.watchers = watchers;
        return this;
    }

    public String getDefaultBranch() {
        return defaultBranch;
    }

    public void setDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
    }

    public Repo withDefaultBranch(String defaultBranch) {
        this.defaultBranch = defaultBranch;
        return this;
    }

}
