package com.psamp.powerco;

abstract class Plant {
	private int plantWorkers;
	private int plantAge;
	
	Plant(int workers, int age) {
		this.setWorkers(workers);
		this.setAge(age);
	}
	
	double chargeForService() {
		System.out.println("All power plants want your first born.");
		return 8_000_000;
	}
	
	abstract int generatePower();
	abstract boolean fail();
	
	@Override
	public String toString() {
		return "Plant [workers=" + this.getWorkers() + ", age=" + this.getAge() + "]";
	}
	
	public int getWorkers() {
		return plantWorkers;
	}
	public int getAge() {
		return plantAge;
	}
	public void setWorkers(int workers) {
		this.plantWorkers = workers;
	}
	public void setAge(int age) {
		this.plantAge = age;
	}
	
	
	

}
