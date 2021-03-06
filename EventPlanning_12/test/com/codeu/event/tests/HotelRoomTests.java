package com.codeu.event.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.HotelRoom;
import com.codeu.event.rental.Rentable;

public class HotelRoomTests {
	
	private Rentable r1;
	private Rentable r2;
	
	@Before
	public void setUp() {
		r1 = new HotelRoom(15, 2, false);
		r2 = new HotelRoom(15, true);
	}

	@Test
	public final void testToString() {
		String expectedOne = "Room 15 has 2 bed(s). Smoking is not allowed." + "\n";
		String actualOne = r1.toString();
		
		String expectedTwo = "Room 15 has 1 bed(s). Smoking is allowed." + "\n";
		String actualTwo = r2.toString();
		
		assertEquals(expectedOne, actualOne);
		assertEquals(expectedTwo, actualTwo);
	}
	
	@Test
	public final void testEquals() {
		
		assertTrue(r1.equals(r2));
		assertTrue(r2.equals(r1));
	}
	
	

}
