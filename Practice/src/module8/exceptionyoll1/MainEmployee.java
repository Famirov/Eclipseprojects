package module8.exceptionyoll1;

public class MainEmployee {

	public static void main(String[] args) throws Exception {
		
		Employee accountant = new Employee("John", "Doe");
		System.out.println(accountant);
		
//		Employee accountant2 = new Employee ("     ", null);
//		
//		System.out.println(accountant2);
		
		accountant = null;
		
		Employee.giveBonus(accountant);
		

	}

}
