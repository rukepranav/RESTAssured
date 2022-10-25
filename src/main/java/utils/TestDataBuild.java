package utils;


import pojo.Cowin.Person;
import pojo.GitHub.Repository;

public class TestDataBuild {

	
	public Person addPersonPayLoad(String mobile)
	{
		Person data =new Person();
		data.setmobile(mobile);
		return data;
	}
	
	public Repository addRepoPayLoad(String name, String description)
	{
		Repository r =new Repository();
		r.setName(name);
		r.setDescription(description);
		return r;
	}
	
}
