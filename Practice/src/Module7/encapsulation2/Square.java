package Module7.encapsulation2;

public class Square {
	
/**Create a class called Square 
 * -data:
 * side
 */
	
	private int side;
	
	
 /* -constuctor
 * -create a consturctor that creates a square object with the side*/
	


	public Square(int side) { 
		setSide(side); // we change this.side = side; to setSide(side)
		// use the method that has group of code to call the 
		//setter method within the constructor
		// if we will not put this, end user can give negative number
		// as a default value in argument
		
	}
	
	
	
/* call setter here
 * -encapslate the Square class
 * -setter condition:side must be a positive 
 * number otherwise it will not be assigned to the instance variable*/
	
	
		public int getSide(){
			return side;
		}
		
		public void setSide(int side) {
			if(side>0) {
				this.side = side;
			}
			
		}
		
	
	
	
/* -other methods methods:
 * -calculateArea()
 * calsulate and return the area of a Square
 * -calculatePerimeter()
 * calculate and return the perimeter of a Square
 * 
 * -toString()
 * print the side, area, and perimeter of the Square obejct 
 * Create a seperate class to create and test the Square objects
 * */	
		
		public int calculateArea() {
			int area = side*side;
			 return area;
		}
		
		
		public int calculatePerimeter() {
			
			int perimeter = side*4;
			
			return perimeter;
		}
		
		
		@Override
		public String toString() {
			
			
			return "side: " + side+ "\n" + "area: " + calculateArea()  + "\n" +"perimeter: " + calculatePerimeter();
		}
		
		
		
		
	

}
