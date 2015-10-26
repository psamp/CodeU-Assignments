package com.psamp.powerco;

class Electric extends Plant {
	private double proximityOfPlantToCoal;
	
	Electric(int workers, int age, double proxToCoal) {
		super(workers, age);
		this.setProxToCoal(proxToCoal);
	}

	
	int generatePower() {
		System.out.println("Electric's generate power method.");
		return 800_000;
	}
	
	boolean fail() {
		
		boolean failed = false;
		System.out.println("In Electric fail method");
		int randomint = (int) (100 * Math.random());
		
		if (randomint % 2 == 0) {
			failed = true;
		}
		
		return failed;
	}

	public double getProxToCoal() {
		return proximityOfPlantToCoal;
	}

	private void setProxToCoal(double proxToCoal) {
		this.proximityOfPlantToCoal = proxToCoal;
	}

	@Override
	public String toString() {
		return "Electric [proxToCoal=" + this.getProxToCoal() + "]";
	}

}
