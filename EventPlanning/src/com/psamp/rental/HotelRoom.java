package com.psamp.rental;

class HotelRoom {
	
//	Delcare private instance variables.
	private int roomNumber;
	private boolean smoking;
	private int beds;
	
//	Overload constructor, so beds can either be 1 by default, or 1 or 2 if specified.
	
	HotelRoom(int roomNumber, boolean smoking) {
		
		this.setRoomNumber(roomNumber);
		this.setSmoking(smoking);
		this.setBeds(1);
	
	}
	
	HotelRoom(int roomNumber, boolean smoking, int beds) {
		
		this.setRoomNumber(roomNumber);
		this.setSmoking(smoking);
		
		if(beds >= 2) {
			this.setBeds(2);
			
		} else {
			
			this.setBeds(1);
			
		}
	
	}
	
//	Return object info as a string.
	public String toString() {
		
		int rn = this.getRoomNumber();
		boolean smk = this.getSmoking();
		int beds = this.getBeds();
		
		String info = "";
		
		if(smk == true) {
			
			info = "Room " + rn + " has " + beds + " bed(s) " + "and smoking is allowed.";
			
		} else {
			
			info = "Room " + rn + " has " + beds + " bed(s) " + "and smoking is NOT allowed.";
			
		}
		
		return info;
		
	}
	
//	Getters and setters.
	public int getRoomNumber() {
		return this.roomNumber;
	}
	
	public boolean getSmoking() {
		return this.smoking;	
	}
	
	public int getBeds() {
		return this.beds;
	}
	
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public void setSmoking(boolean smoking) {
		this.smoking = smoking;
	}

	public void setBeds(int beds) {
		this.beds = beds;
	}

	
}
