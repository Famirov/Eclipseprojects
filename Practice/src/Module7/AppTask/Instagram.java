package Module7.AppTask;


/*Create a class Instagram
 * - Instagram class inherits App class
 * - create constructor to call parent constructor and set up varaibles (name and version _
 * - create postPicture(): Example output: prints Posting picture to Instagram*/

public class Instagram extends App{
	
	// We hard coded our constructor, hardcoded name as Instagram and make version dynamic
	public Instagram (double version) {
		
		super("Instagram", version);
	}
	
	
	
	public void postPicture() {
		System.out.println("Posting a picture to Instagram");
	}
	
	
	
	
	
	
	

}
