package Constructors;

public class Dog {
	 String name; //This is field
	 int age; //This is field
	 double matureage;
	 
/**This is Default Constructor**/ 
	 public Dog() {
/**Default constructor → doesn’t have parameters
○ The default constructor is used to initialize instance variables.
○ e.g: boolean = false, int =0, double = 0.0 etc.**/
		 
		 System.out.println("Object has created: ");
		 
	 }
	 			//String name parametr
//	 public Dog(String name) { // This is Constructor Method and the name of the method needs to be same as Class name
//		 // and there won't have any retun type in the contructor such as void, int, String:  public int Dog() ola bilmez
//		 // Inside of the constructor method body I can set the name of the Dog object that's been created
//		 
//		 //This.name refere to the field on the Object line 4;
//		 //= name refer to the String name parametr
//		 this.name = name;
//		 
//		 
//		 
//	 }
//	 
//	//can have multiple constructors the only requirement is they have to have different types of parameters
//	 public Dog(int age) {
//		 this.age = age;
//		 
//	 }
	 
	 
	 
	 //can also create constructors that take
	 //more than one parameter so instead of
	 //having separate constructors where one
	 //sets the name and one sets the age you
	 //can instead make a brand new constructor
	 //that takes in the string name and the
	 //int age 

	 
	 public Dog(String name, int age, double matureage) {
			
		 this(name,age);
		 this.matureage = matureage;
	 }
	 
	 
	 public Dog(String name, int age) {
		 this(); // This is overloading method:Constructor overloading is a technique in Java in which a class can have any number of
		 		 //constructors that differ in parameter lists.
		 this.name = name;
		 this.age = age;
		 
/**● Parameterized constructor → have parameters
○ Parameterized constructor is used to provide different values to different objects
○ When a parameterized constructor is called, default one is not called.*/		 
		 
	 }
	 
	 

	 
	 /**Rules**/
/**There are two rules defined for the constructor.
● Constructor name must be same as its class name
● Constructor must have no return type. (Can’t have void too)
A Java constructor cannot be abstract, static, final, syncronized**/	 
	 
	 

	 
	 

	 
	 

}
