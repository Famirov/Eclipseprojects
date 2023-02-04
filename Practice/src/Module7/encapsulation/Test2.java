package Module7.encapsulation;

public class Test2 {
	
	private double width;
	private double height;
	private double screenSize;
	private int maxVolume;
	private int volume = 12;
	private boolean power;
	
	
	//This is a constructor. There is no return type and same as class name
	public Test2(double width, double height, double screenSize) {
		this.width = width;
		this.height = height;
		this.screenSize =screenSize;
		
	}
	

	
	// Method 1
		public double channelTurning(int channel) {
			
						
			switch (channel) {
			case 1:
				return 34.58;
			case 2:
				return 54.89;
			case 3:
				return 73.89;
			case 4:
				return 94.98;
			}
			return 0;
			
			
		}
		
	//Method 2
		public int decreseVolume() {
			if(0<volume) {
				volume--;
			}
			return volume;
		}
		
	// Method 3
		public void powerSwitch() {
			this.power = !power;
		}
		
	// Method 4	
		public int increaseVolume () {
			if (maxVolume >volume) {
				volume++;
				
			}
			return volume;
		}

		
		
		
	
	
}
