package com.psamp.rental;

class Report {
	
	public String displayRentalCars(RentalCar[] cars) {
		
		String rentals = "";
		
		for (int i = 0; i < cars.length; i++) {
			
			String info = cars[i].toString();
			
			rentals += info;
			
		}
		
		return rentals;
		
	}
	
	public String displayHotelRooms(HotelRoom[] rooms) {
		
		String rentals = "";
		
		for (int i = 0; i < rooms.length; i++) {
			
			String info = rooms[i].toString();
			
			rentals += info;
			
		}
		
		return rentals;
		
	}

}
