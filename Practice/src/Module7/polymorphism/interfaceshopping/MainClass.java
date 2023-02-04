package Module7.polymorphism.interfaceshopping;

public class MainClass {

	public static void main(String[]args) {
		
		
		/*
			Shopping and OnlineShopping are abstract classes, so we can't make object of them
			
			Shipping is an interface, so we can't make an object of it
		 */
		
		
		Target t1 = new Target();
		t1.price =10;
		t1.buyItem();
		t1.returnItem();
		//t1.payForShipping(true): Target class doesn't implemnt the Shipping Interface
		
		System.out.println("=============================================");
		
		Amazon a1 = new Amazon();
		
		a1.price = 100;
		System.out.println(a1.price);
		a1.buyItem();
		a1.returnItem();
		a1.payForShipping(true);
		a1.viewChart();
		System.out.println(a1.country);
		
		System.out.println(Shipping.country);// Proper way to access static information in the interface

		
		
		
	}

}
