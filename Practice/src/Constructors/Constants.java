package Constructors;

public class Constants {
	

	private Constants () {
		
/*we know that private methods can only be
called from within that class right so
now if you try to call this constructor
from anywhere else like from Constructor class in our
main method we will see that we get an
error this constructor is not visible
because it's private but you can still
go ahead and use all of its static
fields just fine with no problems 
*/		
		
		
		/**We can have private, protected, public or default constructor in Java. (all access modifiers)
		 * 
		○ If constructor is private, that means you can only create object from this class within that class.
		○ You cannot create an object from outside of the class.**/	

	}
	
	
/*this i have a constants class since all
these fields below are static i can use any of
these constants in this file without
having to create any objects so over
*/
	public static final int NUMBER_OF_MONTHS_IN_A_YEAR = 12;
	
	public static final int NUMBER_OF_DAYS_IN_A_WEEK = 7;
	
	public static final String MY_NAME = "Farhad";

	
	
	

}
