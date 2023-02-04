package Module7.inheritance2;

public class Animal {
	
	String species;
	int numberOfLegs;
	
	
	public Animal() {
		System.out.println("================================");
		System.out.println("New Constractor is created");
	}
	public Animal(String species) {
		this();
		this.species = species; 
	}
	public Animal (String species, int numberOfLegs) {
		this(species);
		this.numberOfLegs= numberOfLegs;
	}
	
	public void walk() {
		System.out.println(species +" is walking");
	}
	
	
	public String toString(String species, int numberOfLegs) {
		
		
		return "Species: "+ species + "| number of legs: "+ numberOfLegs ; 
	}

}
