package com.codeu.event.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.HotelRoom;
import com.codeu.event.rental.Rental;
import com.codeu.event.rental.RentalCar;
import com.codeu.event.reservation.CarReservation;
import com.codeu.event.reservation.Reservation;
import com.codeu.event.reservation.RoomReservation;

public class ReserveMethodTests {
	
	Guest ak = new Guest("Avatar", "Korra", "N789453425", "N856456723", "78564534678934");
	
//	Dirty data.
	Guest as = new Guest("Asami", "Sato", "N45", "N9034", "876574345676754");
	
	Rental room = new HotelRoom(1214, 2, false);
	Rental car = new RentalCar(2014, "Fire", "Hide", 45, as.getFirstName(), as.getLastName());
	
	Reservation roomRes = new RoomReservation(ak, room, false);
	Reservation carRes = new CarReservation(as, car);
	
	Reservation[] res = {roomRes, carRes};

	@Test
	public final void testReserve() {
		
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i].reserve() + "\n");
		}
		
		assertTrue(roomRes.reserve());
		assertFalse(carRes.reserve());
	}

}
