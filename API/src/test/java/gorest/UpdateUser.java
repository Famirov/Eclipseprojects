package gorest;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateUser {
	
	// need to update:
	// add ID
	// change status code
	// change method name
	// change method to PUT()
	// change smth in the body
	
	@Test
	public void updateUser() {// we change the method name to updateUser
		
		// we added our id at the end of the url
		String url = "https://gorest.co.in/public/v1/users/3154";
		
		// we change active to inactive, just status
		String requestData = "{\r\n"
				+ "           \r\n"
				+ "            \"name\": \"Farhad Amirbayli\",\r\n"
				+ "            \"email\": \"amirbeylli@gmail.com\",\r\n"
				+ "            \"gender\": \"male\",\r\n"
				+ "            \"status\": \"inactive\"\r\n"
				+ "        }";
		
		// change post() method at the end top put() method
		Response response = given()
				.header("Authorization", "Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
//				.header("Content-Type", "application/json")
				.contentType(ContentType.JSON)
				.body(requestData)
				.when().put(url);
		
		response.prettyPrint();
		
		// we need to update our status code to 200
		assertEquals(200, response.getStatusCode());
		response.then().statusCode(200);
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

	}


}
