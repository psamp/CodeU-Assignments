package com.psamp.lab4pt1;
import com.psamp.lab3pt3.Event;

class IdentityTest {

	public static void main(String[] args) {
		Event evnOne = new Event();
		Event evnTwo = new Event();
		Event evnThree = evnTwo;
		
//		Check if evnOne and evnTwo are equal.
		if(evnOne == evnTwo) {
			System.out.println("evnOne and evenTwo are equal!");
		} else {
			System.out.println("evnOne and evnTwo are not equal.");
		}
		
		if(evnThree == evnTwo) {
			System.out.println("evnOne and evnTwo are equal!");
		} else {
			System.out.println("evnOne and evnTwo are not equal.");
		}
	}
}
