package com.psamp.util;

class Calculator {

//	Add two numbers.
	double addThese(double a, double b) {
		double sum = a + b;
		return sum;
	}
	
	int addThese(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	double addThese(String a, String b) {
		
		double sum = 0;
		
		if( a.matches("[0-9]+") || b.matches("[0-9]+") ) {
			
			sum = Double.parseDouble(a) + Double.parseDouble(b);
			
		} else {
			
			System.out.println("Calculator, not concatator. Only numbers.");
			sum = 0;
		}
		return sum;
	}
	
//	Subtract two numbers.
	double subtractThese(double x, double y) {
		double left = x - y;
		return left;
	}
	
	int subtractThese(int x, int y) {
		int left = x - y;
		return left;
	}
	
	double subtractThese(String x, String y) {
		double left = 0;
		
		if( x.matches("[0-9]+") || x.matches("[0-9]+") ) {
			
			left = Double.parseDouble(x) - Double.parseDouble(y);
			
		} else {
			
			System.out.println("Calculator, not concator. Only numbers.");
			left = 0;
		}
		
		return left;
	}
	
//	Multiply two numbers.
	double multiplyThese(double g, double h) {
		double product = g * h;
		return product;
	}
	
	int multiplyThese(int g, int h) {
		int product = g * h;
		return product;
	}
	
	double multiplyThese(String g, String h) {
		double product = 0;
		
		if( g.matches("[0-9]+") || h.matches("[0-9]+") ) {
			
			product = Double.parseDouble(g) * Double.parseDouble(h);
			
		} else {
			
			System.out.println("Calculator, not concator. Only numbers.");
			product = 0;
		}
		
		return product;
	}
	
//	Divide two numbers.
	double divideThese(double j, double k) {
		double result = j / k;
		return result;
	}
	
	int divideThese(int j, int k) {
		int result = j / k;
		return result;
	}
	
	double divideThese(String j, String k) {
		
		double result = 0;
		
		if( j.matches("[0-9]+") || j.matches("[0-9]+") ) {
			
			result = Double.parseDouble(j) / Double.parseDouble(k);
			
		} else {
			
			System.out.println("Calculator, not concator. Only numbers.");
			result = 0;
		}
		
		return result;
		
	}
	
//	Get length of a string.
	int getLength(String abcs) {
		return abcs.length();
	}
	
	int getLength(int num) {
		int length = Integer.toString(num).length();
		return length;
	}
	
	int getLength(double num) {
		int length = Double.toString(num).length();
		return length;
	}
	
//	Return true if the first number or word passed in is larger than the second.
	boolean firstLarger(double l, double m) {
		
		boolean tf = false;
		
		if (l > m) {
			tf = true;
		}
		
		return tf;
	
	}
	
	boolean firstLarger(int l, int m) {
		
		boolean tf = false;
		
		if (l > m) {
			tf = true;
		}
		
		return tf;
	
	}
	
	boolean firstLarger(String l, String m) {
		
		boolean tf = false;
		
		if (l.length() > m.length()) {
			tf = true;
		}
		
		System.out.println("string | firstLarger");
		
		return tf;
	
	}
	
//	Sum the contents of an array.
	double sumArray(double[] arr, String name) {
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
		}
		
		System.out.println("The sum of " + name + " is " + sum + ".");
		
		return sum;
	}
	
	double sumArray(String[] arr, String name) {
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if( !(arr[i].matches("[0-9]+")) ) {
				
				System.out.println("Calculator, not concator. Only numbers.");
				sum = 0;
				break;
				
			} else {
				
				double num = Double.parseDouble(arr[i]);
				sum += num;
			}
		}
		
		System.out.println("The sum of " + name + " is " + sum + ".");
		
		return sum;
	}
	
	int sumArray(int[] arr, String name) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
		}
		
		System.out.println("The sum of " + name + " is " + sum + ".");
		
		return sum;
	}
	
//	Find multiple instances of a number.
	double findValues(double[] arr, double num) {
		
		double found = 0;
		
		for (int i = 0; (i < arr.length) & (found <= 5); i++) {
			if (arr[i] == num) {
				found++;
			}
		}
		
		System.out.println("Found " + found + " instances of: " + num );
		return found;
		
	}
	
	int findValues(int[] arr, int num) {
		
		int found = 0;
		
		for (int i = 0; (i < arr.length) & (found <= 5); i++) {
			if (arr[i] == num) {
				found++;
			}
		}
		
		System.out.println("Found " + found + " instances of: " + num );
		return found;
		
	}
	
	double findValues(String[] arr, int num) {
		
		int found = 0;
		
		for (int i = 0; (i < arr.length) & (found <= 5); i++) {
			
			if( arr[i].matches("[0-9]+") ) {
				
				double number = Double.parseDouble(arr[i]);
				
				if (number == num) {
					found++;
				}
				
			} else {
				
				System.out.println("Calculator, not concator. Only numbers.");
				found = 0;
				break;
			}
		}
		
		System.out.println("Found " + found + " instances of: " + num );
		return found;
		
	}
	
}
