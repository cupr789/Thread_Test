package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import service.Cal;

public class CalTest {

	@BeforeClass
	public static void setUpBefoClass() {
		System.out.println("난 최초 1번만 실행");
	}
	
	@Before
	public void setUp() {
		System.out.println("난 함수 호출만큼 실행!");
	}
	
	@Test
	public void addTest() {
		Cal c= new Cal();
		assertEquals(10	, c.add(3, 4)); 
	}
	
	@Test
	public void minusTest() {
		Cal c= new Cal();
		assertEquals(-1	, c.minus(3, 4)); 
	}
	@Test
	public void multipleTest() {
		Cal c= new Cal();
		assertEquals(10	, c.multiple(3, 4)); 
	}
	@Test
	public void divideTest() {
		Cal c= new Cal();
		assertEquals(0	, c.divide(3, 4)); 
	}

}
