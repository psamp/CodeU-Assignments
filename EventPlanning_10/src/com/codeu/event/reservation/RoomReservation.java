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
		this.setValid(false);
		
		if( this.validateClubNumber(guest.getHotelClubNumber()) & this.reserve()) {
			
			this.setValid(true);
			
		} else {
			System.out.println("Invalid club number.");
		}
	}
	
	public boolean reserve() {
		
		RoomsRUs roomsrus = new RoomsRUs();
		boolean valid = false;
		char letter = roomsrus.reserve( this.getRoom().getNumber() )[3];
		
		if(letter == 'v') {
			valid = true;
		} else if(letter == 'i') {
			valid = false;
		}
		
		return valid;
	}

	public String toString() {
		String mssg = "Hello, " + this.getGuestName() + "!" + " Your club number is: " + this.getGuest().getHotelClubNumber() + "\n" + "Here's your booking:" + "\n" + this.getRoomInfo();
		return mssg;
	}

	public boolean isShuttle() {
		return shuttle;
	}
	
	public HotelRoom getRoom() {
		return this.room;
	}
	
	private String getRoomInfo() {
		return this.getRoom().toString();
	}

	private void setRoom(HotelRoom room) {		
		this.room = room;
	}

	private void setShuttle(boolean shuttle) {
		this.shuttle = shuttle;
	}
	
}