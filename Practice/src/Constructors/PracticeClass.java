package Constructors;

import java.util.ArrayList;

import Constructors.DimaPractice.Bike;

public class PracticeClass {

	public static void main(String[] args) {
//		
//		// At this point we call the default constructor
//		Bike bike1 = new Bike(); // the constructor is called
//		
//		// The option to assign some values will through accessing the variables itself
//		bike1.id = 1001;
//		bike1.model = "BMX";
//		bike1.type = "Freestyle";
//		bike1.color = "Black";
//		bike1.price = 599.99;
//		bike1.isOnSale = true;
//		
//		bike1.printInfo();// default values will be printed
//		
		// Let's create an object with parameterized constructor
	//	Bike bike2 = new Bike("BMW", "Road", "Yellow", 5000, true); //This is an object
	//	bike2.printInfo();
		
	//	Bike bike3 = new Bike("Desna", "Mountain", "Pink", 100, false); //This is an object

		
//	
//		Hotel hotel1 = new Hotel();
//		hotel1.name = "Marriot";
//		
//		Hotel hotel2 = new Hotel(212, 5, "Hyatt", true);
//		
//		hotel1.display();
//		hotel2.display();
		
		
		Employee emp1 = new Employee ();
		
		emp1.display();
		System.out.println("===============");
		Employee emp2 = new Employee(12345, "Shirbala", 12000, "Full-Time");
		emp2.display();
		
		
		
//		ArrayList< String > cities = new ArrayList<>(5);
//		
//		cities.add("Miami");
//		cities.add("Chicago");
//		cities.add("Seattle");
//		cities.add("Fairfax");
//		cities.add("Atlanta");
//		System.out.println(cities);
		
		
	}

}
