package Module7.polymorphism.interfacemethods;

public class Main {

	public static void main(String[] args) {


		//Call by interface
				System.out.println(Mac.NAME);
				System.out.println(Mac.OS);
				
				//Call by classname that inherite that interface
				System.out.println(MacbookPro.NAME);
				System.out.println(MacbookPro.OS);
				// You can access the static variables from the child class reference, but you should use the interfacce to access it.
				
				System.out.println("==========================================");
				// Mac.turnOn(); not valid need an object to call this method.
				
				Mac.company();//copy of company
				///Mac.faceTime(); --> Default method needs to be called from the object
				System.out.println("===========================================");
				MacbookPro obj = new MacbookPro(); //Making an object of MacbookPro
				obj.turnOn();
				obj.faceTime();
	}

}
