package com.codeu.event.reservation;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.RentalCar;
import com.ntier.event.util.EmailSender;

class CarReservation extends Reservation {
	private RentalCar car;
	
	CarReservation(RentalCar car, Guest guest) {
		
		super(guest);
		
		if(this.reserve()) {
			
			this.setCar(car);
			
		} else {
			
			Guest nullGuest = new Guest("NULL", "NULL", "N0000000", "N0000000", "000000000000");
			RentalCar nullCar = new RentalCar("Make", "Model", 0, "NULL", "NULL");
			
			this.setGuest(nullGuest);
			this.setCar(nullCar);
			
			System.out.println("Cannot book if club number or driver's license is invalid. Please try again.");
			
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
		EmailSender email = new EmailSender();
		
		boolean clubNum = this.validateClubNumber(guest.getHotelClubNumber());
		boolean license = this.validateLicense(guest.getDriversLicense());
		
		boolean response = Boolean.parseBoolean(email.send(clubNum, license));
				
		if(response) {
			return true;
		} else {
			return false;
		}
		
	}

	public String toString() {
		String mssg = "Hello, " + getGuestString() + "!" + " Your club number is: " + this.getGuest().getCarClubNumber() + "\n" + "Here's your booking:" + "\n" + car.toString();
		return mssg;
	}
	
	private void setCar(RentalCar car) {
		this.car = car;
	}
	
	public String getGuestString() {
		return guest.toString();		
	}
}