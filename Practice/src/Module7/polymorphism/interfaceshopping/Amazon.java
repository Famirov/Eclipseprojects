package Module7.polymorphism.interfaceshopping;
/*
 Create a concrete class Amazon
 	-Make the class final
 	-Inherit OnlineShopping and implement all abstract methods
 
 
 
 
 */


public final class Amazon extends OnlineShopping {

	
	@Override
	public void buyItem() {
		System.out.println("Buying from Amazon");
		
	}

	
	@Override
	public void returnItem() {
		System.out.println("Returning to Amazon drop location");
		
	}
	
	
	@Override
	public void viewChart() {
		System.out.println("View the Amazon cart");
		
	}
	
	@Override
	public void payForShipping(boolean b) {
		System.out.println(b ? "Pay for shipping":"Free Shipping" );
		
	}
	
}
