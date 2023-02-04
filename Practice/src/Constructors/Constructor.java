package Constructors;

public class Constructor {

	public static void main(String[] args) {
		
/**● Every time an object is created using new() keyword, at least one constructor is called.
○ Even though you haven’t created a constructor yourself.
○ Java compiler does it for you.**/	
		
//Declareation=Dog 		//Dog class name (); =is Constructor Method
//myDog=instantiotion		
		Dog myDog = new Dog ("Jerry",4); // entire code is object
							// Jerry = passed name as a parameter to our constructor which are argument
		
		Dog myDog2 = new Dog("Tommy",4, 15.0);
		// When Dog (); Constructor of parentheses is Empty it's default Constructor Method
		
		System.out.println(myDog.name);
		System.out.println(myDog.age);
		System.out.println(myDog.matureage);
		System.out.println(Constants.MY_NAME);

	}

}
