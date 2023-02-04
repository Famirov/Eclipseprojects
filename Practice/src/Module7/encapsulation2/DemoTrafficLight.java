package Module7.encapsulation2;

public class DemoTrafficLight {

	public static void main(String[] args) {
		
		TrafficLight light = new TrafficLight("green"); // green- 1th	Initialization
		
		
		light.setColor("yellow"); // yellow -2nd Initialization
		System.out.println(light.getColor());
		

	}

}
