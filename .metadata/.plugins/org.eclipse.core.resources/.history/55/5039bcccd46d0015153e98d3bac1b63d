package com.psamp.fiveptoneb;
import java.util.Scanner;

public class DailyMessageWithEnums {
	
	public void getMessage(Scanner day) {
		System.out.println("Enter day of week:" + "\n");
		
//		Create a new DaysOfWeek input object. Assign it to the value of the Scanner parameter entered by the user, uppercased. 
		DaysOfWeek input = DaysOfWeek.valueOf(day.next().toUpperCase().trim());
		
//		Sysouts.
		String studyDay = "Study day.";
		String gymDay = "Gym day.";
		String wknd = "Weekend.";
		String err = "Invalid, multi-day, or misspelled day.";
		
/*		Try:
 * 		Check if input is one of a set of days of the week, and print out a message based on the value. 
 * 		Else, tell user they entered an invalid day.
 * 		Finally:
 * 		Close the scanner.
 */
		
		try {
			
			switch(input) {
			case MONDAY:
			case WEDNESDAY:
			case FRIDAY:
				
				System.out.println(studyDay);
				break;
			
			case TUESDAY:
			case THURSDAY:
			
				System.out.println(gymDay);
				break;
			
			case SATURDAY:
			case SUNDAY:
				
				System.out.println(wknd);
				break;
			
			default:
				System.out.println(err);
				break;
			}
			
		} finally {
			
			day.close();
		}
	
	}
}
