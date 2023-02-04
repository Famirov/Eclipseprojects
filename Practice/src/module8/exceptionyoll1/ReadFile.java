package module8.exceptionyoll1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
	
	
	public static void main(String[]args) {
		
		readMyTextFile("src/module8/exceptionyoll1/books.txt");
		
	}
	
	public static void readMyTextFile(String path) {
		
		Scanner sc = null;
		
		try{
			
		FileInputStream myFile = new FileInputStream (path);
		sc = new Scanner(myFile);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}finally {// to close the opened condition not to eat up resources.
			sc.close();
		}
		
		
	}
	
	

}
