package com.codeu.event.reservation;

import com.codeu.event.rental.Guest;

public abstract class Reservation {
	Guest guest;
	boolean isValid;
	
	Reservation(Guest guest) {
		this.setGuest(guest);
		this.setValid(false);
	}

	boolean validateClubNumber(String num){
		
		boolean rtn = false;
		
		if(num.startsWith("N") & num.length() >= 8 ) {
			rtn = true;
		}
		
		return rtn;
	}
	
	boolean validateLicense(String num) {
		boolean rtn = false;

		if (num.length() >= 12) {
			rtn = true;
		}

		return rtn;

	}
	
	@Override
	public abstract String toString();
	
	public abstract boolean reserve();
	
	protected void setValid(boolean b) {
		this.isValid = b;
	}
	
	public boolean getValid() {
		return isValid;
	}
	
	private void setGuest(Guest guest) {
		this.guest = guest;
		
	}

}
