package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		MyInteger a=new MyInteger(3);
		MyInteger b=new MyInteger(6);
		MyInteger c=new MyInteger(9);
		
		assertEquals(false, a.isEven());
		assertEquals(true, b.isEven());
		assertEquals(false, c.isEven());
		
		assertEquals(true, a.isOdd());
		assertEquals(false, b.isOdd());
		assertEquals(true, c.isOdd());
		
		assertEquals(true, a.isPrime());
		assertEquals(false, b.isPrime());
		assertEquals(false, c.isPrime());
	}

}
