package com.psamp.rental;

public class RentalCar {
	
	private Long ID;
	private String make;
	private String model;
	
	RentalCar(String make, String model, long id) {
		
		this.make = make;
		this.model = model;
		this.ID = id;
	
	}
	
	String getMake() {
	
		return this.make;
	
	}
	
	String getModel() {
	
		return this.model;
	
	}
	
	Long getID() {
	
		return this.ID;
	
	}
	
	void setMake(String make) {
	
		this.make = make;
	
	}
	
	void setModel(String model) {
	
		this.model = model;
	
	}
	
	void setID(int num) {
		this.ID = (long)(num);
	}

}
