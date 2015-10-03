package com.psamp.printstars;
import java.util.Scanner;

public class Methods {
			
	void takeInArrayandPrintAsterisks(Scanner input) {
		
		System.out.println("Enter five numbers, seperated by commas.");
		
		int i;
		String ipt = input.next();
		String stringArray[] = ipt.split(",");
		
		double doubleArray[] = new double[stringArray.length];
		
		//Attempt to execute this code. Else, close the scanner.
		try {
			
			//This for loop that will run until it's iterated the length of the array passed in.
			for (i = 0; i < doubleArray.length; i++) {
			//If the length of the passed in array is less than or greater than five, let the user know and break the loop.
				 if (doubleArray.length < 5 || doubleArray.length > 5) {
					System.out.println("Please enter an array with no more or less than five numbers.");
					break;
					
				} else if (doubleArray[i] > 20) {	
					//If the value of the current array index is greater than 20, send the user a message indicating this.
					System.out.print("\n");
					System.out.println( "You entered " + doubleArray[i] + ". No printing more than 20 asterisks!");
					
				} else {
					/*Else, print the value and run a for loop that will print as many asterisks as the value of the 
					array index being passed in.*/
					System.out.println( "\n" + doubleArray[i]);
					
					for (int j = 0; j < doubleArray[i]; j++) {
						System.out.print("*");
					}
				}
			}
			
		} finally {
			
		}
	}

}
