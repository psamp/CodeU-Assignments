package com.psamp.lifecycletest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitLifecycleTest {
	
	@Before 
	public void beforeTests() throws Exception{
		System.out.println("Hello from before!");
	}
	
	@After
	public void afterTests() {
		System.out.println("Bye from after!");
	}

	@Test
	public void testA() {
		System.out.println("testA");
		assertEquals(1, 1);
	}
	
	@Test
	public void testB() {
		System.out.println("testB");
		assertEquals(2, 2);
	}
	
	@Test
	public void testC() {
		System.out.println("testC");
		assertEquals(3, 3);
	}
}
