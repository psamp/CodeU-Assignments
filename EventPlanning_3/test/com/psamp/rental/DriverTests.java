package com.psamp.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DriverTests {
	
	Driver driver;
	
	@Before
	public void beforeTests() {
		driver = new Driver("Princess", "Sampson");
	}

	@Test
	public void testToString() {
		
		String expected = "Princess Sampson";
		String actual = driver.toString();
		
		assertEquals(expected, actual);
		
	}

}
