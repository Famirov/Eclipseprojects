package Module7.inheritance;

public class DemoAnimCatDog extends Dog{

	public static void main(String[] args) {

		Animal a1 = new Animal ("Snoop", 1, "black", true);
		
		a1.breath();
		a1.sleep();
		a1.makeSound();
		System.out.println("=====================");
		System.out.println("Looook at This ");
		System.out.println(a1);
		
		System.out.println("=====================");
		
		Cat c1 = new Cat();
		
		c1.breath();
		c1.sleep();
		c1.makeSound();
		
		
		c1.name ="Tom";
		System.out.println(c1.name);
		
		c1.age = 2;
		System.out.println(c1.age);
		
		c1.color = "yellow";
		System.out.println(c1.color);
		System.out.println("======================");
		
		Dog d1 = new Dog("Max", 1, "white",false);
		System.out.println(d1);
		
		
		
		

	}

}
