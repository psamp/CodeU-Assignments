package com.psamp.fivepttwo;
import com.psamp.lab3pt4.Calculator;

class CalulatorClient {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
//		Array with only whole numbers.
		double num[] = {8, 90, 67.98, 84};
		
//		Array of whole and negative numbers.
		double numNeg[] = {8, 90, 67.98, 84, -32};
		
//		Call calculator's sum array method, pass in the name.
		calculator.sumArray(num, "num");
		calculator.sumArray(numNeg, "numNeg");

	}

}
