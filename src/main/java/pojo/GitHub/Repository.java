package pojo.GitHub;

public class Repository {

	private String name;
	private String description;
	private String homepage;
	private Boolean is_private;
	private Boolean has_issues;
	private Boolean has_projects;
	private Boolean has_wiki;
	private int team_id;
	private Boolean auto_init;
	private String gitignore_template;
	private String license_template;
	private Boolean allow_squash_merge;
	private Boolean allow_merge_commit;
	private Boolean allow_rebase_merge;
	private Boolean allow_auto_merge;
	private Boolean delete_branch_on_merge;
	private String squash_merge_commit_title;
	private String squash_merge_commit_message;
	private String merge_commit_title;
	private String merge_commit_message;
	private Boolean has_downloads;
	private Boolean is_template;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getHomepage() {
		return homepage;
	}
	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}
	
	public Boolean getIsPrivate() {
		return is_private;
	}
	public void setIsPrivate(Boolean is_private) {
		this.is_private = is_private;
	}
	
	public Boolean getHasIssues() {
		return has_issues;
	}
	public void setHasIssues(Boolean has_issues) {
		this.has_issues = has_issues;
	}
	
	public Boolean getHasProjects() {
		return has_projects;
	}
	public void setHasProjects(Boolean has_projects) {
		this.has_projects = has_projects;
	}
	public Boolean getHasWiki() {
		return has_wiki;
	}
	public void setHasWiki(Boolean has_wiki) {
		this.has_wiki = has_wiki;
	}
	
	public int getTeamId() {
		return team_id;
	}
	public void setTeamId(int team_id) {
		this.team_id = team_id;
	}
	
	public Boolean getAutoInit() {
		return auto_init;
	}
	public void setAutoInit(Boolean auto_init) {
		this.auto_init = auto_init;
	}
	
	public String getGitIgnoreTemplate() {
		return gitignore_template;
	}
	public void setGitIgnoreTemplate(String gitignore_template) {
		this.gitignore_template = gitignore_template;
	}
	public String getLicenseTemplate() {
		return license_template;
	}
	public void setLicenseTemplate(String license_template) {
		this.license_template = license_template;
	}
	
	public Boolean getAllowSquashMerge() {
		return allow_squash_merge;
	}
	public void setAllowSquashMerge(Boolean allow_squash_merge) {
		this.allow_squash_merge = allow_squash_merge;
	}
	
	public Boolean getAllowMergeCommit() {
		return allow_merge_commit;
	}
	public void setAllowMergeCommit(Boolean allow_merge_commit) {
		this.allow_merge_commit = allow_merge_commit;
	}
	
	public Boolean getAllowRebaseMerge() {
		return allow_rebase_merge;
	}
	public void setAllowRebaseMerge(Boolean allow_rebase_merge) {
		this.allow_rebase_merge = allow_rebase_merge;
	}
	public Boolean getAllowAutoMerge() {
		return allow_auto_merge;
	}
	public void setAllowAutoMerge(Boolean allow_auto_merge) {
		this.allow_auto_merge = allow_auto_merge;
	}
	public Boolean getDeleteBranchMerge() {
		return delete_branch_on_merge;
	}
	public void setDeleteBranchMerge(Boolean delete_branch_on_merge) {
		this.delete_branch_on_merge = delete_branch_on_merge;
	}

	public String getSquashMergeCommitTitle() {
		return squash_merge_commit_title;
	}
	public void setSquashMergeCommitTitle(String squash_merge_commit_title) {
		this.squash_merge_commit_title = squash_merge_commit_title;
	}

	public String getSquashMergeCommitMessage() {
		return squash_merge_commit_message;
	}
	public void setSquashMergeCommitMessage(String squash_merge_commit_message) {
		this.squash_merge_commit_message = squash_merge_commit_message;
	}
	public String getMergeCommitTitle() {
		return merge_commit_title;
	}
	public void setMergeCommitTitle(String merge_commit_title) {
		this.merge_commit_title = merge_commit_title;
	}

	public String getMergeCommitMessage() {
		return merge_commit_message;
	}
	public void setMergeCommitMessage(String merge_commit_message) {
		this.merge_commit_message = merge_commit_message;
	}

	public Boolean getIsTemplate() {
		return is_template;
	}
	public void setIsTemplate(Boolean is_template) {
		this.is_template = is_template;
	}
	
	public Boolean getHasDownloads() {
		return has_downloads;
	}
	public void setHasDownloads(Boolean has_downloads) {
		this.has_downloads = has_downloads;
	}
	

}
