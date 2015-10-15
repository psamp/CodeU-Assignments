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
		
		String expected = "2009 Toyota Matrix | ID: 1" + "\n" + "2006 Honda Civic | ID: 2" + "\n" + "2000 Nissan Quest | ID: 3" + "\n" + "2015 Ford Explorer | ID: 4" + "\n" + "2009 Mazda Mazda3 | ID: 5" + "\n";
		String actual = manager.getCars();
		
		System.out.print(actual);
		
		assertEquals(expected, actual);
	}

	@Test
	public void testGetRooms() {
		String expected = "Room 16 | Smoking allowed: true" + "\n" + "Room 12 | Smoking allowed: false" + "\n" + "Room 4 | Smoking allowed: true" + "\n" + "Room 42 | Smoking allowed: false" + "\n";
		String actual = manager.getRooms();
		
		System.out.print(actual);
		System.out.println("\n");
		
		assertEquals(expected, actual);
	}

}
