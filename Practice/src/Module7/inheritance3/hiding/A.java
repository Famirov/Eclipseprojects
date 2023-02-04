package Module7.inheritance3.hiding;

public class A {
	
	public void instanceMethodA() {
		System.out.println("Instance method from class A");
		
		staticMethod();
	}
	
	
	public static void staticMethod() {
		System.out.println("Static method from the PARENT class");
	}
	
	

}
