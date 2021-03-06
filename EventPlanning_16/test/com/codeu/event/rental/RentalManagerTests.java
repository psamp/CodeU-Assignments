package com.codeu.event.rental;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.RentalManager;

public class RentalManagerTests {
	
	private RentalManager rm;
	
	@Before
	public void setUp() {
		rm = new RentalManager();
	}

	@Test
	public final void testDisplayAllHotelRooms() {
		
		String expected = "Room 16 has 2 bed(s). Smoking is allowed." + "\n" + "Room 12 has 1 bed(s). Smoking is not allowed." + "\n" + "Room 4 has 1 bed(s). Smoking is allowed." + "\n" + "Room 43 has 2 bed(s). Smoking is not allowed." + "\n";
		String actual = rm.displayRooms();
				
		assertEquals(expected, actual);
		
	}

	@Test
	public final void testDisplayAllRentalCars() {
		
		String expected = "Anakin Skywalker drives the 2009 Toyota Matrix (ID: 1.)" + "\n" + "Natalia Ramanova drives the 2014 Honda Civic (ID: 2.)" + "\n" + "Bucky Barnes drives the 2009 Nissan Quest (ID: 3.)" + "\n" + "Ahsoka Tano drives the 2008 Ford Explorer (ID: 4.)" + "\n" + "Avatar Korra drives the 2009 Mazda Mazda3 (ID: 5.)" + "\n";
		String actual = rm.displayCars();

		assertEquals(expected, actual);
		
	}
	
	@Test
	public final void testDisplayFlight() {
		
		String expected = "SEA to SAN in seat 1A." + "\n" + "BMI to SEA in seat 2A." + "\n" + "JFK to EYW in seat 3A." + "\n";
		String actual = rm.displayFlight();
		
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
	
	@Test
	public final void testAmountOfPlaneSeats() {
		
		String expected = "Available seats: 3";
		String actual = rm.getAmoutOfPlaneSeats();
		
		assertEquals(expected, actual);
		
	}

}
