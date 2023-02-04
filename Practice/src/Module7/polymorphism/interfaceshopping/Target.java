package Module7.polymorphism.interfaceshopping;

/*
Creare a concrete class Target
	-Make the class final
	-Inherit Shopping and implement all abstract methods
	



*/
public final class Target extends Shopping{ // we have final keyword that means we can't inherite Target class anymore
	
	
	
	@Override
	public void buyItem() {
		System.out.println("Buying from Target");
		
	}
	
	@Override
	public void returnItem() {
		System.out.println("Returning Item to Target");
	}
	

}
