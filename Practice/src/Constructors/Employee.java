package Constructors;

public class Employee {
	
	public int employeeID;
	public String name;
	public double salary;
	public String status;
	
	
	public Employee () {
		System.out.println("New Employee Created");
	}
	
	public Employee (int employeeID, String name, double salary, String status ) {
		this();
		this.employeeID = employeeID;
		this.name = name;
		this.salary = salary;
		this.status = status;
		
	}
	
	public void display() {
		
		System.out.println("ID: " + employeeID );
		System.out.println("name: " + name );
		System.out.println("salary: " + salary );
		System.out.println("status: " + status );
	}
	
	
	
	

}
