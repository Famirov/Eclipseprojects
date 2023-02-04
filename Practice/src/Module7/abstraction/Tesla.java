package Module7.abstraction;

public class Tesla extends ElectricCar{
	
	@Override
	public void start() { // Needs to override it from Car class
		System.out.println("Press, the button and wait....");
	}
	
	@Override
	public void charge() { // Needs to override it from Electric Car
		
		System.out.println("Put the electric pump in...");
	}

}
