package Module7.methodoverloading;

public class ArrayIndexOf {
	
	
	public static int numbers = 10;
	
public static void main(String[] args) {
		
	/*ArrayIndexOf example*/
	
	System.out.println(ArrayIndexOf.numbers);
	int [] arr = {2,5,7,9,12,8};
	
	System.out.println(indexOf(arr,7));
	
	String [] words = {"java", "C#", "python", "hello"};
	
	System.out.println(indexOf(words,"java"));
	
	
	}
	





	public static int indexOf (String [] strs, String element) {
		
		for(int i = 0; i< strs.length; i++ ) {
			
			if(strs[i].equals(element)) {
				
				return i;
				
			}
		}	
		return -1;
		
		
	}	
		
		
		
		
		
		
	public static int indexOf (int [] nums, int element) {	
		for(int i = 0; i< nums.length; i++ ) {
			
		if(nums[i] == element) {
			
			return i;
			
		}
	}	
		return -1;
	}
	

}
