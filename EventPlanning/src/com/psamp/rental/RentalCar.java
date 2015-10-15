package com.psamp.rental;

public class RentalCar {
	
	private Long ID;
	private String make;
	private String model;
	private int year;
	
//	Overload constructor, so year can be 1 by default, and 1 or 2 if specified.
	RentalCar(String make, String model, long id) {
		
		this.setMake(make);
		this.setModel(model);
		this.setID(id);
		this.setYear(2009);
	
	}
	
	RentalCar(String make, String model, long id, int year) {
		
		this.setMake(make);
		this.setModel(model);
		this.setID(id);
		this.setYear(year);
	
	}
	
	public String getMake() {
	
		return this.make;
	
	}
	
	public String getModel() {
	
		return this.model;
	
	}
	
	public Long getID() {
	
		return this.ID;
	
	}
	
	public int getYear() {
		return this.year;
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
	
	public String toString() {
		
		String make = this.getMake();
		String model = this.getModel();
		long ID = this.getID();
		int year = this.getYear();
		
		String strng = year + " " + make + " " + model + " has an ID of " + ID + ".";
		
		return strng;
		
	}

}
