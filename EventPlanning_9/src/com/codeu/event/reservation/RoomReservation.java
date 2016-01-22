package com.codeu.event.reservation;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.HotelRoom;
import com.codeu.event.rental.Rental;

class RoomReservation extends Reservation {
	private HotelRoom room;
	private boolean shuttle;
	
	public RoomReservation(Guest guest, Rental room, boolean shuttle) {
		super(guest);
		this.setShuttle(shuttle);
		this.validateReservation(guest, room);
	}

	void validateReservation(Guest guest, Rental room) {
		if(this.validateClubNumber(guest.getHotelClubNumber()) == true) {
			this.setRoom(room);
			
		} else {
			
			System.out.println("Cannot book if club number is invalid. Please try again.");
		}
	}
	
	@Override
	public boolean reserve() {
		// TODO Auto-generated method stub
		return false;
	}

	public String toString() {
		String mssg = "Hello, " + this.getGuestName() + "!" + " Your club number is: " + this.getGuest().getHotelClubNumber() + "\n" + "Here's your booking:" + "\n" + room.toString();
		return mssg;
	}

	public HotelRoom getRoom() {
		return room;
	}

	public String getGuestName() {
		return guest.toString();
	}
	
	private Guest getGuest() {
		return guest;
	}

	public boolean isShuttle() {
		return shuttle;
	}

	private void setRoom(Rental room) {		
		this.room = (HotelRoom) room;
	}

	private void setShuttle(boolean shuttle) {
		this.shuttle = shuttle;
	}
	
}
