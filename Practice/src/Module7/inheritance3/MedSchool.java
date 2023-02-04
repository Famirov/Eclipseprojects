package Module7.inheritance3;

public class MedSchool extends University{
	
	public MedSchool() {
		
		super(8);
	}
	
	@Override
	
	public String graduationRequirements() {
		//This is method overriding
		String result = super.graduationRequirements();
		
		result += "AND Passing Medical exam is required";
		
		return result;
		
		
	}
	
	@Override
	//This is Method Overriding that doesn't have return type 
	public void printMinCreditsPerSemester() {
		
		super.printMinCreditsPerSemester();
		System.out.println("Also you have to have intership each semester");
		
		
	}
	
	


}
