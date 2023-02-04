package Module7.methodoverriding.animal;

public class Main {

	public static void main(String[] args) {
		
		
		Animal a1 = new Animal();
		a1.makeSound();
		System.out.println("==============");
		
		Cat c1 = new Cat();
		c1.makeSound();
		System.out.println("==============");
		
		Dog d1 = new Dog();
		d1.makeSound();
	}

}
