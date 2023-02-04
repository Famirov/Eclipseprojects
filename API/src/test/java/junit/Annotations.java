package junit;

import org.junit.After;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.*;

public class Annotations {
	
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	
	
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	
	@Test @Ignore
	public void test3() {
		System.out.println("Test3");
	}
	
	
	
	@After
	public void test4() {
		System.out.println("Test4");
	}
	
	
	@Before
	public void test5() {
		System.out.println("Test5");
	}
	
	
	
	
	@BeforeClass
	public static void test6() {
		System.out.println("Test6");
	}
	
	
	@AfterClass
	public static void test7() {
		System.out.println("Test7");
	}
	
	
	

}
