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
	
	public String getMake() {
	
		return this.make;
	
	}
	
	public String getModel() {
	
		return this.model;
	
	}
	
	public Long getID() {
	
		return this.ID;
	
	}
	
	public void setMake(String make) {
	
		this.make = make;
	
	}
	
	public void setModel(String model) {
	
		this.model = model;
	
	}
	
	public void setID(int num) {
		this.ID = (long)(num);
	}

}
