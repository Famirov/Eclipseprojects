package Module7.abstraction;

public class MainGarage {

	public static void main(String[] args) {


	//ElectricCar e1 = new ElectricCar(); You can't create an object of the abstract clas
		
		Honda h1 = new Honda();
		h1.start();
		System.out.println("=============================");
		
		Tesla tesla1 = new Tesla();
		tesla1.charge();
		tesla1.start();
		

	}

}
