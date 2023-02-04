package utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import serialization.GorestRequestBuilder;
import static io.restassured.RestAssured.given;

public class ReusableMethods {
	
private static String url="https://gorest.co.in/public/v1/users";
	
	/**
	 * @author 
	 * @param name
	 * @param email
	 * @param gender
	 * @param status
	 * @return
	 * @see create request data
	 */

		public static String createRequestData(String name, String email, String gender, String status) {
		GorestRequestBuilder reqObj = new GorestRequestBuilder();
		reqObj.setName(name);
		reqObj.setEmail(email);
		reqObj.setGender(gender);
		reqObj.setStatus(status);
		
		String requestData= convertObjectToString(reqObj);
		return requestData;		
	}
		
		/**
		 * 
		 * @param object
		 * @return 
		 * @see convert request data to String
		 */
		public static String convertObjectToString(Object object)  {
			 String stringRequest=null;
			 ObjectMapper mapper=new ObjectMapper();		 
				  try {
					stringRequest=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(object);
				} catch (JsonProcessingException e) {
					
					e.printStackTrace();
				}
			
			  return stringRequest;
		}
		public static Response createGorestUser(String requestData) {
			
			//create new user with POST request
			Response response = given()
										.header("Authorization", "Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
										.body(requestData)
										.contentType(ContentType.JSON)
									.when()
									 .post(url);
			
					response.prettyPrint();
					return response;
					
		}
		

		//Retrieve new user is created by GET call (ID)
		public static Response getGoRestUserByID(int recordID) {
					Response getResponse= given()
											.header("Authorization", "Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
										  .when()
										  		.get(url+ "/" +recordID);
					
					
					
					getResponse.prettyPrint();
					return getResponse;
			
		}
		

		//3
		public static Response updateGorestUser(String requestData, int recordID) {

			Response putResponse= given()
									.header("Authorization", "Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
									.body(requestData)
									.contentType(ContentType.JSON)
								.when()
									.put(url+ "/" +recordID);
			
			
			
			putResponse.prettyPrint();
			return putResponse;
			
		}
	//5
	public static Response deleteGoRestUser(int recordID) {
		Response deleteResponse = given()
				.header("Authorization", "Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
			.when()
				.delete(url+ "/" + recordID);
		
		return deleteResponse;
	}

	

}
