package Module7.inheritance2;

public class Lion extends Animal {
	
	//Lion is an Animal
	
	
	int maneSize;
	
	
	public Lion () {
	super();
		
		
	}
	
	public Lion (String species, int numberOfLegs) {

		super(species, numberOfLegs);
		
		
		
	}
	
	public void roar() {
		System.out.println ("Lian is roaring..");
	}
	

}
