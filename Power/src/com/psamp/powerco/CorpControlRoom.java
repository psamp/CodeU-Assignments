package com.psamp.powerco;

class CorpControlRoom {
	private static Plant[] powerPlants;
	
	static {
		powerPlants = new Plant[6];
		
		powerPlants[0] = new Electric(553, 9, 14.88);
		powerPlants[1] = new Solar(118, 2, "Sunnyville");
		powerPlants[2] = new Electric(667, 18, 2.30);
		powerPlants[3] = new Solar(478, 1, "Lightly");
		powerPlants[4] = new Electric(235, 5, 3.45);
		powerPlants[5] = new Solar(768, 4, "Maui");
		
	}
	
	void displayData() {
		
		for (int i = 0; i < powerPlants.length; i++) {
			powerPlants[i].fail();
			powerPlants[i].generatePower();
			powerPlants[i].chargeForService();
			powerPlants[i].toString();
		}
	}
	
	public static void main(String[] args) {
		CorpControlRoom ccr = new CorpControlRoom();
		
		ccr.displayData();
	}

}
