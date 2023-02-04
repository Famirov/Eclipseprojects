package Module7.polymorphism.ploymorphismpractice;
/*
 Create a concrete class JavaTextBook
 	-	Inherits EBook
 	-	Declare a fun variable
 	-	Override all abstract methods
 */

public class JavaTextBook extends EBook {
	
	boolean fun;
	
	@Override
	public void read() {
		System.out.println("Reading Java Textbook");
	}

	@Override
	public void download() {
		System.out.println("Downloading Java Textbook");
		
	}

	@Override
	public void open() {
		System.out.println("Opening Java Textbook");
		
	}
	

}
