package com.psamp.fiveptonea;
import java.util.Scanner;

public class DailyMessage {
	
	void getMessage(Scanner day) {
		System.out.println("Enter day of week:" + "\n");
		
		String input = day.next().trim();
		String studyDay = "Study day.";
		String gymDay = "Gym day.";
		String wknd = "Weekend.";
		
/*		Try:
 * 		Ignoring case, check if day is one of a set of days of the week, and print out a message based on the value. 
 * 		Else, tell user they entered an invalid day.
 * 		Finally:
 * 		Close the scanner.
 */
		
		try {
			
			if(input.equalsIgnoreCase("monday") || input.equalsIgnoreCase("wednesday") || input.equalsIgnoreCase("friday")) {
			
				System.out.println(studyDay);
				
			} else if(input.equalsIgnoreCase("tuesday") || input.equalsIgnoreCase("thursday")) {
				
				System.out.println(gymDay);
			
			} else if(input.equalsIgnoreCase("saturday") || input.equalsIgnoreCase("sunday")) {
			
				System.out.println(wknd);
			
			} else {
			
				System.out.println("\""+ input + "\"" + " is a misspelled, multi-word or invalid day.");
			}
			
		} finally {
			
			day.close();
		}
	
	}
}
