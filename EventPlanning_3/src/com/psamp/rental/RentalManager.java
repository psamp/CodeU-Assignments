package com.psamp.rental;

class RentalManager {
	
	private static RentalCar[] cars;
	private static HotelRoom[] rooms;
	
/*	(Code will work with constructor, and removal of static variables, but...
 *	...every time we create an instance of HotelManager, we'll get a new copy of our rentals.
 *	We want all our HotelManagers to share the same exact "database.")
 *	
 *	Initialize static "class" variables before an instance is even created.
 */
	static {
//		Initialize cars and rooms instance variables.
		cars = new RentalCar[5];
		rooms = new HotelRoom[4];

//		Initialize rooms.
		cars[0] = new RentalCar("Toyota", "Matrix", 1, 2009, "Lora", "Ipsum");
		cars[1] = new RentalCar("Honda", "Civic", 2, 2006, "Anakin", "Skywalker");
		cars[2]	= new RentalCar("Nissan", "Quest", 3, 2000, "Obi-Wan", "Kenobi");
		cars[3] = new RentalCar("Ford", "Explorer", 4, 2015, "Bucky", "Barnes");
		cars[4] = new RentalCar("Mazda", "Mazda3", 5, 2009, "Natalia", "Ramanova");
		
//		Initialize rooms.
		rooms[0] = new HotelRoom(16, true);
		rooms[1] = new HotelRoom(12, false);
		rooms[2] = new HotelRoom(4, true);
		rooms[3] = new HotelRoom(42, false);
		
	}
	
/*	Loop through our cars array.
 * 	Each time, call the toString method on the cars object.
 * 	Also append a concatenated string containing these variables and formatting to the rental variable.
 * 	Return this rental.
 */
	public String getCars() {
		String rentals = "";
		
		for (int i = 0; i < RentalManager.cars.length; i++) {
			
			String info = RentalManager.cars[i].toString();
			
			rentals += info;
			
		}
		
		return rentals;
	}
	
/*	Loop through our rooms array.
* 	Each time, call the toString method on the rooms object.
* 	Also append a concatenated string containing these variables and formatting to the rental variable.
* 	Return this rental.
*/
	public String getRooms() {
		String rentals = "";
		
		for (int i = 0; i < RentalManager.rooms.length; i++) {
			
			String info = RentalManager.rooms[i].toString();
			
			rentals += info;
			
		}
		
		return rentals;
	}
	
	public RentalCar[] getCarArray() {
		return RentalManager.cars;
	}
	
	public HotelRoom[] getRoomArray() {
		return RentalManager.rooms;
	}
	
}