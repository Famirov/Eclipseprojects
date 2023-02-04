package Constructors.DimaPractice;

public class Bike {
	
	/*Define State*/
	
	public int id;
	public String model;
	public String type;
	public String color;
	public double price;
	public boolean isOnSale;
	
	 
	public Bike() {
		System.out.println("New Bike Has Been Created!");
	}
	
	 
	
	/*Define a method that prints the sate of the object*/
	
	public void printInfo() {
		
		System.out.println("-----------------------");
		System.out.println("Model: " + model);
		System.out.println("Type: " + type);
		System.out.println("Color: " + color);
		System.out.println("Price: $" + price);
		System.out.println("Is on sale: " + isOnSale);
		System.out.println("-----------------------");

		
		
		
	}
	
	
	
	
	
}
