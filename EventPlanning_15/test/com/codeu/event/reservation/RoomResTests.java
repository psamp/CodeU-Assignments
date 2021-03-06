package com.codeu.event.reservation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.bean.CreditCard;
import com.codeu.event.bean.Guest;
import com.codeu.event.rental.HotelRoom;
import com.codeu.spendable.AUD;
import com.codeu.spendable.CFP;
import com.codeu.spendable.KES;
import com.codeu.spendable.Spendable;
import com.codeu.spendable.USD;

public class RoomResTests {
	private RoomReservation resOne;
	private RoomReservation resTwo;
	private Guest guestMatt;
	private Guest guestFoggy;
	private HotelRoom roomOne;
	private HotelRoom roomTwo;
	private CreditCard card;
	private Spendable usd;
	private Spendable kes;
	private Spendable cfp;
	private Spendable aud;

	@Before
	public void setUp() throws Exception {

		guestMatt = new Guest("Matthew", "Murdock", "N7888888888", "N6978767", "111111111111");

		// Dirty data.
		guestFoggy = new Guest("Foggy", "Nelson", "A89", "B563", "22223");
		// End dirty data.
		
		card = new CreditCard("Matthew", "Murdock", "10/08/18", "438", "370982450704888");

		roomOne = new HotelRoom(78, 1, false);
		roomTwo = new HotelRoom(67, 21, true);

		resOne = new RoomReservation(guestMatt, roomOne, true);
		resTwo = new RoomReservation(guestFoggy, roomTwo, false);
		
		usd = new USD();
		kes = new KES();
		cfp = new CFP();
		aud = new AUD();
		
		resOne.reserve(card, usd);
		resTwo.reserve(98, usd);
	}
	
	@Test
	public final void testPayCash() {
		
		assertEquals(true, resOne.payCash(78, usd));
		assertEquals(true, resOne.payCash(56, aud));
		assertEquals(true, resOne.payCash(657, kes));
		assertEquals(true, resOne.payCash(457, cfp));
		assertEquals(false, resOne.payCash(0, usd));
	}

	@Test
	public final void testToString() {

		String expectedOne = "Hello, Matthew Murdock! Your club number is: N7888888888" + "\n" + "Here's your booking:"
				+ "\n" + "Room 78 has 1 bed(s). Smoking is not allowed." + "\n";
		String actualOne = resOne.toString();

		String expectedTwo = "Invalid reservation.";
		String actualTwo = resTwo.toString();

		assertEquals(expectedOne, actualOne);
		assertEquals(expectedTwo, actualTwo);

	}

	@Test
	public final void testReserve() {

		assertEquals(true, resOne.getValid());
		assertEquals(false, resTwo.getValid());

	}
}