package gorest;

import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import org.junit.Test;
public class DeleteUser {
	
/**
 URL: https://gorest.co.in/public/v1/users/ID


1. Submit a DELETE request and receive a response.
2. Print the JSON response.
3. Validate response status code is 204.
 */	
	@Test
	public void DeleteUser() {
		
		String url ="https://gorest.co.in/public/v1/users/3802";
		
		Response response = given()
								.header("Authorization","Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
							.when()
								.delete(url);
		
		/*Print the JSON response.*/
		response.prettyPrint();
		
		/*Validate response status code is 204.*/
		/*I did it in dynamic way instead of writing 204 */
		int statusCode = response.getStatusCode();
		response.then().statusCode(204);
		
		System.out.println(statusCode);
		
		
	}

}
