package Day46;

public class School {

	public static void main(String[] args) {
		
		Cstudent s1 = new Cstudent("Emre", 5);
		System.out.println(s1);
		System.out.println("==========================================");
		
		Cstudent.printInfo();
		System.out.println(Cstudent.instructors[0]);
		
		//print only instructors name 
		
		for (String each: s1.instructors) {
			System.out.print(each+" ");
		}

	}

}
