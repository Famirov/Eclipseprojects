package Module7.methodoverriding.cydeo1;

public class Square extends Shape{
	
	double side;
	
	public Square(double side) { // Constructor
		super("Square");// invoke Super class constructor
		this.side = side;
		
	}
	
	
	@Override
	public double area() {
		
		return side*side;
		
	}
	
	
	@Override
	public double parameter() {
		
		return side*4;
	}


	@Override
	public String toString() {
		return "Square [side=" + side + ", name=" + name + "]";
	}
	
	
	
	
	
	


}
