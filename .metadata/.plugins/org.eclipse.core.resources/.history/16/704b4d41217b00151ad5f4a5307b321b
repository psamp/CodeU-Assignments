package com.codeu.event.reservation;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.Rental;

public abstract class Reservation {
	Guest guest;
	
	Reservation(Guest guest) {
		this.setGuest(guest);
	}

	boolean validateClubNumber(String num){
		
		boolean rtn = false;
		
		if(num.startsWith("N") & num.length() >= 8 ) {
			rtn = true;
		}
		
		return rtn;
	}
	
	@Override
	public abstract String toString();
	
	abstract void validateReservation(Guest guest, Rental rental);
	
	public abstract boolean reserve();
	
	private void setGuest(Guest guest) {
		this.guest = guest;
		
	}

}
