package serialization;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class CreateUserFromObject {
	
	//1. Create a JSON data from OBJECT
	//2. Convert Obj to String () and print the String
	//3. Submit the post request
	//4. Validate the status code
	
	@Test
	public void createUserFromJavaObject() throws JsonProcessingException {
		
		
		//1. Create a JSON data from object to get the private variables from GorestRequestBuilder
		
		GorestRequestBuilder reqObj	 = new GorestRequestBuilder();
		
		reqObj.setName("Cohort #9 Titans");
		reqObj.setEmail("cohort911@yoll.io");
		reqObj.setGender("male");
		reqObj.setStatus("active");
		
		
		//2. Convert Obj to String () and print the String
		
		ObjectMapper mapper = new ObjectMapper();
		
		String requestData = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(reqObj);
		
		System.out.println(requestData);
		
		
		//3. Submit the post request
		
		String url = "https://gorest.co.in/public/v1/users";
		
		Response response = given()
								.header("Authorization", "Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
								.body(requestData)
								.contentType(ContentType.JSON)
							.when()
							.post(url);
		
		
		
		//4. Validate the status code
		
		assertEquals(201, response.getStatusCode());
		
		// 5.  After that I can manually do the get request in Postman to visualize it.
		
		//POSTMANA gir bax vesselam
		
	}

}
