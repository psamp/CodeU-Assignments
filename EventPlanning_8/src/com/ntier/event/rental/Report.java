package com.ntier.event.rental;

//TODO:psampson Oct 21, 2015 - put in package

public class Report {
	
	public String displayInventory(HotelRoom[] rooms) {
		
		String concat = "";
		
		for (int i = 0; i < rooms.length; i++) {
			concat += rooms[i].toString();
		}
		
		return concat;	
	}
	
	public String displayInventory(RentalCar[] cars) {
		String concat = "";
		
		for (int i = 0; i < cars.length; i++) {
			concat += cars[i].toString();
		}
		
		return concat;
	}

}
