package com.psamp.util;

class HotelRoom {
	private int number;
	private int beds;
	private boolean isSmokingAllowed;
	
	HotelRoom(int n, boolean s) {
		this.number = n;
		this.beds = this.checkHowManyBeds(1);
		this.isSmokingAllowed = s;
	}
	
	HotelRoom(int n, int b, boolean s) {
		
		this.number = n;
		this.beds = this.checkHowManyBeds(b);
		this.isSmokingAllowed = s;
	}
	
	private int checkHowManyBeds(int num) {
		if(num >= 2) {
			return 2;
		} else {
			return 1;
		}
	}
	
	@Override
	public String toString() {
		
		String mssg = "";
		
		if (this.isSmokingAllowed == false) {
			mssg = "Room " + this.number + " has " + this.beds + " bed(s). Smoking is not allowed." + "\n";
		} else {
			mssg = "Room " + this.number + " has " + this.beds + " bed(s). Smoking is allowed." + "\n";
		}
		
		return mssg;
	}

	public int getNumber() {
		return number;
	}

	public int getBeds() {
		return beds;
	}

	public boolean isSmokingAllowed() {
		return isSmokingAllowed;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	public void setSmokingAllowed(boolean isSmokingAllowed) {
		this.isSmokingAllowed = isSmokingAllowed;
	}

}
