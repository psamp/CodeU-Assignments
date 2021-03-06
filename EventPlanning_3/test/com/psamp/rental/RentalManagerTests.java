package com.psamp.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RentalManagerTests {
	
	RentalManager manager;
	
	@Before
	public void beforeTests() {
		manager = new RentalManager();
	}
	
	@Test
	public void testGetArrayLength() {
		int carLength = manager.getCarArray().length;
		int roomLength = manager.getRoomArray().length;
		
		assertNotNull(manager.getCarArray());
		assertNotNull(manager.getRoomArray());
		
		assertTrue(carLength >= 5);
		assertTrue(roomLength >= 4);
	}

	@Test
	public void testGetCars() {
		
		String expected = "2009 Toyota Matrix has an ID of 1. Lora Ipsum drives it." + "\n" + "2006 Honda Civic has an ID of 2. Anakin Skywalker drives it." + "\n" + "2000 Nissan Quest has an ID of 3. Obi-Wan Kenobi drives it." + "\n" + "2015 Ford Explorer has an ID of 4. Bucky Barnes drives it." + "\n" + "2009 Mazda Mazda3 has an ID of 5. Natalia Ramanova drives it." + "\n";
		String actual = manager.getCars();
		
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRooms() {
		String expected = "Room 16 has 1 bed(s) and smoking is allowed. " + "\n" + "Room 12 has 1 bed(s) and smoking is NOT allowed. "  + "\n" + "Room 4 has 1 bed(s) and smoking is allowed. " + "\n" + "Room 42 has 1 bed(s) and smoking is NOT allowed. "  + "\n";
		String actual = manager.getRooms();
		
		assertEquals(expected, actual);
	}

}
