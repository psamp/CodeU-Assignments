package com.codeu.event.rental;

import java.io.Serializable;

public class CreditCard implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4759450791722390938L;
	private String firstName;
	private String lastName;
	private String expirationDate;
	private String securityCode;
	private String cardNumber;
	
	public CreditCard() {
		
	}
	
	public CreditCard(String firstName, String lastName, String expirationDate, String securityCode, String cardNumber) {
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setExpirationDate(expirationDate);
		this.setSecurityCode(securityCode);
		this.setCardNumber(cardNumber);
		
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	private void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	private void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	private void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
}
