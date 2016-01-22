package com.ntier.event.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ntier.event.rental.HotelRoom;

public class HotelRoomTests {
	
	HotelRoom r1;
	HotelRoom r2;
	
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
