package com.pp.usesym;

class UseSymbols {
	
//	Take in an int, and add itself to it.
	static int toSecondPower(int x) {
		int sum;
		sum = x + x++;
		return sum;
	}
	
//	Take in an int, subtract itself from it.
	static int minusSelf(int y) {
		int sum;
		sum = y - y--;
		return sum;
	}
	
//	See which of three numbers is the largest.
	static int findLargest(int x, int y, int z) {
		int lrg;
		int largest;
		largest = 0;
		
		if (x > y && x > z) {
			largest = x;
		} else if(y > z && y > x) {
			largest = y;
		} else if(z > y && z > x) {
			largest = z;
		}
		
		lrg = largest;
		return lrg;
	}
	
//	Tell whether someone's an adult, based on their age.
	static String findAge(int x) {
		int age;
		String youAre;
		age = x;
		youAre = "";
		
		if(!(age < 18)) {
			youAre = "You are an adult.";
		} else {
			youAre = "You are not an adult.";
		}
		
		return youAre;
	}
	
//	See whether or not there's a remainder when two numbers are reduced modulo.
	static String checkForRemainder(double x, double y){
		String remainder;
		remainder = "";
		
		if( (x % y) == 0 ) {
			remainder = "There is no remainder.";
		} else {
			remainder = "There's a remainder.";
		}
		return remainder;
	}
	
	public static void main(String [] args) {
		int toSecondPower = toSecondPower(10);
		int minusSelf = minusSelf(10);
		int findLargest = findLargest(10, 20, 30);
		String findAge = findAge(18);
		String checkForRemainder = checkForRemainder(100, 9);
		
		
		System.out.println("Used ++: " + toSecondPower);
		System.out.println("Used --: " + minusSelf);
		System.out.println("Used &&: " + findLargest);
		System.out.println("Used !: " + findAge);
		System.out.println("Used %: " + checkForRemainder);
		
		
	}

}
