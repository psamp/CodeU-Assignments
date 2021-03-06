package com.psamp.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RentalCarTests {
	
	RentalCar c1;
	RentalCar c2;

	@Before
	public void setUp() {
		c1 = new RentalCar(2007, "Chevy", "Impala", 1, "Lora", "Ipsum");
		c2 = new RentalCar("GMC", "Yukon", 2, "Dolor", "Siamet");
	}

	@Test
	public final void testToStringCarOne() {
		String expected = "Lora Ipsum drives the 2007 Chevy Impala (ID: 1.)" + "\n";
		String actual = c1.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testToStringCarTwo() {
		String expected = "Dolor Siamet drives the 2009 GMC Yukon (ID: 2.)" + "\n";
		String actual = c2.toString();
		
		assertEquals(expected, actual);
	}

}
