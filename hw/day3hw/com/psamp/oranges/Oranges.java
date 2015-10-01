package com.psamp.oranges;

// This program needs to determine how many of ten oranges are leftover after sharing, and how many oranges each person gets if divided up.

public class Oranges {
	
	// Take in an amount of people, modulo the oranges and return result.
	static String orangesLeft(int people) {
		int orange = 10;
		int result = (orange % people);
		return "There are " + result + " oranges left.";
	}
	
	// Take in  double of people, divide the oranges by them and return the result.
	static String orangesShared(double people) {
		double orange = 10.00;
		
		double result = (orange / people);
		return "Everyone has " + result + " oranges.";
	}
//	Instantiate program, call methods and print them.
	public static void main(String [] args) {
		String orangesLeft = orangesLeft(4);
		String orangesShared = orangesShared(4);
		
		System.out.println(orangesLeft);
		System.out.println(orangesShared);
	}
}
