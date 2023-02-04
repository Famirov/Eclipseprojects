package Module7.inheritance3.hiding;

public class B extends A{
	
	@Override
	
	public void instanceMethodA() {
		
		staticMethod();
		
	}
	
	
	/*@Override --> we cannot override the
	   static methods, but we can declare this
	   methods and the staticMethod from the parent
	   class will become hidden.
	 */
	public static void staticMethod() {
		System.out.println("Static method from the CHILD class");
	}
	
	

}
