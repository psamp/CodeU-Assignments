package com.psamp.util;

import java.util.Scanner;

class Suri {
	
	private String usersName;
	private int usersAge;
	
	void startSuri() {
		
		Scanner scn = new Scanner(System.in);
		
		try {
			
			System.out.println("What is your name?" + "\n");
			this.getName( scn.next() );
			this.welcome();
			
			System.out.println("What is your age?");
			this.getAge( scn.nextInt() );
			System.out.println();
			this.isUnderEighteen();
			
		} finally {
			
			scn.close();
		
		}
		
	}
	
//	Get user's name, save it to the object and then return it.
	
	String getName(String input) {
		
		this.usersName = input;
		return this.usersName;
		
	}
	
//	Get user's age, save it to the object and then return it.
	int getAge(int input) {
		
		this.usersAge = input;
		return this.usersAge;
		
	}
	
//	Print out a welcome message with the user's name, and return it.
	String welcome() {
		
		String welcome = "Hello, " + usersName + ".";
		
		System.out.println(welcome);
		
		return welcome;
		
	}
	
//	Check if user is under 18.
	boolean isUnderEighteen() {
		
		boolean underEighteen = false;
		
		if(this.usersAge < 18) {
			
			underEighteen = true;
			
		} else {
			
			underEighteen = false;
		
		}
		
		System.out.println("Under 18: " + underEighteen);
		
		return underEighteen;
		
	}

}
