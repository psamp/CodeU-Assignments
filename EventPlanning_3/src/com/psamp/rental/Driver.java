package com.psamp.rental;

class Driver {
	private String firstName;
	private String lastName;
	
	Driver(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString() {
		
		String driver = firstName + " " + lastName;

		return driver;
		
	}

}
