package Module7.encapsulation2;

public class Pizza {
	
/**Create a class called Pizza
 *1.data:
 *size(String), number of toppings
 */
	
	private String size;
	private int toppings;
	
	
 /*2. Create a constructor that creates a Pizza objects with the length and the width
 *call setters here
 */
	
	public Pizza(String size, int toppings) {
		setSize(size);
		setToppings(toppings);
	}
	
	
	
 
 
 /*3.Encapsulate the Pizza class
 *-setter conditions:
 *size can only be: small, medium or large
 *number of toppings must be a positive number
 */
 
	
	public String getSize() {
		return size;
	}
	
	
	public void setSize(String size) {
	
		
		//Option 1
//		switch(size){
//		
//		case "small":
//		case "medium":
//		case "large": 
//			this.size = size;
//		}
		
		
		//Option 2
		if(size.equalsIgnoreCase("small") || 
		   size.equalsIgnoreCase("medium")|| 
		   size.equalsIgnoreCase("large"))
		{
			
			this.size =size;
		}

		
	}
	
	
	public int getToppings() {
		return toppings;
	}
	
	public void setToppings(int toppings) {
		
		if(toppings>=0) {
		this.toppings = toppings;
		}
	}
	
	
	
 /*4. other methods methods
 *-calculatePrice()
 *calculate the price of the pizza based on:
 *small bsae: $4
 *medum base: $6
 *large base: $8
 *each topping adds $0.75 to the price
 *calculate the total price and return the cost*/

	public double calculatePrice() {
		
		if (size == null){
			 return -1;
		}
		
		// ? means assign the number
		//: means check the next condition
	
		double price =  size.equalsIgnoreCase("small") ? 4
						: size.equalsIgnoreCase("medium") ? 6
						: 8; 
		  
		return price +( toppings* 0.75);
			
		}
	
	
	
	
 /*-toString()
 *print the size, number of toppings and cost of the pizza **/
	
	
	public String toString(){
		
		return "Size: " + getSize() + " |Number of Toppings: " + getToppings() + " |Price: $" + calculatePrice();
		
	}
	
	
	
	

}
