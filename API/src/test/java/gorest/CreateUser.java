package gorest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class CreateUser {

	@Test
	public void createNewUser() {

		String url = "https://gorest.co.in/public/v1/users";
		
		// We don't take id because it will be provided automatically
		String requestData = "{\r\n"
				+ "           \r\n"
				+ "            \"name\": \"Farhad Amirbayli\",\r\n"
				+ "            \"email\": \"amirbeylli@gmail.com\",\r\n"
				+ "            \"gender\": \"male\",\r\n"
				+ "            \"status\": \"active\"\r\n"
				+ "        }";
		
		Response response = given()
				.header("Authorization", "Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
//				.header("Content-Type", "application/json")
				.contentType(ContentType.JSON)
				.body(requestData)
				.when().post(url);
		
		response.prettyPrint();
		
		assertEquals(201, response.getStatusCode());
		response.then().statusCode(201);
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);

	}

}
