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
	
//	Based on whether the first param is larger than the second, return a boolean.
	public boolean firstLarger(double l, double m) {
		boolean tf = false;
		
		if (l > m) {
			tf = true;
		} else {
			tf = false;
		}
		
		return tf;
	
	}
	
//	Add together array of numbers.
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
	
}
