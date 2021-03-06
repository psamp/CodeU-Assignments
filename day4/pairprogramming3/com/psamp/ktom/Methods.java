package com.psamp.ktom;
import java.util.Scanner;

public class Methods {
	
	/* 
	 * Take in a mile, and convert it into kilometers ([miles] * 1.6.) 
	 * Use a more exact decimal than 1.6 so your values are more exact.
	*/
	void milesToKilos(Scanner input) {
		
		try {
			
			System.out.println("Enter miles to convert to km.");
			double result;
			double mi;
			
			mi = input.nextDouble();
			result = mi * 1.60934;
			
			if(mi == 1) {
				System.out.println(mi + "mile equals " + result + " kilometers.");
				
			} else {
				System.out.println(mi + " miles equals " + result + " kilometers.");
			}
			
			
		} finally {
			
			input.close();
		}
		
	}
}
