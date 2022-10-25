package stepDefinition;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import pojo.Cowin.Person;
import utils.CowinResource;
import utils.TestDataBuild;
import utils.Utils;

public class CoWin extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data =new TestDataBuild();
	Person p =new Person();
	String hp;
	
	@Given("Data {string} and {string} is present")
	public void data_and_is_present(String pincode, String date) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		res=given().spec(cowinRequests())
				.queryParam("pincode", pincode)
				.queryParam("date", date);
	    
	}
	@When("user calls {string} with {string} http request")
	public void user_calls_with_http_request(String resource, String method) {
	    // Write code here that turns the phrase above into concrete actions
		CowinResource resourceAPI=CowinResource.valueOf(resource);
		System.out.println(resourceAPI.getResource());
		
		
		resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(resource.equalsIgnoreCase("GenerateOTP"))
		 response =res.when().post(resourceAPI.getResource());
		else if(resource.equalsIgnoreCase(resource))
			 response =res.when().get(resourceAPI.getResource());

	}
	@Then("the API call got success with status code {string}")
	public void the_api_call_got_success_with_status_code(String response_code) {
	    // Write code here that turns the phrase above into concrete actions
		assertEquals(response.getStatusCode(),Integer.parseInt(response_code));
	}
	@Then("verify first hospital is {string} hospital")
	public void verify_first_hospital_is_hospital(String hospital) {
	    // Write code here that turns the phrase above into concrete actions
		//ResponseSessions[] sessions = getJsoncls(response);
		//System.out.println(response.asString());
		
		hp=getJsonPath(response,"sessions[0].name");
		assertEquals(hp,hospital);
		System.out.println(hp);
	}
	
	@Given("Add Payload with {string}")
	public void add_payload_with(String mobile) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		res=given().spec(cowinRequests())
				.body(data.addPersonPayLoad(mobile));
	}


}
