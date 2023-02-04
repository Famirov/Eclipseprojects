package DailyPractice;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestClass extends AbstractTest {
	
	
  	@BeforeClass
	  public void beforeClass() {
    	System.out.println("test class");
    }
  
  	@Test
  	public void testMethod() {
    	System.out.println("test method");
    }
  
    @AfterClass
  	public void afterClass() {
      System.out.println("after class");
    }
	

}
