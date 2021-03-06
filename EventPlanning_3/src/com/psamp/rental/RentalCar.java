package com.psamp.rental;

class RentalCar {
	
	private long ID;
	private String make;
	private String model;
	private long year;
	private Driver driver;
	
//	Overload constructor, so year can either be 2009 by default, or something else if specified.
	RentalCar(String make, String model, long id, String driverFirstName, String driverLastName) {
		
		this.setMake(make);
		this.setModel(model);
		this.setID(id);
		this.setYear(2009);
		this.driver = new Driver(driverFirstName, driverLastName);
	
	}
	
	RentalCar(String make, String model, long id, int year, String driverFirstName, String driverLastName) {
		
		this.setMake(make);
		this.setModel(model);
		this.setID(id);
		this.setYear(year);
		this.driver = new Driver(driverFirstName, driverLastName);
	
	}
	
//	Return object info as a string.
	@Override
	public String toString() {
		
		String make = this.getMake();
		String model = this.getModel();
		long ID = this.getID();
		long year = this.getYear();
		String drives = this.driver.toString();
		
		String strng = year + " " + make + " " + model + " has an ID of " + ID + ". " + drives + " drives it." + "\n";
		
		return strng;
		
	}
	
//	Getters and setters.
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public Long getID() {
		return this.ID;
	}
	
	public long getYear() {
		return this.year;
	}
	
	public String getDriver() {
		return this.driver.toString();
	}
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setID(long id) {
		this.ID = id;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
