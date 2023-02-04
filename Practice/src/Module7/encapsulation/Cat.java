package Module7.encapsulation;

public class Cat {
	
	private String name;
	private int mood;
	private int energy;
	private int hungry;
	
	private void meow() {
		System.out.println("Meooowww...");
	}
	
	public Cat(String name) {
		this.name = name;
		
	}
	
	public int getMood() {
		return mood;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	public int getHungry() {
		return hungry;
	}
	
	
	public void sleep() {
		mood++;
		energy++;
		hungry--;
		
	}
	
	public void play() {
		mood++;
		energy--;
		hungry++;
	
		
	}
	
	public void feed() {
		mood++;
		energy++;
		hungry--;
		meow();
	}

	
	


}
