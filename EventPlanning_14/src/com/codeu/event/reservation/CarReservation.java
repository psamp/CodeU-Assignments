package com.codeu.event.reservation;

import com.codeu.event.insurance.Insurance;
import com.codeu.event.rental.CreditCard;
import com.codeu.event.rental.Guest;
import com.codeu.event.rental.Rentable;
import com.codeu.event.rental.RentalCar;
import com.codeu.spendable.Spendable;
import com.codeu.spendable.USD;
import com.ntier.event.util.EmailSender;

public class CarReservation extends Reservation implements Insurance {
	private Rentable car;
	private boolean insurance;
	
	public CarReservation(Guest guest, Rentable car) {

		super(guest);
		this.setCar(car);
		this.setInsurance(false);
		this.getCar().setDriver(this.getGuest().getFirstName(), this.getGuest().getLastName());
	}
	
	public CarReservation(Guest guest, Rentable car, int insurancePayment) {

		super(guest);
		this.setCar(car);
		this.setInsurance(this.buyInsurance(insurancePayment));
		this.getCar().setDriver(this.getGuest().getFirstName(), this.getGuest().getLastName());

	}
	
	@Override
	public boolean reserve(double amount, Spendable type) {
		EmailSender email = new EmailSender();

		String getEmail = email.send(Reservation.validateClubNumber(this.getGuest().getHotelClubNumber()),
				this.validateLicense(this.getGuest().getDriversLicense()));

		boolean parseEmail = Boolean.parseBoolean(getEmail);
		
		if(parseEmail & this.payCash(amount, type) & Reservation.validateClubNumber(this.getGuest().getHotelClubNumber())) {
			
			this.setValid(true);
			System.out.println(type.printReceipt(amount));
			return true;
			
		} else {
			System.out.println("Money or club number/license invalid.");
			return false;
		}
	}
	
	@Override
	public boolean reserve(CreditCard cc, Spendable type) {
		EmailSender email = new EmailSender();

		String getEmail = email.send(Reservation.validateClubNumber(this.getGuest().getHotelClubNumber()),
				this.validateLicense(this.getGuest().getDriversLicense()));

		boolean parseEmail = Boolean.parseBoolean(getEmail);
		
		if(parseEmail & Reservation.payWithCard(cc)) {
			
			this.setValid(true);
			System.out.println(type.printReceipt(cc));
			return true;
			
		} else {
			
			System.out.println("Card or club number/license not valid.");
			return false;
		
		}
	}
	
	boolean payCash(double amount, Spendable type) {
		
		boolean takeMoney = false;
		
		if(amount > 0 & type instanceof USD) {
			takeMoney = true;
		}
		
		return takeMoney;
		
	}
	
	private boolean validateLicense(String num) {
		boolean rtn = false;

		if (num.length() >= 12) {
			rtn = true;
		}

		return rtn;

	}

	@Override
	public boolean buyInsurance(int payment) {
		
		boolean amountIsTen = false;
		
		if(payment == 10) {
			amountIsTen = true;
		}
		
		return amountIsTen;
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