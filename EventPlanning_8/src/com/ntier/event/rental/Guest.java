package com.ntier.event.rental;

import java.io.Serializable;

public class Guest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2184312691735056929L;
	private String firstName;
	private String lastName;
	private String hotelClubNumber;
	private String carClubNumber;
	
	Guest(String firstName, String lastName, String hotelClubNumber, String carClubNumber) {
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setLastName(hotelClubNumber);
		this.setHotelClubNumber(hotelClubNumber);
		this.setCarClubNumber(carClubNumber);
		
	}
	
	Guest() {
		
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getHotelClubNumber() {
		return hotelClubNumber;
	}
	public String getCarClubNumber() {
		return carClubNumber;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setHotelClubNumber(String hotelClubNumber) {
		this.hotelClubNumber = hotelClubNumber;
	}
	public void setCarClubNumber(String carClubNumber) {
		this.carClubNumber = carClubNumber;
	}

}
