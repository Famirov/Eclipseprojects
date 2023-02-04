package module8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListOfMapsworkingwithDataBase {

	public static void main(String[] args) {
		
		
		// With Maps we can represent the records in data base where each map acts as a individual object
		// Then we can 
		// EmployeeId | FirstName | LastName | Age | 
		// 12345      | John      | Doe      | 23  |
		// 44553      | Bart      | Simpson  | 45  |
		
		Map<String, String> employee1 = new HashMap<>();
		employee1.put("FirstName", "John");
		employee1.put("LastName", "Doe");
		employee1.put("Age", "23");
		employee1.put("EmployeeId", "12345");
		
		Map<String, String> employee2 = new HashMap<>();
		employee2.put("FirstName", "Bart");
		employee2.put("LastName", "Simpson");
		employee2.put("Age", "45");
		employee2.put("EmployeeId", "44553");
		
		Map<String, String> employee3 = new HashMap<>();
		employee3.put("FirstName", "Lisa");
		employee3.put("LastName", "Simpson");
		employee3.put("Age", "33");
		employee3.put("EmployeeId", "77564");
		
	    List<Map<String, String>> employees = new ArrayList<>();
	    employees.add(employee1);
	    employees.add(employee2);
	    employees.add(employee3);
		
//	    System.out.println(employees );
	    
	    // How to get some values that we need
	    
		for(int i =0; i< employees.size(); i++) {
			System.out.println(employees.get(i));
			
			if(employees.get(i).get("FirstName").equals("Bart")) {
				System.out.println("Employees age is: " + employees.get(i).get("Age") + " and Last Name: " + employees.get(i).get("LastName"));
			}
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}
