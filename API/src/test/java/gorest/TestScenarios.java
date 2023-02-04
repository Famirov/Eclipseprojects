package gorest;

import org.junit.Ignore;
import org.junit.Test;

import com.jayway.jsonpath.JsonPath;

import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class TestScenarios {
	
	//Validate the Gender 
	
	@Test @Ignore
	public void validateGender() {
		
		String url = "https://gorest.co.in/public/v1/users?page=2";
		
		Response response = given()
								.param("gender", "female")
								.header("Authorization","Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
							.when().get(url);		
		
		response.prettyPrint();
		
		JsonPath.read(response.asString(),"$.data[*].gender");
		
		List<String>genderList = new ArrayList();
		
		System.out.println(genderList);
		
		for( String eachValue : genderList) {
			
			assertEquals("female", eachValue);
			
		}	
		
		
	}
	//validate the status
	@Test @Ignore
	public void validateStatus() {
		
		String url = "https://gorest.co.in/public/v1/users?page=2";
		
		Response response = given()
				.param("status", "active")
				.header("Authorization","Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
			.when().get(url);		

		
		String strResponse = response.prettyPrint();
		
		List<String>statusList = JsonPath.read(strResponse,"$.data[*].status");
		
		for(String eachValue : statusList) {
			
			assertEquals("active",eachValue);
			
		}
		
		
	}
	
	//We validate total female and actives
	
	@Test @Ignore
	public void validateTotalFemaleUsers() {
		
		String url = "https://gorest.co.in/public/v1/users?page=2";
		
		Response response = given()
								.param("gender", "female")
								.param("status", "active")
							.when().get(url);
		
		 String strResponse = response.prettyPrint();
		 int totalFemaleUsers = JsonPath.read(strResponse,"$.meta.pagination.total");
		 System.out.println(totalFemaleUsers);
		 
		 
		 // get the name of 1st user
		 String userName = JsonPath.read(strResponse, "$.data[0].name");
		 System.out.println(userName);
		 
		 
		 //get users info
		 List<Map<String,Object>> allUsersMap = JsonPath.read(strResponse,"$.data[*]");
		 
		 for(Map<String, Object> map : allUsersMap) {
			 
			
				 
			 System.out.println(map);
			
		 }
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
