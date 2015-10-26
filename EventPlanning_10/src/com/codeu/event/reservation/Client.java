package com.codeu.event.reservation;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.HotelRoom;
import com.ntier.event.util.EmailSender;
import com.vendor.RoomsRUs;

public class Client {

	public static void main(String[] args) {
		
		EmailSender email = new EmailSender();
		
		System.out.println(email.send(true, true));
		System.out.println(email.send(false, true));
		System.out.println(email.send(true, false));
		System.out.println(email.send(false, false));
		
		RoomsRUs roomsrus = new RoomsRUs();
		
		System.out.println(roomsrus.reserve(78));
		System.out.println(roomsrus.reserve(95));
		System.out.println(roomsrus.reserve(10000));
		System.out.println(roomsrus.reserve(15));
		System.out.println(roomsrus.reserve(64));
		System.out.println(roomsrus.reserve(20000));
		
		if (roomsrus.reserve(20000)[3] == 'v') {
			System.out.println("yoyy9y9");
		} else {
			System.out.println("nope");
		}
	}

}
