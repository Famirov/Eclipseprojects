package DailyPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class TrimList {
	
	public static void main(String[] args) {
		
		/*Write me a method that accept as a parameter as a List
		 * trim every single elements and return us  trimmed list */
		
		
		List<String>list = Arrays.asList("     abc", "    def"," ghi            ");
		
		//Testing for 2nd option
		TrimList.trimAndPrintList(list);
		
		//Testin for 1th option
//		List<String>trimmedList = TrimList.trimList(list);
//		
//		System.out.println(trimmedList);

	}
	
	// 1th Option with FOReachLOOP
	
	@Test @Ignore
//	public static List<String>trimList(List<String>list){
//		
//		ArrayList<String>trimmedList = new ArrayList<>();
//		
//		if(!list.isEmpty() && list!=null) {
//		for(String elements: list) {
//			
//			trimmedList.add(elements.trim());
//			}
//		}
//		
//		return trimmedList;
//		
//		
//	}
	
	
	public static void trimAndPrintList(List<String>list) {
		
		for(int i =0; i<list.size(); i++) {
			String trimmed = list.get(i).trim();
			System.out.print(trimmed + ",");
		}
	}
	

}
