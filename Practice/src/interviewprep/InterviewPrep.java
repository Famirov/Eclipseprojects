package interviewprep;

import java.util.Scanner;

public class InterviewPrep {

	public static void main(String[] args) {
		/* Username longer that 3 char and starts with 3 a
		 * 
		 * 
		 * 
		 */
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Please eneter your username!");
//				
//		String username = sc.nextLine();;
//		
//		if(username.length()>=3 && username.startsWith("aaa")) {
//			
//			System.out.println("Welcome!");
//		}else {
//			System.out.println("invalid!");
//		}
		
		
		
		
/*
 * Passsword should not start with capital letter
 * should be longer than 4 char
 * and end with aa
 * */		
		
		
		Scanner scan = new Scanner(System.in);
		
		String password = scan.nextLine();
		
		if(password.startsWith(password.toLowerCase())&& password.length()>4 && password.endsWith("aa")) {
			System.out.println("Well Done!");
		}else {
			System.out.println("Please follow the requirements!");
		}
		
		
		
		

	}

}
