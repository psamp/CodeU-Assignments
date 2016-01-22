package com.codeu.event.reservation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.HotelRoom;

public class RoomResTests {
	RoomReservation resOne;
	RoomReservation resTwo;
	
	Guest guestMatt;
	Guest guestFoggy;
	
	HotelRoom roomOne;
	HotelRoom roomTwo;

	@Before
	public void setUp() throws Exception {
		
		guestMatt = new Guest("Matthew", "Murdock", "N7888888888", "N6978767", "111111111111");
		
//		Dirty data, object will not init.
//		guestFoggy = new Guest("Foggy", "Nelson", "A8968", "N5634458678", "2222");
		
		roomOne = new HotelRoom(78, 1, false);
		roomTwo = new HotelRoom(67,21, true);
		
		resOne = new RoomReservation(guestMatt, roomOne, true);
		resTwo = new RoomReservation(guestFoggy, roomTwo, false);
	}
	

	@Test
	public final void testToString() {
		
		String expectedOne = "Hello, Matthew Murdock! Your club number is: N7888888888" + "\n" + "Here's your booking:" + "\n" + "Room 78 has 1 bed(s). Smoking is not allowed." + "\n";
		String actualOne = resOne.toString();
		
		System.out.println(resTwo.isShuttle() ) ;
		
		assertEquals(expectedOne, actualOne);
		
	}

}


