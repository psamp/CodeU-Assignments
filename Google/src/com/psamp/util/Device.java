package com.psamp.util;

public class Device {
	
	public void browser(String search) {
		
		System.out.println("In device!");
		
		SearchEngine s = new SearchEngine();
		s.google(search);
		
	}

}
