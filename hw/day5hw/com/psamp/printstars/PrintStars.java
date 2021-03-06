package com.psamp.printstars;

/*This program should take in an array of five numbers, & prints asterisks after each number if 
the numbers are between one and twenty.*/

class PrintStars {
	
//// Start program.
	public static void main(String[] args) {
		
//		Create an array and declare for loop variable.
		int numArray[] = {1, 6, 8, 25, 88};
		int i;
		
//		This for loop will run until it's iterated the length of the array passed in.
		for (i = 0; i < numArray.length; i++) {
			
//		If the length of the passed in array is less than or greater than five, let the user know and break the loop (or error will print five times.)
			 if (numArray.length < 5 || numArray.length > 5) {
				
				System.out.println("Please enter an array with no more or less than five numbers.");
				break;
				
			} else if (numArray[i] > 20) {	
				
//				If the value of the current array index is greater than 20, send the user a message indicating this.	
				System.out.print("\n");
				System.out.println( "You entered " + numArray[i] + ". No printing more than 20 asterisks!");
				
			} else {
			
/*				
* 				Else, print the value and run a for loop that will print as many asterisks as the value of the 
*				array index being passed in.
*/
				System.out.println( "\n" + numArray[i]);
				
				for (int j = 0; j < numArray[i]; j++) {
					
					System.out.print("*");
					
				}
			}
			 
		}
	
	}	
	
}
