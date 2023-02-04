package Module7.inheritance;

public class Animal {
	
	public String name;
	public int age;
	public String color;
	public boolean wild;
	
	public Animal() {
		
	}
	
	public Animal(String name,int age, String color, boolean wild) {
		this.name = name;
		this.age =age;
		this.color =color;
		this.wild = wild;
		
	}
	
	
	public void breath() {
		System.out.println("Animal breath...");
	}
	
	public void sleep() {
		System.out.println("Animal sleeps...");
	}
	
	public void makeSound() {
		System.out.println("Animal makes sound...");
	}

	public String toString () {
		return"Name: " +
	name + 
	" | age: " 
	+ age +
	" | color: "
	+ color + " | wild: " +wild;
		
	}
	
	
}
