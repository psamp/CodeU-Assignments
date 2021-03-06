package com.codeu.object;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ObjectTests {

	@Test
	public final void testEquals() {
		
		Object obj = new Object();
		Object obby = new Object();
		Object objKid = obj;
		
		assertEquals(true, objKid.equals(obj));
		assertEquals(false, objKid.equals(obby));
		assertEquals(false, obby.equals(obj));
	}
	
	@Test
	public final void testStringEquals() {
		String alpha = "abc";
		String beta = new String("abc");
		String gamma = "abc";
		
		assertEquals(true, alpha.equals(gamma));
		assertEquals(true, beta.equals(alpha));
		assertEquals(true, gamma.equals(beta));
		
		assertEquals(true, alpha == gamma);
		assertEquals(false, beta == alpha);
		assertEquals(false, gamma == beta);
		
	}
	
	@Test
	public final void testHashCode() {
		String alpha = "abc";
		String gamma = "abc";
		
		assertEquals(true, alpha.hashCode() == gamma.hashCode());
		
	}

}
