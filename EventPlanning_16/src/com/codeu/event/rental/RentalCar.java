package com.codeu.event.rental;

import java.io.Serializable;

public class RentalCar extends Rentable implements Serializable {
	private static final long serialVersionUID = -9215364973188983208L;
	private String make;
	private String model;
	private long year;
	private long ID;
	Driver driver;
	
	public RentalCar(String make, String model, String id) {
		
	}
	
	public RentalCar(long year, String make, String model, long id) {
		
		this.setYear(year);
		this.setMake(make);
		this.setModel(model);
		this.setID(id);
		this.setYear(year);
	
	}
	
	public RentalCar(long year, String make, String model, long id, String lastName, String firstName) {
		
		this.setMake(make);
		this.setModel(model);
		this.setID(id);
		this.setYear(year);
		this.driver = new Driver(lastName, firstName);
	
	}
	
	public RentalCar(String make, String model, long id, String firstName, String lastName) {
		
		this.setMake(make);
		this.setModel(model);
		this.setID(id);
		this.setYear(2009);
		this.driver = new Driver(firstName, lastName);
	
	}
	
	 public String toString() {
		 
		String mssg = this.getDriver() + " drives the " + this.getYear() + " " + this.getMake() + " " + this.getModel() + " (ID: " + this.getID() + ".)" + "\n";
	
		return mssg;	
	
	 }
	 
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof RentalCar) {
			
			RentalCar rc = (RentalCar) obj;
			return this.getID() == rc.getID();	
		
		}
		
		return false;
	}
	 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID ^ (ID >>> 32));
		result = prime * result + ((driver == null) ? 0 : driver.hashCode());
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (int) (year ^ (year >>> 32));
		return result;
	}

	 private String getMake() {
		return make;
	}

	private String getModel() {
		return model;
	}

	 private long getYear() {
		return year;
	}

	 private long getID() {
		return ID;
	}
	
	 String getDriver() {
		return driver.toString();
	}

	 private void setMake(String make) {
		this.make = make;
	}

	 private void setModel(String model) {
		this.model = model;
	}

	 private void setYear(long year) {
		this.year = year;
	}

	 private void setID(long iD) {
		ID = iD;
	}
	 
	 public void setDriver(String firstName, String lastName) {
		this.driver = new Driver(firstName, lastName);
	}

}
