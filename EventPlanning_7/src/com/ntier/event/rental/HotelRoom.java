package com.ntier.event.rental;

class HotelRoom implements Format {
	private int number;
	private int beds;
	private boolean isSmokingAllowed;
	
	HotelRoom(int number, boolean smoking) {
		this.setNumber(number);
		this.setBeds(1);
		this.isSmokingAllowed(smoking);
	}
	
	HotelRoom(int number, int beds, boolean smoking) {
		
		this.setNumber(number);
		this.setBeds(beds);
		this.isSmokingAllowed(smoking);
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
		
		int check = this.checkHowManyBeds(beds);
		
		this.beds = check;
	}

	public void isSmokingAllowed(boolean isSmokingAllowed) {
		this.isSmokingAllowed = isSmokingAllowed;
	}

}
