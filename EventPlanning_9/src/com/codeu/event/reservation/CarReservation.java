package com.codeu.event.reservation;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.Rental;
import com.codeu.event.rental.RentalCar;

class CarReservation extends Reservation {
	private Rental car;
	
	CarReservation(RentalCar car, Guest guest) {
		super(guest);
		this.validateReservation(guest, car);
		
	}
	
	void validateReservation(Guest guest, Rental car) {
		if(this.validateClubNumber(guest.getHotelClubNumber()) == true) {
			
			this.setCar(car);
			
		} else {
			
			Guest nullGuest = new Guest("NULL", "NULL", "N0000000", "N0000000", "000000000000");
			RentalCar nullCar = new RentalCar("Make", "Model", 0, "NULL", "NULL");
			
			this.setGuest(nullGuest);
			this.setCar(nullCar);
			
			System.out.println("Cannot book if club number is invalid. Please try again.");
		}
	}

	boolean validateLicense(String num) {
		boolean rtn = false;
		
		if(num.length() >= 12) {
			rtn = true;
		}
		
		return rtn;
		
	}
	
	@Override
	public boolean reserve() {
		// TODO Auto-generated method stub
		return false;
	}

	public String toString() {
		String mssg = "Hello, " + getGuestString() + "!" + " Your club number is: " + this.getGuest().getCarClubNumber() + "\n" + "Here's your booking:" + "\n" + car.toString();
		return mssg;
	}
	
	private void setGuest(Guest guest) {
		this.guest = guest;
		
	}
	
	private void setCar(Rental car) {
		this.car = car;
	}
	
	public String getGuestString() {
		return guest.toString();		
	}
	
	private Guest getGuest() {
		return guest;		
	}
}