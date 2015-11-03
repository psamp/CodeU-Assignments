package com.codeu.psamp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HappyPlace {
	
	public static void main(String[] args) throws HappyPlaceNotFoundException {
		HappyPlace yas = new HappyPlace();
		
		List<String> why = new ArrayList<String>();
		
		why.add("bucky barnes, my son");
		why.add("korra, my daughter");
		why.add("ahsoka, my daughter");
		
		if(why.contains("korra, my daughter")) {
			System.out.println("'\'o'/'");
		} else {
			throw new HappyPlaceNotFoundException("*cries*");
		}
		
	}

}
