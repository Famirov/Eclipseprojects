package Module7.encapsulation;

public class TV {
	
	private int channel = 1;
	private int volumeLevel = 1;
	private boolean on ; // true or false
	private String brand;
	
	
	//Create one "no arguments" constructor that prints message: "Creating TV object
	//using no Args- constructor".
	
	public TV() {
		
	}
	
	//Also, create one more constructor that defines instance variable brand, and
	//displays message:"Creating TV object using 1 arg - constructor"
	public TV(String brand) {
		
		this.brand = brand;
		
		System.out.println("Creating TV object using 1 arg - constructor");

	}
	
	
	//4. Generate Getters and Setters for:
	//volumeLevel, channel
	
	public int getVolumeLevel() {
		return volumeLevel;
	}
	
	public int getChannel() {
		return channel;
	}
	
	
	public void setVolumeLevel(int volumeLevel) {
		this.volumeLevel = volumeLevel;
		
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
	
	//Create isOn(), turnOn() and turnOff() methods for changing the state of "on"
	//instance variable.
	
	public boolean isOn() { // isOn is a getter
		return on;
	}
	
	public void turnOn() {
		// we need to check if the tv is off and if it is off only then we will turn it on
		
		
		// this is a setter
		if(isOn() == true) { // if my tv is on i will not turn on again, I will just print a message
			System.out.println("TV is already ON");	
		} else { // here imeans my tv on field in false and I need to turn it on
			on = true;
		}

	}
	
	
	
	// this is a setter for turning off
	public void turnOff() {
		
	
		if(isOn() == false) {
			System.out.println("TV is already OFF");	
			
		}else {
			on = false;
		}
		
		
		
	}

	
	
		
		
		//Declare methods channelUp() to increase variable channel by one
		
		public void channelUp() {
			
			if(isOn() == true && getChannel() < 120 ) {
				setChannel(getChannel() + 1);
			} else {
				System.out.println("ERROR - either TV is off or the channel is out of the range!");
			}
			
		}
		

		public void channelDown() {
            
			if(isOn() == true && getChannel() > 1 ) {
				setChannel(getChannel() - 1);
			} else {
				System.out.println("ERROR - either TV is off or the channel is out of the range!");
			}

		}
		
		public void volumeUp() {
			
			if(isOn() == true && getVolumeLevel() < 7) {
				setVolumeLevel(getVolumeLevel() + 1);
			} else {
				System.out.println("ERROR - either TV is off or the volume is out of the range!");
			}
			
		}
		
		public void volumeDown() {
			
			if(isOn() == true && getVolumeLevel() > 1) {
				setVolumeLevel(getVolumeLevel() - 1);
			} else {
				System.out.println("ERROR - either TV is off or the volume is out of the range!");
			}
			
		}

		
	}


		
		
		
		
		
		
		
public void volumeUp() {
	
	if(isOn() == true && getVolumeLevel() < 7) {
		setVolumeLevel(getVolumeLevel() + 1);
	} else {
		System.out.println("ERROR - either TV is off or the volume is out of the range!");
	}
	
}

public void volumeDown() {
	
	if(isOn() =	public void volumeUp() {
	
		if(isOn() == true && getVolumeLevel() < 7) {
			setVolumeLevel(getVolumeLevel() + 1);
		} else {
			System.out.println("ERROR - either TV is off or the volume is out of the range!");
		}
		
	}
	
	public void volumeDown() {
		
		if(isOn() == true && getVolumeLevel() > 1) {
			setVolumeLevel(getVolumeLevel() - 1);
		} else {
			System.out.println("ERROR - either TV is off or the volume is out of the range!");
		}
		
	}

	
}
meLevel(getVolumeLevel() - 1);
	} else {
		System.out.println("ERROR - either TV is off or the volume is out of the range!");
	}
	
}


}

	
	
	
	
	
	


