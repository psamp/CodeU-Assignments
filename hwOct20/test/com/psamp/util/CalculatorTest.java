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
		assertEquals(11, calc.addThese(5.5, 5.5), .001);
		assertEquals(10, calc.addThese(5, 5));
		assertEquals(0, calc.addThese("yayayaeee454544544yyayaya", "igsuag1sgasyu"), .001);
		assertEquals(10, calc.addThese("5", "5"), .001);
		assertEquals(4454, calc.addThese("100", "4354"), .001);
	}

	@Test
	public void testSubtractThese() {
		
		assertEquals(0, calc.subtractThese(5, 5));
		assertEquals(0.0, calc.subtractThese(5.5, 5.5), .001);
		assertEquals(0, calc.subtractThese("jfsdsddssdf", "ewgsssdd"), .001);
		assertEquals(5, calc.subtractThese("10", "5"), .001);
	}

	@Test
	public void testMultiplyThese() {
		
		assertEquals(10, calc.multiplyThese(2, 5));
		assertEquals(11, calc.multiplyThese(2, 5.5), .001);
		assertEquals(9, calc.multiplyThese("3", "3"), .001);
		assertEquals(0, calc.multiplyThese("ewuffevs", "fweiuefhbsd"), .001);
	}
	
	@Test
	public void testDivideTheseDoubles() {
		
		assertEquals(2.09090909091, calc.divideThese(11.5, 5.5), .001);
		assertEquals(5, calc.divideThese(10, 2));
		assertEquals(3, calc.divideThese("9", "3"), .001);
		assertEquals(0, calc.divideThese("uigefyugef", "ewhffege"), .001);
	}

	@Test
	public void testGetLength() {
		
		assertEquals(25, calc.getLength("lorem ipsum dolor si amet"), .001);
		assertEquals(3, calc.getLength(555));
		assertEquals(3, calc.getLength(1.5));
	}

	@Test
	public void testFirstLarger() {
		
		assertEquals(true, calc.firstLarger(456, 85));
		assertEquals(true, calc.firstLarger("Princess", "Hey"));
		assertEquals(false, calc.firstLarger("6", "89"));
	}

	@Test
	public void testSumArray() {
		
		int arrInt[] = {10, 20, 30};
		String arrString[] = {"10", "20", "30"};
		String arrString2[] = {"10", "wicked", "30", "ftftfjfu", "8789"};
		double arrDouble[] = {10.10, 20.20, 30.30};
		int arrNeg[] = {10, 20, -30};
		
		assertEquals(60, calc.sumArray(arrInt, "testSumArray"), .001);
		assertEquals(60, calc.sumArray(arrString, "testSumArrayString"), .001);
		assertEquals(60.6, calc.sumArray(arrDouble, "testSumArrayDouble"), .001);
		assertEquals(0, calc.sumArray(arrNeg, "testSumArrayNeg"), .001);
		assertEquals(0, calc.sumArray(arrString2, "testSumArrayString2"), .001);
	}

	@Test
	public void testFindValues() {
		
		int arrInt[] = {10, 20, 30, 60, 60, 60};
		double arrDouble[] = {78.5, 9089, 86767, 97, 78.5};
		String arrString[] = {"5", "5", "87", "5", "87", "87"};
		String[] arrStringCheck = {"khjfssbd", "oishusvghgvhd"};
 		
		assertEquals(3, calc.findValues(arrInt, 60), .001);
		assertEquals(2, calc.findValues(arrDouble, 78.5), .001);
		assertEquals(3, calc.findValues(arrString, 87), .001);
		assertEquals(0, calc.findValues(arrStringCheck, 1), .001);
	}

}
