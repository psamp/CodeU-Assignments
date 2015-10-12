package com.psamp.util;

public class Suri {
	
	String usersName = "";
	int usersAge = 0;
	
//	Get user's name, save it to the object and then return it.
	
	public String getName(String input) {
		
		this.usersName = input;
		return this.usersName;
		
	}
	
//	Get user's age, save it to the object and then return it.
	public int getAge(int input) {
		
		this.usersAge = input;
		return this.usersAge;
		
	}
	
//	Print out a welcome message with the user's name, and return it.
	public String welcome() {
		
		String welcome = "Hello, " + usersName + ".";
		
		System.out.println(welcome);
		
		return welcome;
		
	}
	
//	Check if user is under 18.
	public boolean isUnderEighteen() {
		
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
