package com.psamp.lab3pt4;

public class Calculator {

//	Add two doubles.
	public double addThese(double a, double b) {
		double sum = a + b;
		return sum;
	}
	
//	Subtract two doubles.
	public double subtractThese(double x, double y) {
		double left = x - y;
		return left;
	}
	
//	Multiply two doubles.
	public double multiplyThese(double g, double h) {
		double product = g * h;
		return product;
	}
	
//	Divide two doubles.
	public double divideThese(double j, double k) {
		double result = j / k;
		return result;
	}
	
//	Divide two integers.
	public int divideTheseIntegers(int c, int d) {
		int result = c / d;
		return result;
	}
	
//	Get length of a string.
	public int getLength(String abcs) {
		return abcs.length();
		
	}
	
//	Return true if the first number passed in is larger than the second.
	public boolean firstLarger(double l, double m) {
		
		boolean tf = false;
		
		if (l > m) {
			tf = true;
		}
		
		return tf;
	
	}
	
//	Sum the contents of an array of positive numbers.
	public double sumArray(double[] arr, String name) {
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] > 0) {
				sum += arr[i];
			}
		}
		
		System.out.println("The sum of " + name + " is " + sum + ".");
		
		return sum;
	}
	
//	Sum the contents of an array of positive and negative numbers.
	public double sumArrayNegative(double[] arr, String name) {
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
				sum += arr[i];
		}
		
		System.out.println("The sum of " + name + " is " + sum + ".");
		
		return sum;
	}
	
//	Find multiple instances of a number.
	public double countValues(double[] arr, double num) {
		
		double found = 0;
		
		for (int i = 0; (i < arr.length) & (found <= 5); i++) {
			if (arr[i] == num) {
				found++;
			}
		}
		
		System.out.println("Found " + found + " instances of: " + num );
		return found;
		
	}
	
}