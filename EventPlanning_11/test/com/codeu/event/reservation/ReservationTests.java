package com.codeu.event.reservation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.Guest;

public class ReservationTests {
	
	private Guest guestOne = new Guest();
	private Reservation res;

	@Before
	public void setUp() throws Exception {
		
		res = new Reservation(guestOne);
	}

	@Test
	public final void testValidateClubNumber() {
		String cnOne = "N897886745";
		String cnTwo = "A68767";
		
		assertTrue(res.validateClubNumber(cnOne));
		assertFalse(res.validateClubNumber(cnTwo));
	}

	@Test
	public final void testValidateLicense() {
		String dlOne = "787878787878787878";
		String dlTwo = "SDS98";
		
		assertTrue(res.validateLicense(dlOne));
		assertFalse(res.validateLicense(dlTwo));
	}

	@Test
	public final void testReserve() {
		assertFalse(res.reserve());
	}

}
