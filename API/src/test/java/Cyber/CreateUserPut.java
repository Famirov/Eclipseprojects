package Cyber;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.junit.Test;

public class CreateUserPut {
	
	@Test
	public void CreateUser() {
		
		String url = "https://gorest.co.in/public/v1/users";
		
		String requestData = "{\r\n"
				+ "           \r\n"
				+ "            \"name\": \"Dery Abb\",\r\n"
				+ "            \"email\": \"abbb@gmail.com\",\r\n"
				+ "            \"gender\": \"female\",\r\n"
				+ "            \"status\": \"active\"\r\n"
				+ "        }";
		
		Response response = RestAssured.get(url);
		
		response = given()
				     .header("Authorization", "Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
				     .contentType(ContentType.JSON)
				     .body(requestData)
				     .when().post(url);
		
		response.prettyPrint();
		
		response.then().statusCode(201);
		
		
		
	}

}
