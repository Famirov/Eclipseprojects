package Cyber;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import junit.Assertions;


import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class getSingleUserApiTest {
	
	/**
	 * 	When User Sends get request to API Endpoint:
	 *  "https://reqres.in/api/users/5"
	 *  Then Response status code should be 200
	 *  Validate response content type is JSON
	 *  And Response body should contain user info "Charles"
	 *  
	 *  
	 * **/
//	@DisplayName("GET single user")
	@Test @Ignore
	public void getSingleUserApiTest() {
		
		String url ="https://reqres.in/api/users/5";
		
		String requestData = "    \"data\": {\r\n"
						+ "        \"email\": \"charles.morris@reqres.in\",\r\n"
						+ "        \"first_name\": \"Charles\",\r\n"
						+ "        \"last_name\": \"Morris\",\r\n"
						+ "        \"avatar\": \"https://reqres.in/img/faces/5-image.jpg\"\r\n"
						+ "    },";
		
		Response response = given()
									.header("Authorization","Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
//									.contentType(ContentType.JSON)
									.body(requestData)
							.when().get(url);
		
		
		response.prettyPrint();
		
		System.out.println("Response Code = " + response.statusCode());
		
		int statusCode = response.statusCode();
		
		response.then().statusCode(200);
		
		System.out.println(statusCode);
		

		
		response.then().contentType(ContentType.JSON);
		
		assertTrue(response.asString().contains("Charles"));
		
		
		
	}
	

	
	
	String url ="https://reqres.in/api/users";
	
	
	@Test
	public void getSingleUserApiTest2() {
		
	
		
		Response response = RestAssured.get(url);
		
		response = given()
						.when().get(url +"/5");/** "/5"--> path parameter */
				
		
		response.prettyPrint();
		
		response.then().statusCode(200);/*statusCode(200)--> validate the status code we can't validate it with getStatusCode()*/
		
		assertTrue(response.asString().contains("Charles"));
				
		/**Validate response content type is JSON ---> These are two way to validate the content type*/
		
		response.then().contentType(ContentType.JSON);
		assertTrue(response.contentType().contains("application/json"));
		
		
		
	}
	
}
