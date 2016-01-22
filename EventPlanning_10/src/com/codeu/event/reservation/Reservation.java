package com.codeu.event.reservation;

import com.codeu.event.rental.Guest;

public abstract class Reservation {
	Guest guest;
	boolean isValid;
	
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
	
	public abstract boolean reserve();
	
	void setGuest(Guest guest) {
		this.guest = guest;
		
	}

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	String getGuestName() {
		return guest.toString();
	}
	
	Guest getGuest() {
		return guest;
	}
}
