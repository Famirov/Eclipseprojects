package Module7.inheritance3.final_example;

// it cannot be inherited because our Super class is final class.

public class UseFinalExample {

	public static void main(String[] args) {
		// we invoke final instance variable by clasname.varablename
		System.out.println(FinalExample.PLANET);
		
		FinalExample obj1 = new FinalExample(20);
		// we invoke them by calling object.a
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		
		
		// obj1.a =4; we can not change it because they are final
		// obj1.b =40; we can not change it
		System.out.println("=========================");
		// Instance varaibles are copies of variables and eacch object has the copy
		FinalExample obj2 = new FinalExample(100);
		
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		
		/*obj1 and obj2 here seperate objects. Each object has its own copy of 
		 * instance variables a and b, both are final, so they cannot be changed
		 * 
		 * 
		 * 
		 * a was assigned to be 5 in the class
		 * b was assigned in the constructor call*/
		
		
		
		
		
		
		
		
	}

}
