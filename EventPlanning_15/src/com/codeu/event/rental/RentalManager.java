package com.codeu.event.rental;

import com.codeu.event.report.Report;

public class RentalManager {
	private static Rentable[] rooms;
	private static Rentable[] cars;
	private static Rentable[] flight;
	private static Report report;
	
	static {
		
		RentalManager.report = new Report();
		RentalManager.rooms = new Rentable[4];
		RentalManager.cars = new Rentable[5];
		RentalManager.flight = new Rentable[3];
		
		RentalManager.buildRooms();
		RentalManager.buildCars();
		RentalManager.buildFlight();
		
	}
	
	private static void buildRooms() {
		
		RentalManager.rooms[0] = new HotelRoom(16, 3, true);
		RentalManager.rooms[1] = new HotelRoom(12, false);
		RentalManager.rooms[2] = new HotelRoom(4, true);
		RentalManager.rooms[3] = new HotelRoom(43, 2, false);
	
	}
	
	private static void buildCars() {
		
		RentalManager.cars[0] = new RentalCar("Toyota", "Matrix", 1, "Anakin", "Skywalker");
		RentalManager.cars[1] = new RentalCar(2014, "Honda", "Civic", 2, "Natalia", "Ramanova");
		RentalManager.cars[2] = new RentalCar("Nissan", "Quest", 3, "Bucky", "Barnes");
		RentalManager.cars[3] = new RentalCar(2008, "Ford", "Explorer", 4, "Ahsoka", "Tano");
		RentalManager.cars[4] = new RentalCar("Mazda", "Mazda3", 5, "Avatar", "Korra");
		
	}
	
	private static void buildFlight() {
		
		RentalManager.flight[0] = new PlaneSeat("SEA", "SAN", "1A");
		RentalManager.flight[1] = new PlaneSeat("BMI", "SEA", "2A");
		RentalManager.flight[2] = new PlaneSeat("JFK", "EYW", "3A");
		
	}
	
	 public String displayRooms() {
		
		String mssg = report.displayInventory(RentalManager.rooms);
		return mssg;
		
	}
	
	 public String displayCars() {
		 
		String mssg = report.displayInventory(RentalManager.cars);
		return mssg;
	
	 }
	 
	 public String displayFlight() {
		 
		String mssg = report.displayInventory(RentalManager.flight);
		return mssg;
	
	 }
	
	 public String getAmoutOfCars() {
		return "Available cars: " + RentalManager.cars.length;
	}
	
	 public String getAmoutOfRooms() {
		return "Available rooms: " + RentalManager.rooms.length;
	}
	 
	 public String getAmoutOfPlaneSeats() {
		return "Available seats: " + RentalManager.flight.length;
	}

}