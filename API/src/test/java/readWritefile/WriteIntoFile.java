package readWritefile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class WriteIntoFile {
	public static void main(String[] args) throws IOException {
		
		
		
		
		
		/**This is a path of the file where I want to write my data inside in */
		String filePath = "src/test/resources/testData/responseData.json";
		
		String myData = "I am testing common-io library";
		
		File file = new File (filePath); // It's Class and it comes from 
		
		FileUtils.writeStringToFile(file, myData);// This method overloaded myData is content and we will write this content inside of the file  
		
		
	}
	

}
