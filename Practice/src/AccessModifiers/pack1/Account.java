package AccessModifiers.pack1;

public class Account {
	
	private String username;// instance variable
	private String password;
	
	// for private fields we can create getters and setters
	//Setters-set the value for private fields
	public void setUsername(String username) {
		this.username = username;//within paranthesis olan local variable or instance aiddir.
		//this.username  private olan variable-a aiddir.
	}
	
	
	public void setPassword(String password) {
		
		if(password.length()>10) {
			this.password = password;
		}else {
			System.out.println("Your password is invalid");
		}
		
		
	}
	
	
	//Getters-allow you to get the value from private fields
	
	public String getUsername() {
		return username;
	}
	
	
	public String getPassword() {
		return password;
	}
	

}
