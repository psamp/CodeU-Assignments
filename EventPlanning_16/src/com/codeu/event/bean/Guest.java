package com.codeu.event.bean;

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
	private String driversLicense;
	
	public Guest() {
		
	}
	
	public Guest(String firstName, String lastName, String hotelClubNumber, String carClubNumber, String getDriversLicense) {
		
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setHotelClubNumber(hotelClubNumber);
		this.setCarClubNumber(carClubNumber);
		this.setDriversLicense(getDriversLicense);
		
	}
	
	@Override
	public String toString() {
		
		String mssg = this.firstName + " " + this.lastName;
		return mssg;
	
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
	public String getDriversLicense() {
		return this.driversLicense;
	}
	private void setDriversLicense(String driversLicense) {
		this.driversLicense = driversLicense;
	}
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private void setHotelClubNumber(String hotelClubNumber) {
		this.hotelClubNumber = hotelClubNumber;
	}
	private void setCarClubNumber(String carClubNumber) {
		this.carClubNumber = carClubNumber;
	}

}
