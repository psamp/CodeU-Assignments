package com.calculator;

class EventClient {

	public static void main(String[] args) {
//		Create new instance of event
		Event evt = new Event();
		
//		Call three of the methods on the Event class. The last one returns a string, so I have to print it out here.
		evt.doNothing();
		evt.takeParam(5);
		String add = evt.addTheseTwo(5, 10);
		
		System.out.println(add);

	}

}
