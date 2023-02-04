package Module7.encapsulation2;

public class TrafficLight {
	
	private String color;
	
	
	public TrafficLight(String color) {
		setColor(color);
	}
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		
		switch(color){
			case "red": 
			case "yellow":
			case  "green":
			this.color = color;
			
		}
		
		
	}
	
	
	
	

}
