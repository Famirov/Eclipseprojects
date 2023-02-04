package Module7.polymorphism.ploymorphismpractice;
/*
 Create an abstract class EBook
 	-Inherits Book and implements Downloadable
 	-Declare a size variable
 	-Declare an abstract methods:
 		open();
 */

public abstract class EBook extends Book implements Downloadable{
	
	// can't be static, final, private
	double size;
	
	public abstract void open();
	

	
}

