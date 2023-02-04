package module8.setInterfaceYoll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class SetInterface {
	public static void main(String[] args) {
		
//		Set <String>colors = new HashSet<String>();
//		
//		colors.add("yellow");
//		colors.add("red");
//		colors.add("blue");
//		
//		System.out.println(colors);
//		
//		
//		/*Elimination of duplicates from List*/
//		
//		List<Integer>nums = new ArrayList<>(List.of(1,2,3,4,4,4,4,5,6,7,7,8,9));
//		
//		//1th way doing it with each loop
//		
//		List <Integer>unique = new ArrayList<>();
//		
//		for(Integer num :nums) {
//			
//		if(!unique.contains(num)) {
//			
//			unique.add(num);
//			
//			}
//		}
//		System.out.println(unique);
//		
//		
//		
		//2nd option 
		
//		List <Integer> numbers = new ArrayList<>(List.of(1,2,3,4,4,4,4,5,6,7,7,8,9));
//		
//		Set <Integer> uniquenums = new HashSet<>(numbers);
//		
//		System.out.println("Set: " +  uniquenums);
		
		
		
		Set<Integer>nonorder = new HashSet<>(List.of(2,99,5,8,7,6,9,10));
		
		System.out.println(nonorder);
		nonorder.add(123);
		
		Vector<Integer>order = new Vector(nonorder);
		
		System.out.println(order);
		
		// Then we convert Set to list and try to find index.
		
//		List <Integer> uni = new ArrayList<>(uniquenums);
//		
//		try {
//			System.out.println(uni.get(10));
//		}catch(Exception e) {
//			System.out.println("No such index, please get the index based on given list!");
//			System.out.println(uni.get(0));
//			
//		}finally {
//			System.out.println("It works!");
//		}
		
		
		
//		
//		// Or we can find an item with for each loop.
//		
//		
		Set <String>colors = new HashSet<String>();
		
		colors.add("yellow");
		colors.add("red");
		colors.add("blue");
		System.out.println(colors);
		
		
		for(String unique: colors) {
			if(unique.equals("red")) {
				
				System.out.println(unique);
				
			}
		}
//		
//		// 2nd option to use a lamda
//		
//		colors.forEach(unique -> {
//			if(unique.equals("red")) {
//				System.out.println("I found the color that I was looking for: " + unique);
//			}
//		});
//		
//		
//		
//		//Removal-only by name---- we can't remove by index 
//		
//		colors.remove("red");
//		System.out.println(colors);
//		
//		// check if my HashSet isEmpty-- will give us boolean
//		System.out.println(colors.isEmpty());
//		
//		
//		// if I want to clear my set
////		colors.clear();
////		System.out.println(colors);
////		
////		
////		// null objects
////		colors.add(null);
////		System.out.println(colors);
////		
////		colors.add(null); // we will have only one null value, we will not have a duplicates
//		
//
//		//Get the size of the set
//		System.out.println(colors.size());
//		
//		
//		// we can't use Collections.sort() because it expects list
//		// inorder to get sorted we need to use TreeSet
//		// We can not sort data structure with a null values take into account- we will get NullPointerException
//		// Using TreeSet will give us ASC order sorting
//		Set<String>sortedColors = new TreeSet<>(colors);
//		System.out.println(sortedColors);
		
//		Set<Integer>nums = new HashSet<>(List.of(2,5,7,4,9,88,20,5,5,6,7,8,9,10));
//		
//		System.out.println(nums);
//		
//		Set<String>insertionOrderColors = new LinkedHashSet<>();
//		
//		insertionOrderColors.add("red");
//		insertionOrderColors.add("pink");
//		insertionOrderColors.add("green");
//		insertionOrderColors.add("orange");
//		
//		System.out.println(insertionOrderColors);
//		
		
		
		
		
		
		
	}

}
