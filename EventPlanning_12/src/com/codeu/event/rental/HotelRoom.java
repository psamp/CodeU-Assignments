package com.codeu.event.rental;

import java.io.Serializable;

public class HotelRoom extends Rentable implements Serializable {
	private static final long serialVersionUID = -2815168590417403456L;
	/**
	 * 
	 */
	private int number;
	private int beds;
	private boolean isSmokingAllowed;
	
	public HotelRoom(int number, boolean smoking) {
		this.setNumber(number);
		this.setBeds(1);
		this.isSmokingAllowed(smoking);
	}
	
	public HotelRoom(int number, int beds, boolean smoking) {
		
		this.setNumber(number);
		this.setBeds(beds);
		this.isSmokingAllowed(smoking);
	}
	
	public HotelRoom() {
		
	}
	
	private int checkHowManyBeds(int num) {
		if(num >= 2) {
			return 2;
		} else {
			return 1;
		}
	}
	
	public String toString() {
		
		String mssg = "";
		
		if (this.isSmokingAllowed == false) {
			mssg = "Room " + this.getNumber() + " has " + this.getBeds() + " bed(s). Smoking is not allowed." + "\n";
		} else {
			mssg = "Room " + this.getNumber() + " has " + this.getBeds() + " bed(s). Smoking is allowed." + "\n";
		}
		
		return mssg;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof HotelRoom) {
			
			HotelRoom rc = (HotelRoom) obj;
			return this.getNumber() == rc.getNumber() ;	
		
		}
		
		return false;
	}

	public int getNumber() {
		return number;
	}

	private int getBeds() {
		return beds;
	}

	private void setNumber(int number) {
		this.number = number;
	}

	private void setBeds(int beds) {
		
		int check = this.checkHowManyBeds(beds);
		
		this.beds = check;
	}

	private void isSmokingAllowed(boolean isSmokingAllowed) {
		this.isSmokingAllowed = isSmokingAllowed;
	}

}
