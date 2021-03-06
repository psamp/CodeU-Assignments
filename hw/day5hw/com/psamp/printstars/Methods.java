package com.psamp.printstars;
//import java.util.Scanner;

public class Methods {
	
/*	
*	Take in an integer. Create an empty string. Loop until j is less than or equal to the argument. 
*	Every loop, add a asterisk to the value of str. Return str.
*/

	String printStars(int i) {
		String str = "";
		for (int j = 0; j < i; j++) {
			str += "*";
		}
		return str;
	}
	
/*	
 * 	Take in five integers. Create an array out of them. 
 * 	Start a loop that adds one to j until it's less than or equal to the length of our array.
 */
	void numberOfStars(int a, int b, int c, int d, int e) {
		int[] nums = {a, b, c, d, e};
		
		for(int i = 0; i < nums.length; i++) {
					
				if (nums[i] > 20) {	
					
//					If the value of the current array index is greater than 20, send the user a message indicating this.	
					System.out.print("\n");
					System.out.println( "You entered " + nums[i] + ". No printing more than 20 asterisks!");
					
				} else {
					
/*					
 * 					Else, print out a new line, the value of the current array index, and call printStars and pass in the value
 * 					index of the current array.
*/
					System.out.println("\n" + nums[i] + "\n" + printStars(nums[i]));
						
					}
				}
			
		}
		
	}
