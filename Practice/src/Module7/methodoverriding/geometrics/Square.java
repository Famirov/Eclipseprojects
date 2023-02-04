package Module7.methodoverriding.geometrics;

public class Square extends Shape{
	
	void draw () {
		for(int i = 0; i<5; i++) {
			for(int j = 0; j< 5 ;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}

}
