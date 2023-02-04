package Module7.methodoverriding.cydeo2;

public class LyftXL extends Lyft {
	
	public LyftXL (String driver) {
		super(driver);
	}
	
	
	public double calculateRate(int miles) {
		return super.calculateRate(miles)*1.1;
	}
	
	

}
