package com.codeu.event.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PlaneSeatTests {
	
	private PlaneSeat p1;
	private PlaneSeat p2;
	private PlaneSeat p3;

	@Before
	public void setUp() throws Exception {
		
		p1 = new PlaneSeat("ATL", "LAX", "3D");
		p2 = new PlaneSeat("JFK", "LAX", "25C");
		p3 = p1;
		
	}

	@Test
	public final void testToString() {
		
		assertEquals("ATL to LAX in seat 3D." + "\n", p1.toString());
		assertEquals("ATL to LAX in seat 3D." + "\n", p3.toString());
		assertEquals("JFK to LAX in seat 25C." + "\n", p2.toString());
	
	}

	@Test
	public final void testEqualsObject() {
		
		assertEquals(false, p1.equals(p2));
		assertEquals(false, p2.equals(p3));
		assertEquals(true, p1.equals(p1));
	
	}

}
