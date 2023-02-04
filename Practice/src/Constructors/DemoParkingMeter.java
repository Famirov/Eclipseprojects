package Constructors;

public class DemoParkingMeter {

	public static void main(String[] args) throws InterruptedException {

		
		ParkingMeter n1 = new ParkingMeter(60);
		
		System.out.println(n1.add(25));
		System.out.println(n1.timeLeft);
		
		n1.add(25);
		System.out.println(n1.timeLeft);
		
		n1.tick();
	
		
		n1.add(25);
		System.out.println(n1.timeLeft);
		
		System.out.println(n1.isExpired());
		
		
		//Create a loop
		
		while (!n1.isExpired()) {
			System.out.print(".");
			n1.tick();
			Thread.sleep(500);
		}
		System.out.println();
		System.out.println(n1.isExpired());
		
		

	}

}
