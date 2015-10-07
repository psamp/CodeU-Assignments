package com.psamp.turtle;

class Turtle {
	int age = 0;
	
//	Take in an int, return an int.
	int ageUp(int years) {
		this.age += years;
		
		return this.age;
	}
	
//	Take in an int, return nothing.
	void eatLeaves(int leaves) {
		System.out.println("Ate " + leaves + " leaves." );
	}
	
//	Take in a double, return double.
	double walkAround(double steps) {
		return steps;
	}
	
//	Take in nothing, return a string.
	String snapSnap() {
		return "*wendigo noises*";
	}
	
//	Take in nothing, return nothing.
	void wagTail() {
		System.out.println("*wags tail*");
	}
	
}
