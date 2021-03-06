package com.psamp.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RentalCarTests {
	
	RentalCar firstCar;
	RentalCar secondCar;
	
	@Before
	public void beforeTests() {
		
		firstCar = new RentalCar("Chevy", "Impala", 345, "Ahsoka", "Tano");
		secondCar = new RentalCar("GMC", "Yukon", 678, "Avatar", "Korra");
		
	}
	
	@Test
	public void testNewObjects() {
		
		assertNotNull(firstCar);
		assertNotNull(secondCar);
		
		assertTrue(firstCar.getMake().equals("Chevy"));
		assertTrue(firstCar.getModel().equals("Impala"));
		
		assertTrue(secondCar.getMake().equals("GMC"));
		assertTrue(secondCar.getModel().equals("Yukon"));
		
		assertTrue(firstCar.getID() == 345);
		assertTrue(secondCar.getID() == 678);
		
		assertTrue(firstCar.getDriver().equals("Ahsoka Tano"));
		assertTrue(secondCar.getDriver().equals("Avatar Korra"));
		
	}
	
	@Test
	public void testToString() {
		
		String expectedFirstCar = "2009 Chevy Impala has an ID of 345. Ahsoka Tano drives it." + "\n";
		String actualFirstCar = firstCar.toString();
		
		String expectedSecondCar = "2009 GMC Yukon has an ID of 678. Avatar Korra drives it." + "\n";
		String actualSecondCar = secondCar.toString();
		
		assertEquals(expectedFirstCar, actualFirstCar);
		assertEquals(expectedSecondCar, actualSecondCar);
		
	}

}