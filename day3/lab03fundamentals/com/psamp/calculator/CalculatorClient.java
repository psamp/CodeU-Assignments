package com.psamp.calculator;

class CalculatorClient {

	public static void main(String[] args) {
		 Calculator calc = new Calculator();
		 
//		 Call calculator methods and print messages with their values.
		 System.out.println( "1 + 2 = " + calc.addThese(8, 4));
		 System.out.println( "8 - 4 = " + calc.subtractThese(8, 4));
		 System.out.println( "8 * 4 = " + calc.multiplyThese(8, 4));
		 System.out.println( "8.2 / 4.3 = " + calc.divideThese(8.2, 4.3));
		 System.out.println("8 / 4 is " + calc.divideTheseIntegers(8, 4));
		 System.out.println("\"Eight is larger than four\" is " + calc.getLength("Eight is larger than four") + " letters.");
		 System.out.println("The first number is larger = " + calc.firstLarger(8, 4));
		 
	}

}
