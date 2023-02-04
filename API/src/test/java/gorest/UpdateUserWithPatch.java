package gorest;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UpdateUserWithPatch {
	
	/**We have to change status from active to inactive*/
	
/**{
"name": "XXXXX"
}
1. Submit a PATCH request and receive a response.
2. Validate response data is not null.
3. Validate response status code is 200.
4. Validate response content type is JSON.*/
	
	
	@Test
	public void UpdateUserWithPatch() {
		
		/*ID-ye diqqet ele*/
		
		String url ="https://gorest.co.in/public/v1/users/5779";
		String requestData ="{\"name\": \"XXXXX\"}";
		
		
		Response response = given()
								.header("Authorization","Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
								.contentType(ContentType.JSON)
								.body(requestData)
							.when()
								.patch(url);
							
		
		response.prettyPrint();
		

		
		
		
		/**Validate response data is not null.*/
		assertNotNull(response);
		
		
		/**Validate response status code is 200.*/
		int statusCode = response.getStatusCode();
		response.then().statusCode(200);
	
		System.out.println("Status code is: "+ statusCode);
		
		/**Validate response content type is JSON*/
		
		response.then().contentType(ContentType.JSON);

		
	}
	
	
	
	
	
	

}
