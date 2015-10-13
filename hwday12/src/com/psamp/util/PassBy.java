package com.psamp.util;

public class PassBy {
	
//	Add ten to the number that's passed in, return it.
	int addTenVal(int num) {
		num += 10;
		
		return num;
	}
	
//	Take in an object, and add ten to its class variables.
	void addTenRef(Obj ob) {
		ob.a += 10;
		ob.b += 10;
	}

}
