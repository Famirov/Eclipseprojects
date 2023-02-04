package Casting;

public class casting {

	public static void main(String[] args) {
	
		// Casting
		
		// Widening casting - we convert a smaller data type to alarger one
		// This process happens automatically because there is no data loss
		
		/*EX1*/
		// declare an integer type variable 
		int number = 100;
		//convert it to a double type variable
		double dNumber = number; //the conversion happens automatically 
		System.out.println("The double value: " + dNumber);
		
		
		
		// Narrowing casting- we convert a larger data type to a smaller
		//We have to manually convert one data type into another using the parenthesis.
		
		
		double myDouble = 10.876;
		
		System.out.println("My double value: " + myDouble);
		
		int myInt = (int)myDouble;
		
		System.out.println("My integer value: " +myInt);
		
		
		
		
		
		
	}
	
	/*EX2*/
	public double sum (int a, int b) {
		int result = a+ b;
		
		return result;
	}

}
