package com.psamp.oranges;

public class Methods {
	
	// Take in an amount of people, modulos the oranges and returns the result.
		static String orangesLeft(int people) {
			int x = 10;
			int result = (x % people);
			
			return "There are " + result + " oranges left.";
		}
		
		// Take in  double of people, divide the oranges by them and return the result.
		static String orangesShared(double people) {
			double y = 10;
			double result = (y / people);
			
			return "Everyone has " + result + " oranges.";
		}

}