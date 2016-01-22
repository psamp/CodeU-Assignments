package com.psamp.lab3pt3;

public class Event {
	
//	This method takes no params, returns nothing, and prints a message.
	 void doNothing() {
		System.out.println("I am an extremely lazy method!");
	}
	
//	This method takes in an int and prints it within a message in the console.
	void takeParam(int param) {
		System.out.println("You passed in " + param + "!");
	}
	
//	This method takes in two ints, adds them together and returns the sum.
	String addTheseTwo(double x, double y) {
		double sum = x + y;
		return x + " + " + y + " = " + sum + ".";
	}
}
