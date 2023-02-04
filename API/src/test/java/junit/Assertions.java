package junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class Assertions {
	
	@Ignore @Test
	public void test1 (){
		
		
//		int expectedStatusCode = 200;
		int actualStatusCode = 200;
		
		assertTrue("Your status code is: ",actualStatusCode==500);
		
		
	}
	
	
	@Ignore @Test
	public void test2() {
		
		boolean isPassed = true;
		
		assertFalse("Your result failed:" , isPassed);
		
	}
	
	
	@Ignore @Test
	public void test3() {
		
		String city = "London";
		assertEquals("London",city);
		
	}
	
	@Ignore @Test
	public void test4() {
		
		String city = "London";
		
		assertNotEquals("New York", city);
		
	}
	
	
	@Ignore @Test
	public void test5() {
		String value = "API";
		String word = null;
		
		assertNull(word);
	}
	
	
	@Test 
	public void test6() {
		String value = "API";
		String word = null;
		
		assertNotNull(word);
		/*Failes*/
	}
	
	
	
	

}
