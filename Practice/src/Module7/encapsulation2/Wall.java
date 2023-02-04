package Module7.encapsulation2;

public class Wall {
	
/**Write a class with the name Wall. The class needs two fields (instance variables) with name width and height of type double.*/
	
	private double width;
	private double height;
   
/*The class needs to have two constructors. 
* The first constructor does not have any parameters (no-arg constructor). */
	
	
	public Wall() {
		
	}
	
/*The second constructor has parameters width and height of type double and it needs to initialize the fields.*/
	
	public Wall(double width, double height) {
		
		setWidth(width);
		setHeight(height);
			
	}
	
	
	
	
/**	In case the width is less than 0 it needs to set the width field value to 0,
 * 
	in case the height parameter is less than 0 it needs to set the height field value to 0.
	
	
	**/
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		
		if(width>=0) {
			
			this.width = width;
		}else{
			this.width = 0;
		}
	}
			
		
		
	
	
	
	
	public double getHeight() {
		return height;
	}
	
	
	public void setHeight(double height) {
		
	
		if(height>=0) {
			
			this.height =height;
		}else {
			this.height = 0;
		}
		
	}
	
	
/***Method named getArea without any parameters, it needs to return the area of the wall.*/	
	
	
	public double getArea() {
		
		double area = width*height;
		
		 return area;
	}
	
	

 



	
	

}
