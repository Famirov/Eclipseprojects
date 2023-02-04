package methods;

public class Methods {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		
		
		p2.age = 40;
		p2.name = "Fizuli";
		
		int year1 = p1.calculateYearofRetairment();
		int year2 = p2.calculateYearofRetairment();
		
		System.out.println(year1);
		System.out.println(year2);

		
		p1.setNameandAge("Nazim", 55);
	
		p1.speak();
		
		
		
		
		
		

	}
	
	
}


class Person {
	String name;
	int age;
	
	
	
	
	void setNameandAge(String username, int userage) {
		
		this.name = username;
		this.age = userage;
		
		
		
	}
	
	
	int calculateYearofRetairment() {
		
		int years = 65-age;
		return years;
		
	}
	
	void speak() {
		
		System.out.println("My name is: " + name + " and my age is: "+ age);
	}
	
	
	
	
}