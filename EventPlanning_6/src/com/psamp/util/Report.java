package com.psamp.util;

public class Report {
	
	public String toStringAllRooms(HotelRoom[] rooms) {
		
		String concat = "";
		
		for (int i = 0; i < rooms.length; i++) {
			concat += rooms[i].toString();
		}
		
		return concat;	
	}
	
	public String toStringAllCars(RentalCar[] cars) {
		String concat = "";
		
		for (int i = 0; i < cars.length; i++) {
			concat += cars[i].toString();
		}
		
		return concat;
	}

}
