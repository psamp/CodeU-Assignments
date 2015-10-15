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
	public void testGetCars() {
		
		String expected = "2009 Toyota Matrix has an ID of 1. " + "\n" + "2006 Honda Civic has an ID of 2. " + "\n" + "2000 Nissan Quest has an ID of 3. " + "\n" + "2015 Ford Explorer has an ID of 4. " + "\n" + "2009 Mazda Mazda3 has an ID of 5. " + "\n";
		String actual = manager.getCars();
		
		System.out.print(actual);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRooms() {
		String expected = "Room 16 has 1 bed(s) and smoking is allowed. " + "\n" + "Room 12 has 1 bed(s) and smoking is NOT allowed. "  + "\n" + "Room 4 has 1 bed(s) and smoking is allowed. " + "\n" + "Room 42 has 1 bed(s) and smoking is NOT allowed. "  + "\n";
		String actual = manager.getRooms();
		
		System.out.print(actual);
		System.out.println("\n");
		
		assertEquals(expected, actual);
	}

}
