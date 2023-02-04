package PrimitivevsReferenceType;

import java.util.Arrays;

public class Lesson1 {

	public static void main(String[] args) {

		
		//Primitive type assignment
//		int myInt =10;//myInt value is 10
//		int myInt2 = myInt; // take the value of myInt, copy it and assign to myInt2--This are containers not objects they just copy 
//		
//		System.out.println("myInt = " + myInt);
//		System.out.println("myInt2 = " + myInt2);
//		
//		
//		myInt++;
//		System.out.println("myInt = " + myInt);// myInt ++ will effect only myInt container
//		System.out.println("myInt2 = " + myInt2);
		
		
//		int i =1;
//		int j =2;
//		
//		System.out.println("i = " + i);
//		System.out.println("j = " + j);
//		
//		i=j;// i =2
//		j=j-i; // j= 2- 2
//		
//		System.out.println("i = " + i); // i = 2
//		System.out.println("j = " + j); // j = 0
		
		
		
/**Reference Type Assignment*/		
		
		
//		//Crate a Car instance and initialize it
//		Car myCar = new Car();
//		myCar.make = "Nissan";
//		myCar.model = "350Z";
//		myCar.color = "Black";
//		myCar.VIN="HG873635484";
//		
//		
//		//Create a Car instance and initilize it
//		Car wifeCar = new Car();
//		wifeCar.make = "Lexus";
//		wifeCar.model = "RX400";
//		wifeCar.color = "Red";
//		wifeCar.VIN="JF874635484";
//		
//		
//		System.out.println("myCar info -> ");
//		myCar.printInfo();
//		
//		System.out.println("wifeCar info -> ");
//		wifeCar.printInfo();
//		
//		
//		myCar = wifeCar;
//		
//		System.out.println("********************");
//		System.out.println("myCar info -> ");
//		myCar.printInfo();
//		
//		System.out.println("wifeCar info -> ");
//		wifeCar.printInfo();
		
		
		
		//Arrays are stored in heap memory and both x and y are pointing to the same object
//		int [] x = {10, 20, 30, 40, 50};
//		int [] y =x;
//		
//		y[1]= 99;
//		//Both x and y refer to same place in memory that holds array
//		System.out.println("Array x: " + Arrays.toString(x));
//		System.out.println("Array x: " + Arrays.toString(y));
		
		
/**Mutable- user defined classes are mutable ( means the object in heap can be modified)
 * Immutable- All Wrapper class objects and Strings are immutable (immutable- it's not changeable
 * Immutable- means we cannot change the value of the object in the haeap
 * Everytime we give new value a new object is created*/
		
//		String password1 = "Yoll";
//		String password2 = "Academy";
//		
//		System.out.println("password1 = " + password1);
//		System.out.println("password1 = " + password2);
//		
//		password1 = password2;
//		
//		System.out.println("password1 = " + password1);
//		System.out.println("password1 = " + password2);
//		
//		password2 ="New Pass";
//		
//		System.out.println("After passord2 changed: ");
//		System.out.println("password1 = " + password1);
//		System.out.println("password1 = " + password2);
		
		
		
/**Java is Pass by Value*/		
		
		int x =2;
		changeValue(x);// x here will be paste to int x in the method that's why it will be 2 not 100
		// this method will not reassign the value of x from main because the copy of value is passed instead of the variable itself
		System.out.println("x = " + x);
		
		Car myCar = new Car();
		myCar.make = "Nissan";
		myCar.model = "350Z";
		myCar.color = "Black";
		myCar.VIN="HG873635484";
		
		myCar.printInfo();
		
		changeColor(myCar); // myCar parametr copy of address is passed to  public static method
		// after this call the color will be changed
		
		myCar.printInfo(); // it will change to the black 
		
	}
	
	public static void changeColor(Car car) { // local car object will reference same object we pass as argument
		car.color = "Black"; // this change will affect the object and references pointing to this object will be affected 
	}
	
	
	public static void changeValue(int x) { // x in this method is local varable
		x = 100; // this change affects only local variable
	}

}
