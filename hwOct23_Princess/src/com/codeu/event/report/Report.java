package com.codeu.event.report;

import com.codeu.event.rental.Rental;

public class Report {
	private static final String REPORT_FOOTER = "\u00A9 Event Management Group 2013";
	
	public String displayInventory(Rental[] rental) {
		
		String concat = "";
		
		for (int i = 0; i < rental.length; i++) {
			concat += rental[i].toString();
		}
		
		System.out.println(concat);
		this.printFooter();
		return concat;	
	}
	
	private void printFooter() {
		System.out.println(Report.REPORT_FOOTER + "\n");
	}

}
