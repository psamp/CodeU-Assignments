package com.codeu.event.rental;

import java.io.Serializable;

/** 
 * Models the data for a hotel room.
 * @author psampson
 * @version 1.3
 *
 */
public class HotelRoom extends Rentable implements Serializable {
	private static final long serialVersionUID = -2815168590417403456L;
	private int number;
	private int beds;
	private boolean isSmokingAllowed;
	
	/**
	 * Default constructor.
	 */
	public HotelRoom() {
		
	}
	
	/**
	 * Take in the room number and smoking preference and set the bed(s) to 1.
	 * @param number room number
	 * @param smoking smoking preference
	 */
	public HotelRoom(int number, boolean smoking) {
	
		this.setNumber(number);
		this.setBeds(1);
		this.isSmokingAllowed(smoking);
	
	}
	
	/**
	 * Take in the room number, smoking preference and the amount of beds.
	 * @param number room numbers
	 * @param beds amount of beds
	 * @param smoking smoking preference
	 */
	public HotelRoom(int number, int beds, boolean smoking) {
		
		this.setNumber(number);
		this.setBeds(beds);
		this.isSmokingAllowed(smoking);
		
	}
	
	public HotelRoom(String number, int beds, boolean smoking) {
		
		this.setNumber(number);
		this.setBeds(beds);
		this.isSmokingAllowed(smoking);
		
	}
	
	/**
	 * Internal util method. Ensures that no matter the amount of beds requested, the maximum is two.
	 * You can pass in any you like, but if it's above two it returns two.
	 * @param num number of beds requested
	 * @return 1 or 2 beds
	 */
	private int checkHowManyBeds(int num) {
		
		int beds = 1;
		
		if(num >= 2) {
		
			beds = 2;
		
		}
		
		return beds;
	}
	
	/**
	 * Override's toString() present on Object. Prints messaged based on smoking preference.
	 */
	@Override
	public String toString() {
		
		String mssg = "";
		
		if (this.isSmokingAllowed == false) {
			
			mssg = "Room " + this.getNumber() + " has " + this.getBeds() + " bed(s). Smoking is not allowed." + "\n";
		
		} else {
		
			mssg = "Room " + this.getNumber() + " has " + this.getBeds() + " bed(s). Smoking is allowed." + "\n";
		
		}
		
		return mssg;
	}
	
	/**
	 * Overrides equals() present on Object. Checks if rooms have the same number.
	 */
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof HotelRoom) {
			
			HotelRoom rc = (HotelRoom) obj;
			
			return this.getNumber() == rc.getNumber() ;	
		
		}
		
		return false;
	}
	
	/**
	 * Override hashCode() for a more unique hash.
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + beds;
		result = prime * result + (isSmokingAllowed ? 1231 : 1237);
		result = prime * result + number;
		return result;
	}
	
	int getBeds() {
		return beds;
	}
	
	public int getNumber() {
		return number;
	}
	
	public String getNumberAsString() {
		return Integer.toString(this.number);
	}

	public void setNumber(String num) {
		this.number = Integer.parseInt(num);
	}

	public void setNumber(int number) {
		this.number = number;
	}

	void setBeds(int beds) {
		
		int check = this.checkHowManyBeds(beds);
		
		this.beds = check;
	}

	void isSmokingAllowed(boolean isSmokingAllowed) {
		this.isSmokingAllowed = isSmokingAllowed;
	}

}
