package Constructors;

public class Hotel {
	
	int numberOfApartments;
	int numberOfStars;
	String name;
	boolean hasPool;
	
	
	public Hotel () {
		
	}
	
	public Hotel (int numberOfApartments, int numberOfStars, String name,boolean hasPool ) {
	
	this.numberOfApartments = numberOfApartments;
	this.numberOfStars = numberOfStars;
	this.name = name;
	this.hasPool = hasPool;
	
	}
	
	
	public int Hotel(int numberOfApartments) {
		return this.numberOfApartments;
	}
	
	public void display() {
		System.out.println("NumberOfStars: " + numberOfApartments);
		System.out.println("Number Of Stars: " + numberOfStars );
		System.out.println("Name: " + name);
		System.out.println("Has Pool: " + hasPool );
	}

}
