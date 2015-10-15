package com.psamp.rental;

class HotelRoom {
	
	private int roomNumber;
	private boolean smoking;
	
	HotelRoom(int roomNumber, boolean smoking) {
		
		this.roomNumber = roomNumber;
		this.smoking = smoking;
	
	}
	
	public int getRoomNumber() {
		
		return this.roomNumber;
	
	}
	
	public boolean getSmoking() {
		
		return this.smoking;
		
	}
	
	public void setRoomNumber(int roomNumber) {
		
		this.roomNumber = roomNumber;
		
	}
	
	public boolean setSmoking(boolean smoking) {
	
		this.smoking = smoking;
		return this.smoking;
	
	}
}
