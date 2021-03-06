package com.psamp.collections;

import java.util.*;

class HashMapDemo {
	public static void main(String args[]) {
		
		// Create a hash map.
		HashMap<String, String> hs  = new HashMap<String, String>();
		
		// Put elements to the map
		hs.put("Hello", "Goodbye");
		hs.put("Thank you", "You're welcome");
		hs.put("What time is it?", "Hammer time");
		
		// Get a set of the entries.
		Set<Map.Entry<String, String>> set = hs.entrySet();
		
		// Display the set.
		
		for (Map.Entry<String, String> entry : set) {
			System.out.println(entry.getKey() + " / " + entry.getValue());
		}
		
	}
}
