package DailyPractice;

public class Lastthreechar {

	public static void main(String[] args) {
		
		String input = "experience";
		
		String lastThreeChars = getLastThreeCharacter(input);
		
		System.out.println(lastThreeChars);
	

	}
	
	
	
	/**Write me a method that will accept string and returns last 3 characters*/
	
	public static String getLastThreeCharacter(String input) {
		
		String outcome = "";
		
		for(int i = input.length()-3;i<input.length();i++) {
			
				outcome = outcome + input.charAt(i);
			}
			return outcome;
		
		
//		if(input.length()>=3 ) {
//			
//			return input.substring(input.length()-3);
//			
//		}else {
//			return input;
//		}
		
		
		
		
	}

}
