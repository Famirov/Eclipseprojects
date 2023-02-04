package Module7.inheritance;

public class Dog extends Animal {
	
	public Dog() {}
	
	public Dog(String name,int age, String color, boolean wild) {
		
		super(name, age,color, wild);
		
				
	}
	
	
	
	public void hair() {
		System.out.println("Dog has yellow hair!");
	}

}
