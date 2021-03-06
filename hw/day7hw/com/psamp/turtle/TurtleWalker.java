package com.psamp.turtle;

public class TurtleWalker {

	public static void main(String[] args) {
		Turtle cassandra = new Turtle();
		
//		Call ageUp.
		cassandra.ageUp(5);
		System.out.println("Turtle Cassandra is " + cassandra.age + ".");
		cassandra.ageUp(7);
		System.out.println("Turtle Cassandra is now " + cassandra.age + ".");
		
//		Call eatLeaves.
		cassandra.eatLeaves(8);
		
//		Call walkAround.
		System.out.println("Took " + cassandra.walkAround(4.5) + " steps.");
		
//		Call snapSnap.
		System.out.println(cassandra.snapSnap());
		
//		Call wagTail.
		cassandra.wagTail();
	}

}
