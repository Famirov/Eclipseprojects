package FunctionsOfFiles;

import java.io.File;
import java.io.IOException;
import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import io.restassured.response.Response;

public class ReadWrite {
	
	//1- Read Request Data file and assign it to a String Variable
	//2- Submit POST request to GoRest API
	//3- Write response to a responseData file 
	
	@Test
	public void testReadWrite() throws IOException {
		
		//1
		
		String requestFilePath =  "src/test/resources/testData/requestData.json";
		
		File reqFile = new File(requestFilePath);
		
		FileUtils.readFileToString(reqFile);
		
		String reqData = FileUtils.readFileToString(reqFile);
		
		//2
		
		String url = "https://gorest.co.in/public/v2/users";
		
		Response response = given()
						.header("Authorization","Bearer cc0b44869d31f6a8846ff757567c511685a678a3cd7b907d53c84acfbb239005")
								.body(reqData)
					.when().post("url");
		
		//print
		response.prettyPrint();
		
		//validate status code with restAssured
		response.then().statusCode(201);
		
		// validate status code with JUnit
		assertEquals(201,response.getStatusCode());
		
		
		//3
		String responseFilePath = "src/test/resources/testData/responseData.json";
		File respFile = new File(responseFilePath);
		
		//write response data to file
		FileUtils.writeStringToFile(respFile, response.asPrettyString());
		
		
		//schema validation
		response.then().assertThat().body(matchesJsonSchemaInClasspath("testData/newSchema.json"));
		
		
		
		
		
	}

}
