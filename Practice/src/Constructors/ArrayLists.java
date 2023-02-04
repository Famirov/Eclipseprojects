package Constructors;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class ArrayLists {

	public static void main(String[] args) {
		
		
//		ArrayList<String>cities = new ArrayList<>(5);
//		
//		cities.add("Miami");
//		cities.add("Baku");
//		cities.add("Toronto");
//		cities.add("Tokyo");
//		cities.add("Berlin");
//		
//		
//		// print the content of a list
//		System.out.println(cities);
//		
//		//add an element at a specific index - add(index, Object o)
//		cities.add(1, "Hamburg");
//		System.out.println(cities);
//		
//		
//		// get the size() of the list -.size()
//		System.out.println(cities.size());//--Answer: 6--This will give us index it's like a length
//		
//		
//		//remove an object from list -remove (Object o) or remove(index)
//		cities.remove(2);// we can use the index here or by name "Baku"/ "Miami"
//		cities.remove("Miami");
//		System.out.println(cities);
//		
//		
//		// check if the list contains an object
//		System.out.println(cities.contains("Sumgait"));//false
//		System.out.println(cities.contains("Berlin")); //true
//		
//		
//		//How we access an element from the list- get(index)
//		cities.get(2);
//		System.out.println(cities.get(2)); //Answer: Tokyo
//		//How to check value of Tokyo
//		System.out.println(cities.get(2).length());//Answer: 5 = Tokyo 
//		
//		
//		//check if the list is empty
//		cities.isEmpty();
//		System.out.println(cities.isEmpty());//false-it's not empty
//		
//		
//		// get the index of the specific of object - indexOf()
//		System.out.println(cities.indexOf("Tokyo"));// Answer: 2
//		System.out.println(cities.indexOf("Berlin")); // Answer: 3
//		
//		System.out.println(cities.indexOf("Sumgayit"));// -1 is adefault value of indexOf()
//		
//		// get the last index of specific object - lastIndexOf()
//		System.out.println(cities.lastIndexOf("Berlin")); //Answer: 3. beacause it's in last index which is 3
//		
//		//modify the value of an element(swap)- set(index,Object new)
//		
//		System.out.println(cities);//Answer:[Hamburg, Toronto, Tokyo, Berlin]
//		cities.set(0, "Paris");
//		System.out.println(cities);// Answer:[Paris, Toronto, Tokyo, Berlin]
//		System.out.println(cities.size());//4
//		
//		
//		// We can create an array list by providing values directly to the constructor -Arrays.asList
//		
//		ArrayList <String> europeCities = new ArrayList<>(Arrays.asList("Rome", "Milan", "Amsterdam", "Munich")); 
//
//		System.out.println(europeCities);
//		
//		//merge another list
//		cities.addAll(europeCities);//this is a merging 
//		System.out.println(cities);//[Paris, Toronto, Tokyo, Berlin, Rome, Milan, Amsterdam, Munich]
//		
//		//merge in a specific place
//		ArrayList<String> southAmerica = new ArrayList<>(Arrays.asList("Rio","Bogota", "Lima"));
//		
//		cities.addAll(2,southAmerica);// it will add them in index 2
//		System.out.println(cities);//[Paris, Toronto, Rio, Bogota, Lima, Tokyo, Berlin, Rome, Milan, Amsterdam, Munich]
//		
//		cities.add(1,"Madrid");
//		System.out.println(cities);
//		System.out.println(cities.size());//4
//		
//		System.out.println(cities.set(2, "Tokyo"));
//		System.out.println(cities);
		
	
		/**Another example for collection sort(fruits) and reverse(fruits)*/

		
//		ArrayList <String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Pear","Mango"));
//		
//		System.out.println(fruits);
//		
//		fruits.add(1,"Xurma");
//		System.out.println(fruits);
//		
//		Collections.sort(fruits);//A--->Z
//		System.out.println(fruits);
//		
//		Collections.reverse(fruits);//Z--->A
//		System.out.println(fruits);
		
		
		
		/**Converting Arrays to ArrayList**/
		
//	String [] cities = {"Baku", "Kiev", "Tokyo"};
//	
//	ArrayList<String> list = new ArrayList(Arrays.asList(cities));
//	
//	System.out.println(list);
//	
//	list.add("Madrid");
//	
//	System.out.println(list);
	
	
//	String [] arr = { "Baku","Tokyo", "Paris", "Rome"};
//	
//	ArrayList <String> list = new ArrayList<>(Arrays.asList(arr));
//	
//	list.add("Madrid");
//	
//	System.out.println(list);
		
		
		
		/**Converting Arraylist to Array**/
		
//		ArrayList <Integer> numbers = new ArrayList <>(Arrays.asList(1,5,7,9));
//		
////		System.out.println(numbers);
//		
//		Integer[] arr = new Integer[numbers.size()];
//		
//		arr = numbers.toArray(arr);
//		
//		System.out.println(Arrays.toString(arr));
		
				
		/***Array to Arraylist* Agan and Again**/
		
		String [] arr = {"Baku","Paris","Berlin"};
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
		
		list.add(1,"Madrid");
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
