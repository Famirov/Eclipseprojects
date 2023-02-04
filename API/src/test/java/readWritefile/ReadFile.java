package readWritefile;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class ReadFile {
	
public static void main(String[] args) throws IOException {
		
		String filePath = "src/test/resources/testData/requestData.json";
		
		File file = new File(filePath);
		
		String myData = FileUtils.readFileToString(file);
		
		System.out.println(myData);
		
		
		
	}

}
