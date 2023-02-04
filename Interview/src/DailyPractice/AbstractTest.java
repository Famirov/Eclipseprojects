package DailyPractice;

import org.junit.AfterClass;
import org.junit.BeforeClass;

public class AbstractTest {
	
  	@BeforeClass
	  public void beforeClass() {
    	System.out.println("abstract");
    }
  
    @AfterClass
  	public void afterClassAbstract() {
      System.out.println("after class abstract");
    }

}
