package com.psamp.lab3pt4;

class Calculator {

//	Add two doubles.
	double addThese(double a, double b) {
		double sum = a + b;
		return sum;
	}
	
//	Subtract two doubles.
	double subtractThese(double x, double y) {
		double left = x - y;
		return left;
	}
	
//	Multiply two doubles.
	double multiplyThese(double g, double h) {
		double product = g * h;
		return product;
	}
	
//	Divide two doubles.
	double divideThese(double j, double k) {
		double result = j / k;
		return result;
	}
	
//	Divide two integers.
	int divideTheseIntegers(int c, int d) {
		int result = c / d;
		return result;
	}
	
//	Get length of a string.
	int getLength(String abcs) {
		return abcs.length();
		
	}
	
//	Based on whether the first param is larger than the second, return a boolean.
	boolean firstLarger(double l, double m) {
		boolean tf = false;
		
		if (l > m) {
			tf = true;
		} else {
			tf = false;
		}
		
		return tf;
	}
	
}