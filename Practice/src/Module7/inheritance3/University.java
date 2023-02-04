package Module7.inheritance3;

public class University {
	
	public int duration;
	public int minCreditsToGraduate;
	public int minCreditsPerSemester;
	public double tuitionPerCredit;
	
	public University() {
		
		System.out.println("University Constructor getting executed");
	}
	
	public University(int duration) {
		this();
		this.duration = duration;
		
	}
	
	public University(int duration,int minCreditsToGraduate, int minCreditsPerSemester, double tuitionPerCredit ) {
		
		this(duration);
		this.minCreditsToGraduate = minCreditsToGraduate;
		this.minCreditsPerSemester = minCreditsPerSemester;
		this.tuitionPerCredit = tuitionPerCredit;
		
		
	}
	
	public String graduationRequirements() {
		
		
		
		return duration + "years of studies required";
	}
	
	public void printMinCreditsPerSemester() {
		
		System.out.println(minCreditsPerSemester + " Number of minimum number of allowed per semester"); 
	}
	
	

}
