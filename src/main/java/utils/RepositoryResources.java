package utils;

public enum RepositoryResources {

	CreateRepository("/user/repos");
//	GetRepoAPI("/repos/{owner}/{repo}");
//	UpdateRepoAPI("/repos/{owner}/{repo}");
//	DeleteRepoAPI("/repos/{owner}/{repo}");
	
	private String resource;
	
	RepositoryResources(String resource)
	{
		this.resource=resource;
	}
	
	public String getResource()
	{
		return resource;
	}
	


}
