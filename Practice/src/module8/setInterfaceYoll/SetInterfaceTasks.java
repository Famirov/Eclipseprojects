package module8.setInterfaceYoll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceTasks {

	public static void main(String[] args) {


//		Set<Integer>nums = new HashSet<>(Set.of(6,6,5,9,4));
//		/*Duplicates are not allowed and nwe can't have more than one null value*/
//		nums.add(null);
////		nums.add(null);// we can not do it 
//		System.out.println(nums.size());
//		System.out.println(nums);
		
		
/*
 Creare String type of set which you can add null value
 Add these elements into set(Tom, John, Alex, Peter, null, Tom)
 Get size of setinto list
 Create String type of ArrayList and add Oliver and William 
 Add that list into set and print the set
*/		
	
		
	
		
		Set<String>names = new LinkedHashSet<>();
		
		names.add("Tom");
		names.add("John");
		names.add("Alex");
		names.add("Peter");
		names.add(null);
		names.add("Tom");
		
		System.out.println(names.size());
		
		List<String>names2 = new ArrayList<>(List.of("Oliver" , "William"));
		
		names.addAll(names2);
		
		System.out.println(names);
		
		
		
		
		
		
/*
 Create an Integer type of TreeSet and add 9,7,5,1 and print it
 Print the size of set
 remove 1 from set and print it
 check if set is empty
 add null value to list and print it
 remove all the elements from set and print it
  */		
		
	
		Set<Integer>num = new TreeSet<>(List.of(9,10,5,1));
		
		System.out.println(num);
		System.out.println(num.size());
		System.out.println("removed it: " + num.remove(1));
		
		System.out.println(num);
		System.out.println(num.isEmpty());
		
//		num.add(null);
		num.removeAll(num);
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		

	}

}
