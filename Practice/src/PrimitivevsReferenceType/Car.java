package PrimitivevsReferenceType;

public class Car { // This is a blue print -is Class
	
	// 	State- (Attribues, Data, Fields, Instance Variables)
	// The modifiers as public and static are optional here
	// It's optional to initialize the Instance variable. Default value will be null
	
	public String make; // Class level variables all 4
	public String model;
	public int year;
	
	// Add new fields
	public int doors;
	public String color;
	public double tankCapacity;
	
	// In some cases we want to give an initial value to a filed
	public String VIN = "XXXXXXXXXXXXX";
	// This is a constant that we need to initialize at the beginning and each object will have the same value for the field
	public final static String DEALERSHIP = "Toyota Delarship";
	//Dealarship-e aiddir we hard code it and make it constant
	
	public static int countCars = 0;
	
	/*Default Constructor - No-Args Constructor*/
	
	public Car() {
	// Default contructor it's funcion is to assign all the instance fields to it's default value	
	// We can add some logic to this constructor	
						
		System.out.println("New car object has been created");
		countCars++;
		year =2022;
		tankCapacity =25;
		
					
		
	}
	
	//Behavior-(Methids, Functions)
	//It is optional to use public or static modifiers
	
	public void startEngine() { //This is Method
		System.out.println("The engine started...");
	}
	public void stopEngine() {// This is Method
		System.out.println("The engine stopped...");
		
	}
	
	public void printInfo() {
		System.out.println("------------");
		System.out.println("Dealership: " + DEALERSHIP);
		System.out.println("Make: " + make);
		System.out.println("Model: " + model );
		System.out.println("Year: " + year);
		System.out.println("VIN: " + VIN);
		System.out.println("Doors: " + doors);
		System.out.println("Color: " + color);
		System.out.println("------------");
		
	}
	
	
	
	
	
	 public double fullTankCost(double fuelPrice) {
		
		return Math.round(tankCapacity * fuelPrice);
		
	}
	
	
	
	
}