package com.codeu.passingvariables;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PassingVariablesTests {
	
	PassingVariables ps;

	@Before
	public void setUp() throws Exception {
		ps = new PassingVariables();
	}

	@Test
	public final void testSayHi() {
		String expected = "Princess";
		String actual = ps.sayHi("Princess");
		
		assertEquals(expected, actual);
	}

}
