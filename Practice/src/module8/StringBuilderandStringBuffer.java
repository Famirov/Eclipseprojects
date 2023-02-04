package module8;

public class StringBuilderandStringBuffer {

	public static void main(String[] args) {


		
/*Create a StringBuilder object with values:States
 * Add word United in front of it
 * Add America to the end of it
 * Remove states word from it
 * */		
		
		
		
		
		StringBuilder sb = new StringBuilder("States");
		
		System.out.println(sb);
		
		sb.insert(0, "United ");
		
		sb.append(" America");
		
		System.out.println(sb);
		
		System.out.println(sb.delete(6, 13));
		
		
		

	}

}
