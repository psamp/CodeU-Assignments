package com.psamp.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RentalCarTests {
	
	RentalCar firstCar;
	RentalCar secondCar;
	
	@Before
	public void beforeTests() {
		firstCar = new RentalCar("Chevy", "Impala", 345);
		secondCar = new RentalCar("GMC", "Yukon", 678);
	}
	
	@Test
	public void testToString() {
		
		String expected = "2009 Chevy Impala has an ID of 345.";
		String actual = firstCar.toString();
		
		System.out.println(actual);
		
		assertEquals(expected, actual);
		
	}

}
