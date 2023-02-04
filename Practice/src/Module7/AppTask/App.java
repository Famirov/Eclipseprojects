package Module7.AppTask;

public class App {
	
/* Create an App class
 * - create variables: name(app name), version
 * - create constructor to initilaize the variables
 * - create method: download() Example output: $name is downloading $ version 
 *	
 */
	
	
	public String name;
	public double version;
		
	public App(String name, double version ) {
		
		this.name = name;
		this.version = version;
		
	}
	

	
	

	public void download() {
		
		System.out.println(name +  " is downloading " + version);
		
	}
	
	

}
