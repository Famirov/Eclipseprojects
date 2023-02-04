package Module7.polymorphism.interfacemethods;

public interface Mac {
	
	String NAME = "Mac";//Public static final variables
	String OS = "IOS";
	
	
	void turnOn();//public abstract method= method without implementation
	
	//Q: How do you create a method with implementation in an interface
	
	// One way is a static method:
	
	public static void company() {
		System.out.println("Apple");
		System.out.println("HQ is LA");
		System.out.println("New relaease in Nov");
	}
	
	//One way is a default method:
	
	public default void faceTime() {
		System.out.println("Opening facetime");
		System.out.println("Calling someone");
	}
	

}
