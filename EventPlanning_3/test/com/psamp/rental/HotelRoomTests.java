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
	public void testToString() {
		
		String expected = "Room 15 has 2 bed(s) and smoking is NOT allowed.";
		String actual = roomOne.toString();
		
		System.out.println(actual);
		
		assertEquals(expected, actual);
		
	}

}
