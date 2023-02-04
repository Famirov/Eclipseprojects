package Module7.methodoverriding.geometrics;

public class Triangle extends Shape{
	
	
	void draw () {
		
		
		for(int i = 1; i<=5; i++) {
			for(int j= 0; j<i ; j++) {
				System.out.print("*");
			}
				System.out.println("");
		}
		
	}
	

}
