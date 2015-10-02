package com.psamp.printstars;

//This program should take in an array of numbers, & prints asterisks after each number if the numbers are between one and twenty.
//TODO:psampson Oct 2, 2015 - Refactor to take console input.

class PrintStars {

//	Start program.
	public static void main(String[] args) {
		
//		Create an array.
		int oneThroughTwenty[] = {1, 6, 8, 25, 88};
		
//		A for loop that will run until it's iterated the length of the array.
		for (int i = 0; i < oneThroughTwenty.length; i++) {
			
		/* If the length of the passed in array is less than or greater than five, let the user know and break the loop.
		 * If the value of the current array index is greater than 20, send the user a message indicating this.
		 * Else, print the value and run a nested for loop that will print as many asterisks as the value of the 
		 * array index being passed in.
		 */
			 if (oneThroughTwenty.length < 5 || oneThroughTwenty.length > 5) {
				System.out.println("Please enter an array with no more or less than five numbers.");
				break;
				
			} else if (oneThroughTwenty[i] > 20) {	
				
				System.out.println( "\n" + "Hey, you entered " + oneThroughTwenty[i] + ". \nWe're only printing asterisks 0 - 20!");
				
			} else {
				
				System.out.println( "\n" + oneThroughTwenty[i]);
				
				for (int j = 0; j < oneThroughTwenty[i]; j++) {
					System.out.print("*");
				}
			}
		}

	}

}
