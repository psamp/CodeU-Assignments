package com.codeu.event.reservation;

import com.codeu.event.rental.Guest;
import com.codeu.event.rental.Rental;
import com.codeu.event.rental.RentalCar;
import com.ntier.event.util.EmailSender;

public class CarReservation extends Reservation {
	private Rental car;

	public CarReservation(Guest guest, Rental car) {

		super(guest);
		this.setCar(car);

		if (this.reserve()) {
			this.setValid(true);

		} else {
			System.out.println("You cannot book a stay or car without a valid club number or license.");
		}

	}

	@Override
	public boolean reserve() {
		EmailSender valid = new EmailSender();

		String getEmail = valid.send(this.validateClubNumber(this.getGuest().getHotelClubNumber()),
				this.validateLicense(this.getGuest().getDriversLicense()));

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

	private void setCar(Rental car) {
		this.car = car;
	}

	private RentalCar getCar() {
		return (RentalCar) car;
	}

	private Guest getGuest() {
		return guest;
	}
}