package com.psamp.util;

class RentalCar {
	private String make;
	private String model;
	private long year;
	private long ID;
	Driver driver;
	
	RentalCar(long y, String ma, String mo, long i, String ln, String fn) {
		this.year = y;
		this.make = ma;
		this.model = mo;
		this.ID = i;
		this.driver = new Driver(ln, fn);
	}
	
	RentalCar(String ma, String mo, long i, String fn, String ln) {
		this.make = ma;
		this.model = mo;
		this.year = 2009;
		this.ID = i;
		this.driver = new Driver(fn, ln);
	}
	
	@Override
	public String toString() {
		String mssg = this.driver.toString() + " drives the " + this.year + " " + this.make + " " + this.model + " (ID: " + this.ID + ".)" + "\n";
		return mssg;	
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public long getYear() {
		return year;
	}

	public long getID() {
		return ID;
	}
	
	public String getDriver() {
		return driver.toString();
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(long year) {
		this.year = year;
	}

	public void setID(long iD) {
		ID = iD;
	}
}
