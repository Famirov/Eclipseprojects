package FunctionsOfFiles;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class ReadFile {
	
	/**Data Coming from the Request Data file*/
	
	public static void main(String[] args) throws IOException {
		
		String filePath = "src/test/resources/testData/requestData.json";
		
		File file = new File(filePath);
		
		String myData = FileUtils.readFileToString(file);
		
		System.out.println(myData);
		
		
		
	}
	

	
	
	

}<!-- https://mvnrepository.com/artifact/commons-io/commons-io -->
<dependency>
    <groupId>commons-io</groupId>
    <artifactId>commons-io</artifactId>
    <version>2.4</version>
</dependency>

