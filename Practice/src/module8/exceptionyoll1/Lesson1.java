package module8.exceptionyoll1;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import Module7.encapsulation.Cat;

public class Lesson1 {

	public static void main(String[] args) {

		String [] arr = {"Hey", "Hola", "Salam"};
		
//		System.out.println(arr[3]);
		
		/*Sources of Common Unchecked Exceptions*/
		//Usually unchecked exceptions occur because of the bad coding behavior
		
		
		/*1. 	InputMismatch*/
		// if we will put any other type of variables rather than int
//		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter your age: ");
//		int age = sc.nextInt();
//		System.out.println("Age: " + age);
		
		
		/*2. 	Aritmethical Exception*/
//		int a = sc.nextInt();
//		System.out.println(10/a);
		
		
		/*3		ArrayIndexOutOfBoundsException*/
		
//		int [] arr1 = {1,2,3};
//		System.out.println(arr1[5]);
		
		
		
		
		/*4		NullPointerException*/
		//We can't perform any operations on a null object 
		
//		String str = null;
//		System.out.println(str.charAt(0));
		
		
		/*5.   	StringIndexOutOfBoundsException*/
		
//		String str = "Exception";
//		
//		System.out.println(str.charAt(20));
		
		
		/*6.	NumberFormatException*/
//		String str2 = "20.5";
//		
//		int number = Integer.valueOf(str2);
		
		
		/*Common Checked Exceptions*/
		
//		Cat cat = new Cat("Garfield");
//		
//		System.out.println(cat.cat);
		
		
		
		/*Handle Exceptions*/
		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter your age: ");
//		
//		// Use try keyword and block of code
//		// Place inside the code that might be throwing an exception 
//		
//		int age = 0;
//		
//		try {
//			 age = in.nextInt();
//			
//		}catch(InputMismatchException e) {
//			
//			System.out.println("You have entered wrong input! Try again");
//			in.nextLine();
//			age = in.nextInt();
//		}
//		
//		System.out.println("Age: " + age);
		
		
		
		
//		
//		int a = 10;
//		int b = 0;
//		
//		//We cannot use try as a stand alone block
//		// It has to have at least one catch block of finally block
//		
//		try {
//			System.out.println(a/b);// try block always get executed
//		}catch(Exception e ){
//			
//			//The catch block is only executed when an exception occurs
//			System.out.println("You cannot divide by 0!");
//			System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
//			System.out.println("It worked!");// it's printed even we have an exception
//		
		
		
		
/*Task 
 
 Creare a string and assign null to it
 Print 2nd character of that string
 Handle the exception with try catch block
 Print exception details.
 
 */		
		
		
//		String name = null;
//		
//		try {
//			System.out.println(name.charAt(2));
//		
//		}catch (Exception e ) {
//			
//			System.out.println("Please assign the value to the String name");
//			System.out.println(" ");
//			System.out.println(e.getMessage());
//			System.out.println(" ");
//			e.printStackTrace();
//		}
		
		
		
		
		//Online Library store
		
//		Scanner sc = new Scanner(System.in);
//		
//		String []books = {"Atomic habits","Java", "Fathers and sons","Crime and punishment", "Angels and Demons"};
//		
//		System.out.println("Welcome to onlin library");
//		System.out.println("Here are available books");
//		System.out.println(Arrays.toString(books));
//		System.out.println("Enter what book number you want?");
//		
//		int bookNumber;
//		
//		try {
//		
//		bookNumber = sc.nextInt();
//		System.out.println("You got: " + books[bookNumber-1]);
//		System.out.println("Create a connection to online store");
//		
//		}catch(Exception e) {
//			System.out.println("You have to enter book number based on availability!");
//			System.out.println("The last book number in our library is: " + books.length);
//			System.out.println(e.getMessage());
//		}finally {
//			System.out.println("Thank you for visiting our library");
//			System.out.println("Log out and close connection...");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
