package AccessModifiers.pack1;

import AccessModifiers.pack2.Phone;

public class Practice {

	public static void main(String[] args) {
	
//		// default access modifier is accessible only within the same package
//		Laptop myLaptop = new Laptop();// we created an opject
//		
//		myLaptop.ram = 32;
//		myLaptop.processor = "M1";
//		
//		// 
//		
//		Phone myPhone = new Phone();
		
/**Even I changed the class to public to get 
 * access to variables and the buzz method
 *  we need to change all of them to public 
 *  otherwise we can't access them 
 *  even though it's in the public class*/
		
	//	myPhone.buzz(); not accessible
	// 	myPhone.model = "S22"; not accessible
		
		
		
		
		
		
/**Private modifier is accessible only within class
 * 
 * Only the methods, varaibles, constructors can be as private
 * Classes CANNOT BE PRIVATE
 * 
 * 
 * We access private variables
 * By using public getter and setter methods of the class
 * They are used to create, modify, delete and view the variables values.*/	
		
		Account ac = new Account();
//		ac.username = "omar.ramo";
//		ac.password ="omar2022";
//		
//		System.out.println(ac.username);
//		System.out.println(ac.password);
//		
//		ac.password = "000";// By doing it we can change it 
//		
//		System.out.println(ac.username);
//		System.out.println(ac.password);
		
		
/**In this class we will access the private instance variables of another class within the same pckg*/		
		
/**Answer for Account Class**/		
		
		
//		//Change the username and password here
//		ac.setUsername("My username");
//		ac.setPassword("9090909");
//		
//		
//		// Print the username and password
//		
//		System.out.println(ac.getUsername());
//		System.out.println(ac.getPassword());
		
		
		
/**Answer of Teacher class**/	
		
		Teacher th = new Teacher();
		
		
		th.setTopic("Economics");
	
		System.out.println(th.getTopic());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
