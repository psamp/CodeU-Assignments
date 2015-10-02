package com.calculator;

public class Event {
	
//	This method takes no params, returns nothing, but prints a message.
	static void doNothing() {
		System.out.println("I am an extremely lazy method!");
	}
	
//	This method takes in an int param, and prints it within a message in the console.
	static void takeParam(int param) {
		System.out.println("You passed in " + param + "!");
	}
	
//	This method takes in two numbers, adds them together and returns the result.
	static String addTheseTwo(double x, double y) {
		double sum = x + y;
		return x + " + " + y + " = " + sum + ".";
	}
}
