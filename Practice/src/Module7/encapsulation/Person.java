package Module7.encapsulation;

public class Person {
	

	private String name;
	private int age;
	private double height;
	
	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
/*******************************************/	
	
	public String getName() {
		return name;
	}
		
	public int getAge() {
		return age;
	}
	
	public double getHeight() {
		return height;
	}
	
	
	
}
