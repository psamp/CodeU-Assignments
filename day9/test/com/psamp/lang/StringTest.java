package com.psamp.lang;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void testLength() {
		String s = "JUnit Rules";
		System.out.println("I'm testLength");
		assertEquals(11, s.length());
		
	}
	
	@Test
	public void testSub() {
		String s = "JUnit Rules";
		System.out.println("I'm testSub");
		assertEquals("Unit", s.substring(1, 5));
	}

}
