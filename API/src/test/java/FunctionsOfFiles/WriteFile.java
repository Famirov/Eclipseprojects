package FunctionsOfFiles;

import java.io.File;

import org.junit.Test;

import io.restassured.response.Response;

@Test
public class WriteFile {
	

		
//		//content that to write into file
//		String myData= "I’m learning to write a text to file";
//		
//		//file path
//		String filePath= "src/test/resources/testData/responseData.json";
//		
//		//create file object from file path
//		File file = new File(filePath);
//		
//		//write myData content into file
//		FileUtils.writeStringToFile(file, myData);
		
		
		
		String url= "https://gorest.co.in/public/v1/users";
			
			Response response = given()
								.when().get(url);
			
			String strResponse= response.prettyPrint();
			
			//file path
			String filePath= "src/test/resources/testData/responseData.json";
			//create file object from file path
			File file = new File (filePath);
			//write myData content into file
			FileUtils.writeStringToFile(file, strResponse);
}
