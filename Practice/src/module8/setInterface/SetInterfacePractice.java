package module8.setInterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SetInterfacePractice {

	public static void main(String[] args) {

//		/*Practice Hash Map*/
///*
// Create a map and add 
// Key- VA, MD, NY, CA
// Value-	Virginia, Maryland, New York, California
// Get all the keys of map and print them
// Get all the values of map and print them
// Get the value of MD
// */
//		
//		Map<String, String> states = new HashMap();
//		
//		states.put("VA", "Virgina");
//		states.put("MD", "Maryland");
//		states.put("NY", "New York");
//		states.put("CA", "California");
//		
//		System.out.println(states);
//		System.out.println("=======================");
//		 //Get all the keys of map and print them
//		System.out.println(states.keySet());
//		//or 2nd option
//		for(String eachKeys: states.keySet()) {
//			System.out.print(eachKeys + " ,");
//		}
//		System.out.println();
//		System.out.println("========================");
//		
//		
//		//Get all the values of map and print them
//		System.out.println(states.values());
//		//2nd option
//		
//		for(String eachValue: states.values()) {
//			System.out.print(eachValue + " ,");
//		}
//		System.out.println(" ");
//		System.out.println("============================");
//		System.out.println(states.get("MD"));
//		
//
//	}
	
	
	/*Interview Question */	
		//people
		// p=2, e=2, o=1, l=1
		// 1th way of solving it
		
		String str = "peeeeeeeeeeeeeeeeeeeeeeeeeeople";
		

		
		Map<Character, Integer> m1 = new HashMap<>();
		
		for(int i = 0; i<str.length(); i++) {
			
			Character key = str.charAt(i);
			Integer value = m1.get(key);

			
			if(!m1.containsKey(key)) {
				m1.put(key, 1);
				
			}else {
				
				m1.replace(key, value+1);
			}
	
		}
			
		System.out.println(m1);
		
		
		// 2nd Way of solving it
		
		
//		Map<String, Integer> map = new HashMap<>();
//		
//				
//		for(int i = 0; i< str.length(); i++) {
//			
//			String currentLetter = str.charAt(i)+ ""; //p
//			Integer currentValue = map.get(currentLetter);
//			
//		if(!map.containsKey(currentLetter)) {
//			map.put(currentLetter, 1);
//		}else {
//			map.replace(currentLetter, currentValue + 1);
//		}
//		
//	}
//		System.out.println(map);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
	

}
