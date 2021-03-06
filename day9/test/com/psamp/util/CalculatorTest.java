package com.psamp.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
//	Declare calculator object.
	Calculator calc;
	
//	Before every test, initialize calc to a new Calculator object.
	@Before public void beforeTests() {
		calc = new Calculator();
	}
	
//	Tests for all Calculator methods.
	@Test
	public void testAddThese() {
		
		double expected = 10;
		double actual = calc.addThese(5, 5);
		double delta = .001;
		
		calc.addThese(5, 5);
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testSubtractThese() {
		
		double expected = 0;
		double actual = calc.subtractThese(5, 5);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
		
	}

	@Test
	public void testMultiplyThese() {
		
		double expected = 10;
		double actual = calc.multiplyThese(2, 5);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testDivideThese() {
		
		double expected = 10;
		double actual = calc.multiplyThese(2, 5);
		double delta = .001;
		
		assertEquals(expected, actual , delta);
	}

	@Test
	public void testDivideTheseIntegers() {
		
		double expected = 5;
		double actual = calc.divideTheseIntegers(10, 2);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testGetLength() {
		
		int expected = 25;
		int actual = calc.getLength("lorem ipsum dolor si amet");
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testFirstLarger() {
		
		boolean expected = true;
		boolean actual = calc.firstLarger(456, 85);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testSumArray() {
		
		double arr[] = {10, 20, 30};
		double expected = 60;
		double actual = calc.sumArray(arr, "testSumArray") ;
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testSumArrayNegative() {
		
		double arr[] = {10, 20, -30};
		double expected = 0;
		double actual = calc.sumArrayNegative(arr, "testSumArray");
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testCountValues() {
		
		double arr[] = {10, 20, 30, 60, 60, 60};
		double expected = 3;
		double actual = calc.countValues(arr, 60);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
		
	}

}
