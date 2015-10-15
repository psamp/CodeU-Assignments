package com.psamp.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HotelRoomTests {
	
	HotelRoom roomOne;
	HotelRoom roomTwo;
	
	@Before
	public void beforeTests() {
		roomOne = new HotelRoom(15, false);
		roomTwo = new HotelRoom(93, true);
	}

	@Test
	public void testGetRoomNumber() {
		int expectedRoomOne = 15;
		int actualRoomOne = roomOne.getRoomNumber();
		
		int expectedRoomTwo = 93;
		int actualRoomTwo = roomTwo.getRoomNumber();
		
		
		assertEquals(expectedRoomOne, actualRoomOne);
		assertEquals(expectedRoomTwo, actualRoomTwo);
	}

	@Test
	public void testSetRoomNumber() {
		
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
	public void testGetSmoking() {
		
		boolean smokingRoomOne = roomOne.getSmoking();
		boolean smokingRoomTwo = roomTwo.getSmoking();
		
		assertFalse(smokingRoomOne);
		assertTrue(smokingRoomTwo);
		
	}

	@Test
	public void testSetSmoking() {
		
		boolean setSmokingRoomOne = roomOne.setSmoking(true);
		boolean setSmokingRoomTwo = roomTwo.setSmoking(false);
		
		assertTrue(setSmokingRoomOne);
		assertFalse(setSmokingRoomTwo);
		
	}
	
	@Test
	public void testToString() {
		
		String expected = "Room 15 has 1 bed(s) and smoking is NOT allowed.";
		String actual = roomOne.toString();
		
		System.out.println(actual);
		
		assertEquals(expected, actual);
		
	}

}
