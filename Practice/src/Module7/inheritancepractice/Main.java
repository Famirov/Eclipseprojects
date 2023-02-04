package Module7.inheritancepractice;

public class Main {

	public static void main(String[] args) {
		
		
		Rectangle rectangle = new Rectangle (5, 10);
		
		System.out.println("rectangle.width = " + rectangle.getWidth());
		System.out.println("rectangle.length = " + rectangle.getLength());
		System.out.println("rectangle.area = " + rectangle.getArea());
		
		
		System.out.println("========================================");
		
		Cuboid cube = new Cuboid(5, 10, 5);
		
		System.out.println("cube.width = " + cube.getWidth());
		System.out.println("cube.length = " + cube.getLength());
		System.out.println("cube.area = " + cube.getArea());
		System.out.println("cube.area = " + cube.getHight());
		System.out.println("cube.area = " + cube.getVolume());
		
		
		
		

	}

}
