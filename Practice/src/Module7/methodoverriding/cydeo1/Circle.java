package Module7.methodoverriding.cydeo1;

public class Circle extends Shape{
	
	double radius;
	
	public Circle(double radius) {
		
		super("Cicle");
		this.radius = radius;
	}
	
	@Override
	public double area() {
		return radius * radius * Math.PI;
	}
	
	
	@Override
	public double parameter() {
		return 2 * Math.PI*radius;
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", name=" + name + "]";
	}



	
	
	
	
	

}
