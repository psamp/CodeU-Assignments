package com.codeu.event.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.HotelRoom;
import com.codeu.event.rental.Rental;

public class HotelRoomTests {
	
	Rental r1;
	Rental r2;
	
	@Before
	public void setUp() {
		r1 = new HotelRoom(15, 2, false);
		r2 = new HotelRoom(93, true);
	}

	@Test
	public final void testToStringRoomOne() {
		String expected = "Room 15 has 2 bed(s). Smoking is not allowed." + "\n";
		String actual = r1.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testToStringRoomTwo() {
		String expected = "Room 93 has 1 bed(s). Smoking is allowed." + "\n";
		String actual = r2.toString();
		
		assertEquals(expected, actual);
	}

}
