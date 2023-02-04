package Module7.polymorphism.interfaceshopping;

// We are passing the methods from Shipping and AllowUserToSell interface to the ConsumerApp interface

//going from interface to interface, so we use extends. Remember these are interface, so they don;t follow the same rules as classes. We can extend multiple interfaces.


public interface ConsumerApp extends Shipping, AllowUserToSell{

	
	
}


// the first example is if we implement both of the original interface to a class directly
abstract class TestA implements Shipping, AllowUserToSell{}



//in this example we use the ConsumerApp interface that had Shipping and AllowUserToSell interface inherited.
// They are doing the same thing but this one is more organized and grouped.

abstract class TestB implements ConsumerApp{}