package com.codeu.event.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.Rentable;
import com.codeu.event.rental.RentalCar;

public class RentalCarTests {
	
	private RentalCar c1;
	private RentalCar c2;

	@Before
	public void setUp() {
		
		c1 = new RentalCar(2007, "Chevy", "Impala", 56, "Lora", "Ipsum");
		c2 = new RentalCar("GMC", "Yukon", 56, "Dolor", "Siamet");
	
	}

	@Test
	public final void testToString() {
		
		String expectedOne = "Lora Ipsum drives the 2007 Chevy Impala (ID: 56.)" + "\n";
		String actualOne = c1.toString();
		
		String expectedTwo = "Dolor Siamet drives the 2009 GMC Yukon (ID: 56.)" + "\n";
		String actualTwo = c2.toString();
		
		assertEquals(expectedOne, actualOne);
		assertEquals(expectedTwo, actualTwo);
		
	}
	
	@Test
	public final void testEquals() {
		
		boolean expectedOne = true;
		boolean actualOne = c1.equals(c2);
		
		boolean expectedTwo = true;
		boolean actualTwo = c2.equals(c1);
		
		assertEquals(expectedOne, actualOne);
		assertEquals(expectedTwo, actualTwo);
		
	}

}
