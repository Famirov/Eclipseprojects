package Module7.encapsulation;

public class Practiceusernameage {

	public static void main(String[] args) {
		
		Human p1 = new Human();
		
		
		
//		p1.setName("Nazim");
//		System.out.println(p1.getName());
//		
//		
//		p1.setAge(55);
//		System.out.println(p1.getAge());
//		
//		p1.setGender("Male");
//		System.out.println(p1.getGender());
//		
//		p1.isDisable(true);
//		System.out.println(p1.isDisable());
		
		
		

	}

}

class Human{
	
	private String name;
	private int age;
	private String gender = "Male";
	private boolean disable;
	
	
	
	
	public void setName(String userName) {
		
	if(userName.isEmpty()) {
		System.out.println("You entered incorrect name!");
		
	}else {
		this.name= userName;
	}
		
	}
	
	
	public String getName() {
		return name;
	}
	
	
	
	
	public void setAge (int userAge) {
		
		if (userAge<0 || userAge>65) {
			System.out.println("You have entered invalid number!");
		}else {
			this.age = userAge;
		}
		
	}
	
	
	
	public int getAge() {
		return age;
	}
	
	
	
	
	public void setGender(String userGender) {
		
		
		
		if(gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Male")) {					//------------------------>Why it's giving me NullPointerException when value of String line 32 null?
			System.out.println("Thank you Sir!");
			
			this.gender = userGender;

			}
	
	}	
	
	public String getGender() {
		return gender;
	}
	
	
	
	public void isDisable(boolean disable) {	//--------------> Could you please check my boolean, printline works but the result still shows false
												//--------------> Can you please send me 2 question with answers with only boolean encapsulation + if function so that I can undestand.
		if(disable == true) {
			System.out.println("Please apply for Ontario Disability Benefit!");
			this.disable = disable;
		}else {
			System.out.println("How can we help you today? ");
		}
		
		
	}
		
	
	public boolean isDisable() {
		return disable;
	}
	
	
//	public void isNotDisable (boolean disable) {
//		if(disable == false) {
//			System.out.println("How can we help you today? ");
//		}else {
//			disable = true;
//		}
//	}






	
	
	
	
	
	
	
}
