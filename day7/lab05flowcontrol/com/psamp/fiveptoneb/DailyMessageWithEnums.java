package com.psamp.fiveptoneb;
import java.util.Scanner;

public class DailyMessageWithEnums {
	
	public void getMessage(Scanner day) {
		System.out.println("Enter day of week:" + "\n");
		
//		Save input.
		DaysOfWeek input = DaysOfWeek.valueOf(day.next().toUpperCase());
		
//		Sysouts.
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
				System.out.println("Invalid, multi-day, or misspelled day.");
				break;
			}
			
		} finally {
			
			day.close();
		}
	
	}
}
