package com.codeu.event.report;

import com.codeu.event.rental.Rentable;

public class Report {
	private static final String REPORT_FOOTER = "\u00A9 Event Management Group 2013";
	
	public String displayInventory(Rentable[] rental) {
		
		StringBuilder sb = new StringBuilder();
		
		long startTime = System.currentTimeMillis();
		
		for (int i = 0; i < rental.length; i++) {
			sb.append(rental[i].toString());
		}
		
		long endTime = System.currentTimeMillis();
				
		System.out.println(sb);
		System.out.println("Execution time: " + (endTime - startTime));
		this.printFooter();
		
		return sb.toString();
	}
	
	private void printFooter() {
		System.out.println(Report.REPORT_FOOTER + "\n");
	}

}
