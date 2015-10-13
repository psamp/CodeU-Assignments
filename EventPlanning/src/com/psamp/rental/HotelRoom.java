package com.psamp.rental;

public class HotelRoom {
	
	private int roomNumber;
	private boolean smoking;
	
	HotelRoom(int roomNumber, boolean smoking) {
		
		this.roomNumber = roomNumber;
		this.smoking = smoking;
	
	}
	
	int getRoomNumber() {
		
		return this.roomNumber;
	
	}
	
	boolean getSmoking() {
		
		return this.smoking;
		
	}
	
	void setRoomNumber(int roomNumber) {
		
		this.roomNumber = roomNumber;
		
	}
	
	boolean setSmoking(boolean smoking) {
	
		this.smoking = smoking;
		return this.smoking;
	
	}
}
