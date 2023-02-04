package Module7.inheritance2;

public class ZooPractice {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		
		
		
		a1.species ="Generic Animal";
//		a1.numberOfLegs = 4;
//		a1.walk();
		
//		Dog d1 = new Dog();
//		
//		d1.species = "Dog";
//		d1.numberOfLegs = 4;
//		d1.walk();
		
		
		
		Lion l1 = new Lion("Safari Lion",4);
		
		System.out.println("Bring me species of Lion: " +  l1.species);
		
		System.out.println("Bring me number of Legs of Lion: "+ l1.numberOfLegs);
		
		System.out.println(a1); // Ask this
		System.out.println(l1);// Ask This 
		
		
		 
		
		
		
		
	}

}
