package com.pp.usesym;

public class USPop {
	
	static String popGrowth(double years) {
		double currentPop;
		double rate;
		
		currentPop = 318_900_000.000;
		rate = .007;
		
		
		//Take the current population. Calculate .7 percent of it, and add that to the current population.
		for(int x = 0; x <= years; x++) {
			double change = currentPop * rate;
			currentPop = currentPop + change;
		}
		
		return "The United State's population will be " + currentPop + " in " + years + " years."; 
	}
	
	public static void main(String [] args) {
	
		String popGrowth5;
		String popGrowth10;
		String popGrowth15;
		
		popGrowth5 = popGrowth(1);
		popGrowth10 = popGrowth(5);
		popGrowth15 = popGrowth(10);
		
		System.out.println(popGrowth5);
		System.out.println(popGrowth10);
		System.out.println(popGrowth15);
		
	}
	
}
