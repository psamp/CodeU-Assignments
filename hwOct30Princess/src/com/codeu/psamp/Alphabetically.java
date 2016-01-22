package com.codeu.psamp;

import java.util.Comparator;

class Alphabetically implements Comparator<String> {
	@Override
	public int compare(String one, String two) {
		
//		int compVal = -99;
//		
//		if(one.substring(0, 1) == two.substring(0,1) ) {
//		
//			return 0;
//			
//		} else if(a < b) {
//			return -1;
//		} else {
//			return 1
//		}
		
		return one.compareTo(two);
	}
	
	

}
