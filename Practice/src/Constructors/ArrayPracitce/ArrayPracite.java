package Constructors.ArrayPracitce;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPracite {

	public static void main(String[] args) {
		
		
/*Exercise ArrayList First Element

Write a method that returns the first element of an ArrayList of Strings

If there is no first element in the ArrayList, return the empty String “”.

For example if we had an ArrayList<String> list with the elements ["hello", "world"]:

firstElement(list)
Should return:

"hello"
And the first element of an empty ArrayList:

firstElement(new ArrayList<String>())
Should return:*/		
		
		ArrayList <String> list = new ArrayList<>(Arrays.asList("hello", "wordl"));
		
		list.get(0);
		System.out.println(list.get(0));
		
		


		
		

	}

}
