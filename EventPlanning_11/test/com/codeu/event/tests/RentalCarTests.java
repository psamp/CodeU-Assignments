package com.codeu.event.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.Rental;
import com.codeu.event.rental.RentalCar;

public class RentalCarTests {
	
	private Rental c1;
	private Rental c2;

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
