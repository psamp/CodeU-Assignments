package com.codeu.event.reservation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.CreditCard;
import com.codeu.event.rental.Guest;
import com.codeu.event.rental.Rentable;
import com.codeu.event.rental.RentalCar;
import com.codeu.spendable.AUD;
import com.codeu.spendable.CFP;
import com.codeu.spendable.KES;
import com.codeu.spendable.Spendable;
import com.codeu.spendable.USD;

public class CarResTests {

	private CarReservation resOne;
	private CarReservation resTwo;
	private Guest guestOne = new Guest("Bucky", "Barnes", "N6745677898", "N89766655546789", "234567890756");
	// Invalid club numbers and license.
	private Guest guestTwo = new Guest("Steve", "Rogers", "N6745", "A8976", "987665");
	private Rentable carOne = new RentalCar(2015, "GMC", "Yukon", 3);
	private Rentable carTwo = new RentalCar(2009, "Honda", "Accord", 6);
	
	private Spendable usd;
	private Spendable kes;
	private Spendable cfp;
	private Spendable aud;
	private CreditCard cc = new CreditCard("Tony", "Stark", "05/17/2018", "678", "5542431162540042");

	@Before
	public void setUp() {

		resOne = new CarReservation(guestOne, carOne, 10);
		resTwo = new CarReservation(guestTwo, carTwo);
		
		usd = new USD();
		kes = new KES();
		cfp = new CFP();
		aud = new AUD();
		
		resOne.reserve(cc, aud);
		resTwo.reserve(86, usd);
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
	public final void testPayCash() {

		assertEquals(true, resOne.payCash(78, usd));
		assertEquals(false, resOne.payCash(97, aud));
		assertEquals(false, resOne.payCash(674, kes));
		assertEquals(false, resOne.payCash(342, cfp));
		assertEquals(false, resOne.payCash(0, usd));
	}

	@Test
	public final void testReserve() {

		assertEquals(true, resOne.getValid());
		assertEquals(false, resTwo.getValid());
	}
	
	@Test
	public final void testBuyInsurance() {

		assertEquals(true, resOne.isInsurance());
		assertEquals(false, resTwo.isInsurance());
	}

}
