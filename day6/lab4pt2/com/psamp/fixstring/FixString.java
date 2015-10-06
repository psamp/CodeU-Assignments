package com.psamp.fixstring;

public class FixString {

	public static void main(String[] args) {
		String a = "Jovo is      ";
		String b = "  a great langu";

		// Fix b.
		String completeLanguage = b.toUpperCase().replace("  ", " ") + "age".toUpperCase() + "!";
		
		// Fix a.
		String oToA = a.replace("o", "a").replace("      ", "").toUpperCase();
		
		System.out.println(oToA + completeLanguage);
	}

}
