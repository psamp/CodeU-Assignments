package com.codeu.event.reservation;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.HotelRoom;
import com.vendor.RoomsRUs;

class RoomReservation extends Reservation {
	private HotelRoom room;
	private boolean shuttle;

	public RoomReservation(Guest guest, HotelRoom room, boolean shuttle) {
		super(guest);
		this.setRoom(room);
		this.setShuttle(shuttle);

		if (this.reserve() && this.validateClubNumber(this.getGuest().getHotelClubNumber())) {
			this.setValid(true);
		} else {
			System.out.println("You cannot book a stay without a valid club number.");
		}
	}

	@Override
	public boolean reserve() {

		RoomsRUs roomsrus = new RoomsRUs();

		char[] response = roomsrus.reserve(this.getRoom().getNumber());

		boolean rtn = false;

		if (response[3] == 'v') {
			rtn = true;
		}

		return rtn;
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
		return room;
	}

	private Guest getGuest() {
		return guest;
	}

	private void setRoom(HotelRoom room) {
		this.room = room;
	}

	private void setShuttle(boolean shuttle) {
		this.shuttle = shuttle;
	}

}
