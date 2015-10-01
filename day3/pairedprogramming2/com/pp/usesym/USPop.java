package com.pp.usesym;

public class USPop {
	
	static long popGrowth(int years) {
		double currentPop;
		double rate;
		long growth;
		long pop;
		
		currentPop = 318_900_000.000;
		rate = .007;
		growth = 0;
		pop = 0;
		
		//Take the current population. Calculate .7 percent of it, and add that to the current population.
		for(int x = 0; x <= years; x++) {
			double change = currentPop * rate;
			pop = (long)(currentPop + change);
			growth = pop;
			
		}
		
		return growth;
	}
	
	public static void main(String [] args) {
	
		long popGrowth;
		popGrowth = popGrowth(5);
		
		System.out.println("The US' population will be " + popGrowth + " in the amount of years you specified." );
		
	}
	
}
