package com.psamp.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

//	@Before Calculator calc = new Calculator();
	
	@Test
	public void testAddThese() {
		Calculator calc = new Calculator();
		
		double expected = 10;
		double actual = calc.addThese(5, 5);
		double delta = .001;
		
		calc.addThese(5, 5);
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testSubtractThese() {
		Calculator calc = new Calculator();
		
		double expected = 0;
		double actual = calc.subtractThese(5, 5);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
		
	}

	@Test
	public void testMultiplyThese() {
		Calculator calc = new Calculator();
		
		double expected = 10;
		double actual = calc.multiplyThese(2, 5);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testDivideThese() {
		Calculator calc = new Calculator();
		
		double expected = 10;
		double actual = calc.multiplyThese(2, 5);
		double delta = .001;
		
		assertEquals(expected, actual , delta);
	}

	@Test
	public void testDivideTheseIntegers() {
		Calculator calc = new Calculator();
		
		double expected = 5;
		double actual = calc.divideTheseIntegers(10, 2);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testGetLength() {
		Calculator calc = new Calculator();
		
		int expected = 25;
		int actual = calc.getLength("lorem ipsum dolor si amet");
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testFirstLarger() {
		Calculator calc = new Calculator();
		
		double expected = 5;
		double actual = calc.firstLarger(2, 5);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testSumArray() {
		Calculator calc = new Calculator();
		
		double arr[] = {10, 20, 30};
		double expected = 60;
		double actual = calc.sumArray(arr, "arr (sumAray)") ;
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testSumArrayNegative() {
		
		Calculator calc = new Calculator();
		
		double arr[] = {10, 20, -30};
		double expected = 0;
		double actual = calc.sumArrayNegative(arr, "arr");
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

	@Test
	public void testCountValues() {
		
		Calculator calc = new Calculator();
		
		double arr[] = {10, 20, 30, 60, 60, 60};
		double expected = 3;
		double actual = calc.countValues(arr, 60);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
		
	}

}
