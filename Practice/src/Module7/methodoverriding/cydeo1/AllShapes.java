package Module7.methodoverriding.cydeo1;

public class AllShapes {

	public static void main(String[] args) {
		
		Square s1 = new Square(4.5);
		System.out.println(s1);
		
		
		
		
		System.out.println(s1.area());
		
		System.out.println(s1.parameter());
		
		System.out.println("====================================");
		
		Circle c1 = new Circle(0.5);
		
		System.out.println(c1);
		System.out.println(c1.area());
		System.out.println(c1.parameter());
		

	}

}
