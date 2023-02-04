package mealB;

public class MealBReusableMethods {
	
	private final String tokenURL= "http://dev-mb.yoll.io/api/tokenauth/authenticate";
	private final String userName="mealbemp1";
	private final String password= "Test123!";
	
	public String generateToken() {

		//Submit POST request to Token API
		String reqData= createTokenRequestData();
		Response response = given()
								.body(reqData)
								.contentType(ContentType.JSON)
				.when()
				.post(tokenURL);
		
		return response.prettyPrint();
		
	}
		//method for token
		public String createTokenRequestData() {
		//Create Token request payload
		MealBTokenRequestBuilder tokenObj= new MealBTokenRequestBuilder();
		tokenObj.setUsernameOrEmailAddress(userName);
		tokenObj.setPassword(password);
		
		//convert it to string
		String payload= convertObjectToString(tokenObj);
		
		//print
		System.out.println(payload);
		return payload;
		
		
				
		}
	
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
	

}
