package com.psamp.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PassByTest {
	
	PassBy pb;
	
//	Before every test, initialize pb to a new PassBy object.
	@Before
	public void beforeTests() {
		pb = new PassBy();
	}

/*	
 *	Take a number and pass it into addTenVal, which adds ten to its value and returns it.
 *	Assert that five is still equal to 5, as only its value and not its reference was passed.
 */
	@Test
	public void testAddTenVal() {
		int five = 5;
		
		pb.addTenVal(five);
		
		assertTrue(five == 5);
	}
	
/*
 *	Create a new Obj called objFive, and set both its class variables to 5.
 * 	Pass this object's reference into addTenRef, which adds ten to both instance variables on objFive.
 *  We passed in an object reference, which points back to the object itself.
 *  Assert that objFive's instance variables are now 15.
 */
	@Test
	public void testAddTenRef() {
		Obj objFive = new Obj(5, 5);
		
		pb.addTenRef(objFive);
		
		assertTrue(objFive.a == 15);
		assertTrue(objFive.b == 15);
	}
}