package com.ntier.event.rental;

class RentalCar implements Format {
	private String make;
	private String model;
	private long year;
	private long ID;
	Driver driver;
	
	RentalCar(long year, String make, String model, long id, String lastName, String firstName) {
		this.setMake(make);
		this.setModel(model);
		this.setID(id);
		this.setYear(year);
		this.driver = new Driver(lastName, firstName);
	}
	
	RentalCar(String make, String model, long id, String firstName, String lastName) {
		this.setMake(make);
		this.setModel(model);
		this.setID(id);
		this.setYear(2009);
		this.driver = new Driver(firstName, lastName);
	}
	
	RentalCar(String make, String model, String id) {
		
	}
	
	
	 public String toString() {
		String mssg = this.driver.toString() + " drives the " + this.year + " " + this.make + " " + this.model + " (ID: " + this.ID + ".)" + "\n";
		return mssg;	
	}

	 String getMake() {
		return make;
	}

	 String getModel() {
		return model;
	}

	 long getYear() {
		return year;
	}

	 long getID() {
		return ID;
	}
	
	 String getDriver() {
		return driver.toString();
	}

	 void setMake(String make) {
		this.make = make;
	}

	 void setModel(String model) {
		this.model = model;
	}

	 void setYear(long year) {
		this.year = year;
	}

	 void setID(long iD) {
		ID = iD;
	}
}
