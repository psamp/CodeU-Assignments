package com.psamp.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

class HotelRoomTests {
	
	HotelRoom roomOne;
	HotelRoom roomTwo;
	
	@Before
	void beforeTests() {
		roomOne = new HotelRoom(15, false);
		roomTwo = new HotelRoom(93, true);
	}

	@Test
	void testGetRoomNumber() {
		int expectedRoomOne = 15;
		int actualRoomOne = roomOne.getRoomNumber();
		
		int expectedRoomTwo = 93;
		int actualRoomTwo = roomTwo.getRoomNumber();
		
		
		assertEquals(expectedRoomOne, actualRoomOne);
		assertEquals(expectedRoomTwo, actualRoomTwo);
	}

	@Test
	void testSetRoomNumber() {
		
		roomOne.setRoomNumber(14);
		
		int expectedRoomOne = 14;
		int actualRoomOne = roomOne.getRoomNumber();
		
		roomTwo.setRoomNumber(92);
		
		int expectedRoomTwo = 92;
		int actualRoomTwo = roomTwo.getRoomNumber();
		
		
		assertEquals(expectedRoomOne, actualRoomOne);
		assertEquals(expectedRoomTwo, actualRoomTwo);
		
	}

	@Test
	void testGetSmoking() {
		
		boolean smokingRoomOne = roomOne.getSmoking();
		boolean smokingRoomTwo = roomTwo.getSmoking();
		
		assertFalse(smokingRoomOne);
		assertTrue(smokingRoomTwo);
		
	}

	@Test
	void testSetSmoking() {
		boolean setSmokingRoomOne = roomOne.setSmoking(true);
		boolean setSmokingRoomTwo = roomTwo.setSmoking(false);
		
		assertTrue(setSmokingRoomOne);
		assertFalse(setSmokingRoomTwo);
	}

}
