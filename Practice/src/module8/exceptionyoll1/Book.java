package module8.exceptionyoll1;

import java.util.Stack;
/*
 Create a stack of book(book1, book2, book3)
 Print your stack
 Push book4 to stack and print the stack
 Remove and return the two last added object from stack
 returns last added element from the stack without removing it 
 Print your stack
 */


public class Book {

	public static void main(String[] args) {

		Stack<String>book = new Stack<String>();
		book.push("Ali and Nino");
		book.push("The Alchemist");
		book.push("Crime and Punishment");
		System.out.println(book);
		book.push("Loard of the Rings");
		System.out.println(book);
		
		System.out.println("removed book: " + book.pop()+" and " + book.pop());
		
		System.out.println("search last added element from top of the stack: "+ book.peek());
		System.out.println(book);
		
		
		
		
		

	}

}
