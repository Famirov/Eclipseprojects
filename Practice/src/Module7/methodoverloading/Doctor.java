package Module7.methodoverloading;

public class Doctor {
	
	String name;
	String expertOn;
	int yearOfExperience;
	boolean isAvailable;
	
	public Doctor(String name,String expertOn,int yearOfExperience, boolean isAvailable ) {
		this.name = name;
		this.expertOn = expertOn;
		this.yearOfExperience = yearOfExperience;
		this.isAvailable = isAvailable;
		
	}
	
	
	public boolean assignToSurgery() {
		
		return yearOfExperience>=5 && isAvailable ; 
		
		
	}
		
		public boolean assignToSurgery( String expertise ) {
			
			return assignToSurgery() && expertOn.equalsIgnoreCase(expertise);
		
		}
		 
		
	
		
		
	

}
