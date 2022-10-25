package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class Utils {

	public static RequestSpecification reqcowin;
	public static RequestSpecification reqrepo;
	public RequestSpecification cowinRequests() throws IOException
	{
		
		if(reqcowin==null)
		{
		PrintStream log1 =new PrintStream(new FileOutputStream("cowinlogs.txt"));
		reqcowin=new RequestSpecBuilder().setBaseUri(getGlobalValue("CoWin_baseUrl"))
				 .addHeader("Accept", "application/json")
				 .addHeader("Accept-Language", "hi_IN")
				 .addFilter(RequestLoggingFilter.logRequestTo(log1))
				 .addFilter(ResponseLoggingFilter.logResponseTo(log1))
		.setContentType(ContentType.JSON).build();
		 return reqcowin;
		}
		return reqcowin;
		
		
	}
	
	public RequestSpecification githubRequests() throws IOException
	{
		String baseUrl1 = getGlobalValue("GitHub_baseUrl");
		String Authorization = "Bearer " + getGlobalValue("GitHub_access_token");
		//System.out.println(baseUrl1+Authorization);
		
		if(reqrepo==null)
		{
		PrintStream log =new PrintStream(new FileOutputStream("githublogs.txt"));
		reqrepo=new RequestSpecBuilder().setBaseUri(baseUrl1)
				 .addHeader("Accept", "application/vnd.github+json")
				 .addHeader("Authorization", Authorization)
				 .addFilter(RequestLoggingFilter.logRequestTo(log))
				 .addFilter(ResponseLoggingFilter.logResponseTo(log))
		.setContentType(ContentType.JSON).build();
		
		 return reqrepo;
		}
		return reqrepo;
		
		
	}
	

	
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream("./src/test/java/resources/global.properties");
		prop.load(fis);
		return prop.getProperty(key);
	
		
		
	}
	
	
	public String getJsonPath(Response response,String key)
	{
		  String resp=response.asString();
		JsonPath   js = new JsonPath(resp);
		return js.get(key).toString();
	}
	
	
}
