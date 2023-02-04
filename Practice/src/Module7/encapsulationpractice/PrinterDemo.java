package Module7.encapsulationpractice;

public class PrinterDemo {

	public static void main(String[] args) {

		Printer p1 = new Printer(50, false);
		
		
		System.out.println("Did you add tonner? => " +p1.addToner(50));
		System.out.println("How many pages did you print? " + p1.getPagesPrinted());
		p1.printPages(100);
			
		System.out.println("How many pages did you print? " + p1.getPagesPrinted());
		
		

		
		
		
	}

}
