package com.psamp.fixstring;

public class FixString {

	public static void main(String[] args) {
		String a = "Jovo is      ";
		String b = "  a great langu";
		
		// Fix a.
		String replaceVowels = a.replace("o", "a").trim().toUpperCase();

		// Fix b.
		String completeLanguage = b.toUpperCase().replace("  ", " ") + "age".toUpperCase() + "!";
		
		System.out.println(replaceVowels + completeLanguage);
	}

}
