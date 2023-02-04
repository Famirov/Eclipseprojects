
package gorest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test; 
//staticly imported given method so that we don't have to write RestAssured Class
// we get the token from gorest.co.in
/*given() is a static method so invoke it we need to call it with the class name.
 * However, we can use static import to make our life easier and
 *  not to use class name everytime when we will use it
 * And we will use it a lot.
 * syntax: import static io.restassured.RestAssured.given; */

/*The response of a request made by REST Assured. Response is a class*/
/*resp is a variable name that i assigned.*/
/*prettyPrint() method will response the body and return it to us as a String*/

public class Userlist {
	
	@Ignore@Test
	public void getUserList() {
		
		
		String url ="https://gorest.co.in/public/v1/users";
		
		Response resp = given()
							// param("ParamKey", "ParamValue")
							.param("gender", "female")
							.param("status", "active")
							.header("key", "value")//---> authorization
							.body("data")
					
						.when().get(url);
		
//		System.out.println("Status code is: " + resp.getStatusCode());
		
		assertEquals(200,resp.getStatusCode());
		

//		resp.then().contentType("application/json");
		/*it comes from the Header part of the Postman and ParamValue of the Get method
		 *  which derived the data from https://gorest.co.in/public/v1/users (edited) */
//		resp.prettyPrint();// to get json body
		
		
//		resp.then().extract().path("meta.pagination.page");
		
		System.out.println(resp.then().extract().path("meta.pagination.page"));
		
	
	}
	/**Module 2 Day6 explanation 12.10.2022*/
	 @Test
	/*Find only active users and validate it*/
	public void getUserListActive() {
		
		String url ="https://gorest.co.in/public/v1/users";
		
		Response resp = given()
							// param("ParamKey", "ParamValue")
							
//							.param("status", "active")
						
					
						.when().get(url);
		
		
		//Validation each value of JSON response 
		//( when we get the response we need to check Status code and data format)
		// We will get same result like in Postman
		// We will use assertEquals
		// Assertions are used to validate actual response against expected response in our test cases
		int total = resp.then().extract().path("meta.pagination.total");
		System.out.println(total);
		assertEquals(2000, total);
		int pages = resp.then().extract().path("meta.pagination.pages");
		System.out.println(pages);
		assertEquals(200, pages);
		int page = resp.then().extract().path("meta.pagination.page");
		System.out.println(page);
		assertEquals(1, page);
		int limit = resp.then().extract().path("meta.pagination.limit");
		System.out.println(limit);
		assertEquals(10, limit);
		
		
		
		
		
		// Validate the content type
//		resp.then().contentType(ContentType.JSON);
//		resp.then().contentType("application/json");
		
		//statusCode --> validate status code
//		resp.then().statusCode(200);
		
		//getStatusCode()--> return int value, no validation
//		int statusCode = resp.getStatusCode();
//		System.out.println(statusCode);
//		assertEquals(200, resp.getStatusCode());
		
		//validate status code
//		//1
//		resp.then().statusCode(200);
//		//2
//		assertEquals(200, resp.getStatusCode());
		
		

//		resp.prettyPrint();// to get json body
//		System.out.println("Status code is: " + resp.getStatusCode());
//		assertEquals(200,resp.getStatusCode());
//		
		
		//asString--> convert response to String
//				String result= 	resp.asString();
//				System.out.println(result);
				
				
		//asPrettyString-- > convert response to a String in readable format
//				String result= resp.asPrettyString();
//				System.out.println(result);
		
				
		//prettyPrint()--> convert response to String and prints JSON data.
//		String result= resp.prettyPrint();
		
		
		
		
				
		
		
	}
	

}
