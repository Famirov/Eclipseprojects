package Module7.polymorphism.ploymorphismpractice;

public class Main {

	public static void main(String[] args) {
		
		JavaTextBook book1 = new JavaTextBook();
		book1.name = "Java Programming";
		book1.size =20.5;
		book1.fun = true;
		book1.read();
		book1.download();
		book1.open();
		System.out.println("================================");
		
		EBook book2 = new JavaTextBook();
		
		book2.name = "Java Programming";
		book2.size =20.5;
//		book2.fun = true;
		((JavaTextBook)book2).fun = false;// DownCasting
		/*the reference from the parent EBook to the child reference JavaTextBook
		 *  and that allows to access the fun variable */
		book2.read();
		book2.download();
		book2.open();
		System.out.println("================================");
		
		Book book3 = new JavaTextBook();
		
		book3.name = "Java Programming";
//		book3.size =20.5;
//		book3.fun = true;
		book3.read();
//		book3.download();
//		book3.open();
		
		System.out.println("================================");
		
		Downloadable book4 = new JavaTextBook();
		
//		book4.name = "Java Programming";
//		book4.size =20.5;
//		book4.fun = true;
//		book4.read();
		book4.download();
//		book4.open();
		
		//DownCasting another way doing it to re-use it multiple times.
		//book4 was the interface reference,we caset the reference to be a JavaTextBook and
		//assigned it to the book5 reference
		JavaTextBook book5 = ((JavaTextBook)book4);
		book5.read();
		book5.open();
		
		

	}

}
