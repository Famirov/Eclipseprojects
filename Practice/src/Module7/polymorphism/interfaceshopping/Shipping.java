package Module7.polymorphism.interfaceshopping;

/*
Create an interface Shipping
	-Declare an abstract methods:
	payForShipping(boolean)

*/
public interface Shipping {
	
	String country = "US";
	
	public abstract void payForShipping(boolean b);
	

}
