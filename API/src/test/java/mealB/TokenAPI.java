package mealB;

import org.junit.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class TokenAPI {
	
	@Test
	public void testToken() {
		
		String url = "http://dev-mb.yoll.io/api/tokenauth/authenticate";
		
		//Create Token request payload
		
		MealBTokenRequestBuilder tokenObj = new MealBTokenRequestBuilder();

	
		Response response = given().
								body("").
								contentType(ContentType.JSON).
								when().
							post(url);
		
	}

}
