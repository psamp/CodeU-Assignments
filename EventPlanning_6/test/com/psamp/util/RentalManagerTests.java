package com.psamp.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RentalManagerTests {
	
	RentalManager rm;
	
	@Before
	public void setUp() {
		rm = new RentalManager();
	}

	@Test
	public final void testDisplayAllHotelRooms() {
		String expected = "Room 16 has 2 bed(s). Smoking is allowed." + "\n" + "Room 12 has 1 bed(s). Smoking is not allowed." + "\n" + "Room 4 has 1 bed(s). Smoking is allowed." + "\n" + "Room 43 has 2 bed(s). Smoking is not allowed." + "\n";
		String actual = rm.displayAllHotelRooms();
				
		assertEquals(expected, actual);
	}

	@Test
	public final void testDisplayAllRentalCars() {
		String expected = "Anakin Skywalker drives the 2009 Toyota Matrix (ID: 1.)" + "\n" + "Natalia Ramanova drives the 2014 Honda Civic (ID: 2.)" + "\n" + "Bucky Barnes drives the 2009 Nissan Quest (ID: 3.)" + "\n" + "Ahsoka Tano drives the 2008 Ford Explorer (ID: 4.)" + "\n" + "Avatar Korra drives the 2009 Mazda Mazda3 (ID: 5.)" + "\n";
		String actual = rm.displayAllRentalCars();

		assertEquals(expected, actual);
	}

	@Test
	public final void testGetAmoutOfRooms() {
		String expected = "Available rooms: 4";
		String actual = rm.getAmoutOfRooms();
		
		assertEquals(expected, actual);
	}

	@Test
	public final void testGetAmoutOfCars() {
		String expected = "Available cars: 5";
		String actual = rm.getAmoutOfCars();
		
		assertEquals(expected, actual);
	}

}
