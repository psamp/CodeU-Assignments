package com.calculator;

class UseEvents {

	public static void main(String[] args) {
		Event.doNothing();
		Event.takeParam(5);
		String add = Event.addTheseTwo(5, 10);
		
		System.out.println(add);

	}

}
