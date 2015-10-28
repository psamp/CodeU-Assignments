package com.codeu.event.reservation;

import com.codeu.event.rental.CreditCard;
import com.codeu.event.rental.Guest;
import com.codeu.spendable.Spendable;

public abstract class Reservation {
	Guest guest;
	boolean isValid;
	
	Reservation(Guest guest) {
		
		this.setGuest(guest);
		this.setValid(false);
		
	}
	
	abstract boolean reserve(CreditCard cc, Spendable type);
	abstract boolean reserve(double amount, Spendable type);
	abstract boolean payCash(double amount, Spendable type);

	static boolean validateClubNumber(String num){
		
		boolean rtn = false;
		
		if(num.startsWith("N") & num.length() >= 8 ) {
			rtn = true;
		}
		
		return rtn;
	}
	
	static boolean payWithCard(CreditCard cc) {
		
		boolean valid = false;
		
		if(cc.getSecurityCode().length() == 3) {
			valid = true;
		}
		
		return valid;
		
	}
	
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
