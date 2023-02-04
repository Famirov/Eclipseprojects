package Day46;

import java.util.Arrays;

public class Cstudent {
	
	public String name;
	public int groupNumber;
	
	
	
	public static int batchNumber;
	public static String [] instructors;
	public static String schoolName;
	
	//you can assign and declare at the same time, but it is not recommended, we will use static block to assign
	
	static {
		batchNumber = 26;
		instructors = new String[] {"Nadir", "Mehmet", "Aysun","Selim"};
		schoolName = "Yoll Academy";
		printInfo();
	}
	
	public Cstudent(String name, int groupNumber) {
		this.name = name;
		this.groupNumber = groupNumber;
	}

	
	public static void printInfo() {
		System.out.println("School Name: " + schoolName);
		System.out.println("Batch Number: " + batchNumber);
		System.out.println("Instrucros: "+ Arrays.toString(instructors));
		
	}
	
	@Override
	public String toString() {
		return "Cstudent{"+ "name=' "+ name + "\'"+ ", groupNumber=" +groupNumber +"}"; 
	}
	 
	
	
}
