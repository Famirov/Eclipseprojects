package Module7.encapsulation2;

public class DemoWall {

	public static void main(String[] args) {
		
		Wall wall = new Wall(3,4);
		System.out.println("area= " + wall.getArea());
		System.out.println("===========================");
		wall.setHeight(0.7);
		System.out.println("width= " + wall.getWidth());
		System.out.println("height= " + wall.getHeight());
		System.out.println("area= " + wall.getArea());
		
	}

}
