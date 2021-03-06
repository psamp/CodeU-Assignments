package com.psamp.day4;
import java.util.Arrays;

//This program should take an array, sort it alphabetically, and print its entirety to the console.

class AdmireArray {

	public static void main(String[] args) {
		//Create array.
		String admireArray[] = {
				"Rodney Sampson I", "Shanterria Sampson", "Bucky Barnes", "Avatar Korra", "Ahsoka Tano"
				};

		//Sort the array.
		Arrays.sort(admireArray);
		
		//Loop over this array, printing until there's nothing left.
		for(int x=0; x<admireArray.length; x++) {
			System.out.println("I admire " + admireArray[x]);	
		}

	}

}