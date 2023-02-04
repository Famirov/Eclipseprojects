package Module7.inheritance3.hiding;

public class CallMethods {

	public static void main(String[] args) {

		A a1 = new A();
		
		a1.instanceMethodA();// to call instance method with object name
		System.out.println(" ");
		A.staticMethod();// to call static method we use class_name 
		
		System.out.println("======================================");
		
		B b1 = new B();
		
		b1.instanceMethodA();
		System.out.println(" ");
		B.staticMethod();
		
	}

}
