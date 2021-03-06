package com.psamp.util;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

public class SuriTests {
	
//	Declare Suri object.
	static Suri suri;
	
//	Once before every class, initialize the suri object.
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		suri = new Suri();
	}
	
//	Expect the "Princess". Call getName and pass in "Princess".
	@Test
	public void testGetName() {
		
		String expected = "Princess";
		String actual = suri.getName("Princess");
		
		assertEquals(expected, actual);
		
	}
	
//	Call welcome, expecting a hello message that includes the usersName saved to the suri object.
	@Test
	public void testWelcome() {
		
		String expected = "Hello, Princess.";
		String actual = suri.welcome();
		
		assertEquals(expected, actual);
		
	}
	
//	Expect the age 15. Call getAge and pass in the scanner input as an int.
	@Test
	public void testGetUsersAge() {
		
		int expected = 15;
		int actual = suri.getAge(15);
		
		assertEquals(expected, actual);
		
	}
	
//	Check users age.
	@Test
	public void testIsUnderEighteen() {

		boolean actual = suri.isUnderEighteen();
		
		assertTrue(actual);
		
	}

}
