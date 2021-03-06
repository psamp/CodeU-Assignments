package com.psamp.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HotelRoomTests {
	
	HotelRoom roomOne;
	HotelRoom roomTwo;
	
	@Before
	public void beforeTests() {
		roomOne = new HotelRoom(15, false, 2);
		roomTwo = new HotelRoom(93, true);
	}
	
	@Test
	public void testNewObjects() {
		
		int expectOne = 15;
		int actualOne = roomOne.getRoomNumber();
		int expectTwo = 93;
		int actualTwo = roomTwo.getRoomNumber();
		
		assertNotNull(roomOne);
		assertNotNull(roomTwo);
		
		assertEquals(expectOne, actualOne);
		assertEquals(expectTwo, actualTwo);
		
		assertFalse(roomOne.getSmoking());
		assertTrue(roomTwo.getSmoking());
		
		assertTrue(roomOne.getBeds() == 2);
		assertTrue(roomTwo.getBeds() == 1);
		
		
	}
	
	@Test
	public void testToString() {
		
		String expected = "Room 15 has 2 bed(s) and smoking is NOT allowed. " + "\n";
		String actual = roomOne.toString();
		
		assertEquals(expected, actual);
		
	}

}
