package com.psamp.powerco;

class Solar extends Plant {

	private String locationOfPlant;
	
	Solar(int workers, int age, String location) {
		super(workers, age);
		this.setLocation(location);
	}
	
	int generatePower() {
		System.out.println("Solar's generate power");
		return 700_000;
	}

	boolean fail() {
		System.out.println("In Solar fail method");
		boolean failed = false;
		if(System.currentTimeMillis() % 3 == 0) {
			failed = true;
		}
		
		return failed;
	}

	public String getLocation() {
		return locationOfPlant;
	}

	public void setLocation(String location) {
		this.locationOfPlant = location;
	}

	@Override
	public String toString() {
		return "Solar [location=" + locationOfPlant + "]";
	}

	
}
