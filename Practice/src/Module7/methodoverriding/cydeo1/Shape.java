package Module7.methodoverriding.cydeo1;

public class Shape {
	
	String name;
	
	
	public Shape(String name) {// Constructor
		this.name = name;
	}
	
	public double area() {//Method
		
		return 0.0;
	}
	
	public double parameter() {//Mehod2
		
		return 0.0;
	}
	
	
	@Override
	public String toString() {
		return "Shape [name=" + name + "]" ;
	}
	

}
