package Testing;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.List;

import org.testng.annotations.Test;

import ServiceDemo.BaseConfiguration;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;



public class Employee {
	
	BaseConfiguration bs=new BaseConfiguration();
	
	static int count=0;
	
	@Test
	public  void getEmployees() throws IOException
	{
		
		
		
		RestAssured.baseURI=bs.getHosturl("host");
		
		
		Response response=RestAssured.given()
							
				
				
				.get("/competitions");
		
		//String s=response.toString();
		
		System.out.println(response.prettyPrint());
		
		AssertJUnit.assertEquals(200, response.getStatusCode());
		
		//System.out.println(response.getStatusCode());
		
		JsonPath path=response.jsonPath();
		JsonPath path1=response.jsonPath();
		List comp=path.getList("competitions.area.name") ;
		
		List qual=path.getList("competitions.plan");
		
		
		for (Object object : comp) {
			
			System.out.println(object);
		}
		
for (Object object : qual) {
			
	
			if(object.equals("TIER_ONE"))
			{
				count++;
			}
			
			
		}
		
System.out.println(count);
		
		
		
		
	}
	
	

}
