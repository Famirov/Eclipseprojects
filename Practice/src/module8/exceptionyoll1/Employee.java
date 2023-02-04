package module8.exceptionyoll1;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee(String firstName, String lastName) {
		
		//Throw a new unchecked exception
		if (firstName.isBlank()|| firstName == null || lastName.isBlank() || lastName==null) {
			
			throw new IllegalArgumentException("firstName or lastName should not be blank or null");
		}
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString(){
		return "Name: " + firstName + "Surname: " + lastName;
	}
	
	
	public static void giveBonus(Employee empl) throws Exception {
		
		//Throw the checked exception
		//if you throw a checked exception include throws in the declaration
		if (empl== null) {
			throw new Exception("The reference cannot be null!");
		}
		System.out.println(empl.firstName + " Congrats you got bonus");
	}
	
	

}
