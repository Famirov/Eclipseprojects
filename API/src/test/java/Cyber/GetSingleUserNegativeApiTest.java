package Cyber;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.restassured.response.Response;

public class GetSingleUserNegativeApiTest {
	
	/**When Send get request to API Endpoint
	 * "Response response = RestAssured.get(url);"
	 * Then Response status code should be 404
	 * And Response body should contain {}*/
	
	
	@Test
	public void get_single_user_negative_api_test() {
	
	String url = "https://reqres.in/api/users";
	
		
	Response response = RestAssured.get(url);
	
	
	response = given().
			when().get(url + "/20"); /**We are trying to GET non existing user */
	
	System.out.println("Status code = " + response.statusCode());
	
	assertEquals(404,response.statusCode());
	
	//response.prettyPeek();
	
	System.out.println("JSON Body = " + response.asString());
	
	
	}

}
