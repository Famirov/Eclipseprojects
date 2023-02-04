package gorest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.JsonPath;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import serialization.GorestRequestBuilder;
import utils.ReusableMethods;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.given;


public class End2EndScenario {
	
	@Test
	public void testEnd2EndScenario() throws JsonProcessingException {
		
		/*
		 * 1. Create a GorestUser with POST method
		 * 2. Validate new User is created by GET with ID.
		 * 3. Update user name and Status with PUT method
		 * 4. Validate new user is updated by GET with ID.
		 * 5. Delete user by DELETE method.
		 * 6. Validate user is deleted by GET by with ID.
		 */

		//1. Create a GorestUser with POST method
				String url= "https://gorest.co.in/public/v1/users";
			
				String strReqData= ReusableMethods.createRequestData("Cohort 9 Titans T"
															,"apitestetik@cohort9.com","male","active");
				
				Response postRequest= ReusableMethods.createGorestUser(strReqData);
				
				//validation
				assertEquals(201, postRequest.getStatusCode());
				
				//retrieve record ID from response
				int recordID= JsonPath.read(postRequest.asString(), "$.data.id");
				
				Response getResponse= ReusableMethods.getGoRestUserByID(recordID);
				
				//validation
				assertEquals(200,getResponse.getStatusCode());
				
				//3. Update user name and Status with PUT method
				
				String strReqDataUpdate= ReusableMethods.createRequestData("Cohort 9 Titans is the best"
																			, "apititani9@cohort.com", "male", "inactive");
				
				Response putResponse= ReusableMethods.updateGorestUser(strReqDataUpdate, recordID);
				
				assertEquals(200, putResponse.getStatusCode());
				
				//4. Validate new user is updated by GET with ID.
				Response getResponse2= ReusableMethods.getGoRestUserByID(recordID);
						
				//validation
				assertEquals(200,getResponse2.getStatusCode());
				
				//validate update name
				String name =JsonPath.read(getResponse2.asString(), "$.data.name");
				assertEquals("Cohort 9 Titans is the best", name);
						
				//5. Delete user by DELETE method.
				Response deleteResponse= ReusableMethods.deleteGoRestUser(recordID);
				
				//validation
				assertEquals(204,deleteResponse.getStatusCode());
				
				//6. Validate user is deleted by GET by with ID.
				Response getResponse3= ReusableMethods.getGoRestUserByID(recordID);
				
				//validation
				assertEquals(404, getResponse3.getStatusCode());
				
				//get error message
				String errorMessage = JsonPath.read(getResponse3.asString(), "$.data.message");
				
				//validate error message
				assertEquals("Resource not found", errorMessage);
		
		
		
	}
	

}
