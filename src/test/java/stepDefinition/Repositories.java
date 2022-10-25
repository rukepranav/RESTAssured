package stepDefinition;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import utils.RepositoryResources;
import utils.TestDataBuild;
import utils.Utils;


public class Repositories extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data =new TestDataBuild();
	
	@Given("new repository details with {string} {string} are available")
	public void new_repository_details_with_are_available(String name, String description) throws IOException {
	    // Write code here that turns the phrase above into concrete actions

		 res=given().spec(githubRequests())
		.body(data.addRepoPayLoad(name, description));
	    
	}
	@When("{string} with {string} HTTPS request is called")
	public void with_https_request_is_called(String resource, String method) {
	    // Write code here that turns the phrase above into concrete actions
		RepositoryResources resourceAPI=RepositoryResources.valueOf(resource);
		//System.out.println(res);

		resspec =new ResponseSpecBuilder().expectStatusCode(201).expectContentType(ContentType.JSON).build();
		
		if(method.equalsIgnoreCase("POST"))
			response =res.when().post(resourceAPI.getResource());
		//else if(method.equalsIgnoreCase("GET"))
		//	 response =res.when().get(resourceAPI.getResource());
	}
	
	@Then("response status code {string}")
	public void response_status_code(String response_code) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(response.getStatusCode(),Integer.parseInt(response_code));
	}
	
	@Then("{string} in response body is {string}")
	public void in_response_body_is(String keyValue, String Expectedvalue) {
	    // Write code here that turns the phrase above into concrete actions
	  
	 assertEquals(getJsonPath(response,keyValue),Expectedvalue);
	}
	
	@Then("Save repository ID")
	public void save_repository_id() {
	    // Write code here that turns the phrase above into concrete actions
		String repo_id = getJsonPath(response,"id").toString();
		System.out.println("Repo ID = "+ repo_id);
	}

}
