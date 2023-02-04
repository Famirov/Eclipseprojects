package serialization;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestRequestBuilder {
	
	@Test
	public void createRequestData () throws JsonProcessingException {
		
		GorestRequestBuilder reqBuilder	 = new GorestRequestBuilder();
		
		//set JSON values to java object
		reqBuilder.setName("Titans Test");
		reqBuilder.setEmail("titanstest@yoll.io");
		reqBuilder.setGender("male");
		reqBuilder.setStatus("active");
		
		
		// we need to convert Java object to String
		// We will install Jackson Databind from MVN to read our JSON 
		
		ObjectMapper objMap = new ObjectMapper();
		
		String jsonData = objMap.writerWithDefaultPrettyPrinter().writeValueAsString(reqBuilder);
		
		System.out.println(jsonData);
		
		//Serialization
		//automate POST requests
		//implement Encapsulation concept of OOP
		//add Jackson Databind library
		//Use BojectMapper class
		
		
		
		

		
	}

}
