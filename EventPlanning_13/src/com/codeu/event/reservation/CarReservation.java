package com.codeu.event.reservation;

import com.codeu.event.insurance.Insurance;
import com.codeu.event.rental.Guest;
import com.codeu.event.rental.Rentable;
import com.codeu.event.rental.RentalCar;
import com.ntier.event.util.EmailSender;

public class CarReservation extends Reservation implements Insurance {
	private Rentable car;
	private boolean insurance;
	
	public CarReservation(Guest guest, Rentable car) {

		super(guest);
		this.setCar(car);
		this.setInsurance(false);
		this.getCar().setDriver(this.getGuest().getFirstName(), this.getGuest().getLastName());

		if (this.reserve()) {
			this.setValid(true);

		} else {
			System.out.println("You cannot book a stay or car without a valid club number or license.");
		}

	}
	
	public CarReservation(Guest guest, Rentable car, int insurancePayment) {

		super(guest);
		this.setCar(car);
		this.setInsurance(this.buyInsurance(insurancePayment));
		this.getCar().setDriver(this.getGuest().getFirstName(), this.getGuest().getLastName());

		if (this.reserve()) {
			this.setValid(true);

		} else {
			System.out.println("You cannot book a stay or car without a valid club number or license.");
		}

	}

	@Override
	public boolean buyInsurance(int payment) {
		
		boolean amountIsTen = false;
		
		if(payment == 10) {
			amountIsTen = true;
		}
		
		return amountIsTen;
	}


	@Override
	public boolean reserve() {
		EmailSender valid = new EmailSender();

		String getEmail = valid.send(Reservation.validateClubNumber(this.getGuest().getHotelClubNumber()),
				Reservation.validateLicense(this.getGuest().getDriversLicense()));

		boolean parseEmail = Boolean.parseBoolean(getEmail);

		return parseEmail;
	}

	public String toString() {
		String mssg = "";

		if (this.getValid()) {

			mssg = "Hello, " + this.getGuest().toString() + "!" + " Your club number is: "
					+ this.getGuest().getCarClubNumber() + "\n" + "Here's your booking:" + "\n"
					+ this.getCar().toString();

		} else {

			mssg = "Invalid reservation.";

		}

		return mssg;
	}

	public boolean isInsurance() {
		return insurance;
	}
	
	public RentalCar getCar() {
		return (RentalCar) car;
	}

	public Guest getGuest() {
		return guest;
	}

	private void setInsurance(boolean insurance) {
		this.insurance = insurance;
	}
	
	private void setCar(Rentable car) {
		this.car = car;
	}
	
	
}