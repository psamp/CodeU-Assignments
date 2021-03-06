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
	public void testGetMake() {
		
		String expectedMakeForFirstCar = "Chevy";
		String actualMakeForFirstCar = firstCar.getMake();
		
		String expectedMakeForSecondCar = "GMC";
		String actualMakeForSecondCar = secondCar.getMake();
		
		assertEquals(expectedMakeForFirstCar, actualMakeForFirstCar);
		assertEquals(expectedMakeForSecondCar, actualMakeForSecondCar);
		
	}

	@Test
	public void testGetModel() {
		String expectedModelForFirstCar = "Impala";
		String actualModelForFirstCar = firstCar.getModel();
		
		String expectedModelForSecondCar = "Yukon";
		String actualModelForSecondCar = secondCar.getModel();
		
		assertEquals(expectedModelForFirstCar, actualModelForFirstCar);
		assertEquals(expectedModelForSecondCar, actualModelForSecondCar);
	}
	
	@Test
	public void testGetID() {
		
		long expectedIDForFirstCar = 345;
		long actualIDForFirstCar = firstCar.getID();
		
		long expectedIDForSecondCar = 678;
		long actualIDForSecondCar = secondCar.getID();
		
		double delta = .001;
		
		assertEquals(expectedIDForFirstCar, actualIDForFirstCar, delta);
		assertEquals(expectedIDForSecondCar, actualIDForSecondCar, delta);
		
	}
	
	@Test
	public void testSetMake() {
		firstCar.setMake("Ford");
		
		String expectedMakeForFirstCar = "Ford";
		String actualMakeForFirstCar = firstCar.getMake();
		
		secondCar.setMake("Toyota");

		String expectedMakeForSecondCar = "Toyota";
		String actualMakeForSecondCar = secondCar.getMake();
		
		assertEquals(expectedMakeForFirstCar, actualMakeForFirstCar);
		assertEquals(expectedMakeForSecondCar, actualMakeForSecondCar);
	}

	@Test
	public void testSetModel() {
		
		firstCar.setModel("Escape");
		
		String expectedModelForFirstCar = "Escape";
		String actualModelForFirstCar = firstCar.getModel();
		
		secondCar.setModel("Corolla");
		
		String expectedModelForSecondCar = "Corolla";
		String actualModelForSecondCar = secondCar.getModel();
		
		assertEquals(expectedModelForFirstCar, actualModelForFirstCar);
		assertEquals(expectedModelForSecondCar, actualModelForSecondCar);
	}
	
	@Test
	public void testSetID () {
		
		firstCar.setID(123);
		
		long expectedIDForFirstCar = 123;
		long actualIDForFirstCar = firstCar.getID();
		
		secondCar.setID(890);
		
		long expectedIDForSecondCar = 890;
		long actualIDForSecondCar = secondCar.getID();
		
		assertEquals(expectedIDForFirstCar, actualIDForFirstCar);
		assertEquals(expectedIDForSecondCar, actualIDForSecondCar);
		
	}

}
