package Module7.inheritance2;

public class DemoPersStud {

	public static void main(String[] args) {
		
		
		Person p1 = new Person();
		
		p1.name = "James";
		p1.age = 40;
		p1.hobby = "Gaming";
		
		p1.talk();
		
		
		Student s1 = new Student();
		
		//variables inherited from the Person Class
		s1.name = "Gerald";
		s1.age = 30;
		s1.hobby = "Golfing";
		s1.talk();
		System.out.println("===================");
		
		//below variable and method belongs to student class.
		s1.funLevel = 100;
		s1.study();
		
		
		
		

	}

}
