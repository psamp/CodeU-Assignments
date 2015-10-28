package com.codeu.event.rental;

class Driver {
	private String firstName;
	private String lastName;
	
	Driver(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	@Override
	public String toString() {
		String name = this.firstName + " " + this.lastName;
		return name;
	}

}
