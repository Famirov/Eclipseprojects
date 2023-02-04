package Module7.methodoverriding.cydeo2;

public class CarRider {

	public static void main(String[] args) {


		Lyft d1 = new Lyft("James");
		
		
		System.out.println(d1.calculateRate(10));
		
		
		LyftXL d2 = new LyftXL("Ahmad");
		
		System.out.println(d2.calculateRate(10));
		

	}

}
