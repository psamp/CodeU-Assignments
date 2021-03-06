package com.codeu.event.reservation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.RentalCar;

public class CarResTests {
	
	CarReservation res;
	
	RentalCar car;
	Guest guest = new Guest("Bucky", "Barnes", "N6745677898", "N89766655546789", "234567890756");

	@Before
	public void setUp() {
		car = new RentalCar(2015, "GMC", "Yukon", 3, guest.getFirstName(), guest.getLastName());
		res = new CarReservation(car, guest);
	}

	@Test
	public final void testToString() {
		String expected = "Hello, Bucky Barnes! Your club number is: N89766655546789" + "\n" + "Here's your booking:" + "\n" + "Bucky Barnes drives the 2015 GMC Yukon (ID: 3.)" + "\n";
		String actual = res.toString();
		
		assertEquals(expected, actual);
	}

	@Test
	public final void testValidateLicense() {
		String tru = "234567899056";
		String fls = "77777yfhg";
		
		assertTrue(res.validateLicense(tru));
		assertFalse(res.validateLicense(fls));
	}

}
