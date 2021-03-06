package com.codeu.spendable;

import com.codeu.event.rental.CreditCard;

public abstract class Spendable {
	String currencySymbol;
	
	public String printReceipt(double amount) {
		
		String mssg = "Thank you! You've spent " + this.getCurrencySymbol() + amount;
		return mssg;
	
	}
	
	public String printReceipt(CreditCard card) {
		
		String mssg = "Thank you! This transaction will charge your card an additional " + this.currencySymbol + "10.";
		return mssg;
		
	}

	String getCurrencySymbol() {
		return this.currencySymbol;
	}

	void setCurrencySymbol(String currencySymbol) {
		this.currencySymbol = currencySymbol;
	}

}