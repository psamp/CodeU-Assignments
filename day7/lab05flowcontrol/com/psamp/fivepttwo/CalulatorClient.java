package com.psamp.fivepttwo;
import com.psamp.lab3pt4.Calculator;

class CalulatorClient {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
//		Array with only whole numbers.
		double num[] = {8, 90, 67.98, 84};
		
//		Array of whole and negative numbers.
		double numNeg[] = {8, 90, 67.98, 84, -32};
		
//		Array with repeat numbers.
		double numMult[] = {56, 85, 85, 85, 85, 85, 85, 85};
		
//		Call calculator's sum array method, pass in the name.
		calculator.sumArray(num, "num");
		calculator.sumArrayNegative(numNeg, "numNeg");
		calculator.sumArrayNegative(numNeg, "numNeg");
		calculator.countValues(numMult, 85);
	}

}
