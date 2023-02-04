package Module7.AppTask;

/*Create a class Youtube
 * - Youtube class inherite App class
 * - Create constructor to call parent constructor and setup variables name and version )
 * - Create a method: watchVideo(): Example outprint: prints Watching java tutorial*/


public class Youtube extends App {
	
	// We hard coded name of the constructor but left the version as a dynamic
	
	public Youtube(double version) {
		
		super("Youtube", version);
		
	}
	
	public void watchVideo() {
		
		System.out.println("Watching java tutorial");
	}
	
	

}
