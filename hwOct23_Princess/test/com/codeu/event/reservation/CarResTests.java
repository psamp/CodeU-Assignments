package com.codeu.event.reservation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.RentalCar;

public class CarResTests {

	Reservation resOne;
	Reservation resTwo;

	Guest guestOne = new Guest("Bucky", "Barnes", "N6745677898", "N89766655546789", "234567890756");

	// Invalid club numbers and license.
	Guest guestTwo = new Guest("Steve", "Rogers", "N6745", "A8976", "987665");

	RentalCar carOne = new RentalCar(2015, "GMC", "Yukon", 3, guestOne.getFirstName(), guestOne.getLastName());
	RentalCar carTwo = new RentalCar(2009, "Honda", "Accord", 6, guestTwo.getFirstName(), guestTwo.getLastName());

	@Before
	public void setUp() {

		resOne = new CarReservation(carOne, guestOne);
		resTwo = new CarReservation(carTwo, guestTwo);
	}

	@Test
	public final void testToString() {
		String expectedOne = "Hello, Bucky Barnes! Your club number is: N89766655546789" + "\n" + "Here's your booking:"
				+ "\n" + "Bucky Barnes drives the 2015 GMC Yukon (ID: 3.)" + "\n";
		String actualOne = resOne.toString();

		String expectedTwo = "Invalid reservation.";
		String actualTwo = resTwo.toString();

		assertEquals(expectedOne, actualOne);
		assertEquals(expectedTwo, actualTwo);
	}

	@Test
	public final void testValidateLicense() {
		String tru = "234567899056";
		String fls = "77777yfhg";

		assertTrue(resOne.validateLicense(tru));
		assertFalse(resOne.validateLicense(fls));
	}

	@Test
	public final void testReserve() {

		assertTrue(resOne.getValid());
		assertFalse(resTwo.getValid());
	}

}
