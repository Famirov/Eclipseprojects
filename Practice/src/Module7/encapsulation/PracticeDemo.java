package Module7.encapsulation;

public class PracticeDemo {

	public static void main(String[] args) {
		
//		Test1 t1 = new Test1();
//		t1.getAge();
//		t1.getGender();
//		t1.isDisabled();
//		
//		System.out.println("----------Before-------------");
//		System.out.println(t1.getAge());
//		System.out.println(t1.getGender());
//		System.out.println(t1.isDisabled());
//		
//		t1.setAge(34);
//		t1.setDisabled(true);
//		
//	
//		
//		System.out.println("----------After---------------");
//		System.out.println(t1.getAge());
//		System.out.println(t1.getGender());
//		System.out.println(t1.isDisabled());
		
		
//		Test2 t = new Test2(11.5,7,9);
//		t.powerSwitch();
//		
//		System.out.println(t.channelTurning(4));
//		System.out.println(t.decreseVolume());
		
		
		// here we create an object with default constructor 
//		TV lg22 = new TV();
		
		// here we create an object with 1 args constructor 
		TV lg23 = new TV("LG");
		
		
		lg23.channelUp();
		
		lg23.turnOn();
		System.out.println("TV is on: "+lg23.isOn());
		
		lg23.channelUp();
		System.out.println(lg23.getChannel());
		
		lg23.turnOn();
		
		lg23.volumeDown();
		
		lg23.turnOff();

		
		
		
		
		
		
	}

}
