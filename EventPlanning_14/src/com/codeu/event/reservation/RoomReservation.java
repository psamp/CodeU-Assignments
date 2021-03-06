package com.codeu.event.reservation;

import com.codeu.event.rental.CreditCard;
import com.codeu.event.rental.Guest;
import com.codeu.event.rental.HotelRoom;
import com.codeu.event.rental.Rentable;
import com.codeu.spendable.Spendable;
import com.vendor.RoomsRUs;

public class RoomReservation extends Reservation {
	private Rentable room;
	private boolean shuttle;

	public RoomReservation(Guest guest, Rentable room, boolean shuttle) {
		
		super(guest);
		this.setRoom(room);
		this.setShuttle(shuttle);
	
	}
	
	@Override
	public boolean reserve(double amount, Spendable type) {

		RoomsRUs roomsrus = new RoomsRUs();

		char[] response = roomsrus.reserve(this.getRoom().getNumber());

		boolean valid = false;

		if (response[3] == 'v' & this.payCash(amount, type) & Reservation.validateClubNumber(this.getGuest().getHotelClubNumber())) {
		
			valid = true;
			this.setValid(true);
			System.out.println(type.printReceipt(amount));
		
		} else {
			
			System.out.println("Money or club number not valid.");
		
		}

		return valid;
	}
	
	boolean payCash(double amount, Spendable type) {
		
		boolean takeMoney = false;
		
		if(amount > 0) {
			takeMoney = true;
		}
		
		return takeMoney;
		
	}
	
	@Override
	public boolean reserve(CreditCard cc, Spendable type) {

		RoomsRUs roomsrus = new RoomsRUs();

		char[] response = roomsrus.reserve(this.getRoom().getNumber());

		boolean valid = false;

		if (response[3] == 'v' & Reservation.payWithCard(cc) & Reservation.validateClubNumber(this.getGuest().getHotelClubNumber())) {
			
			valid = true;
			this.setValid(true);
			System.out.println(type.printReceipt(cc));
			
		} else {
			
			System.out.println("Card or club number not valid.");
			
		}

		return valid;
	}

	public String toString() {
		String mssg = "";

		if (this.getValid()) {

			mssg = "Hello, " + this.getGuest().toString() + "!" + " Your club number is: "
					+ this.getGuest().getHotelClubNumber() + "\n" + "Here's your booking:" + "\n"
					+ this.getRoom().toString();

		} else {

			mssg = "Invalid reservation.";

		}

		return mssg;
	}

	private HotelRoom getRoom() {
		return (HotelRoom) room;
	}

	private Guest getGuest() {
		return guest;
	}

	private void setRoom(Rentable room) {
		this.room = room;
	}

	private void setShuttle(boolean shuttle) {
		this.shuttle = shuttle;
	}
}
