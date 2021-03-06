package com.psamp.lab4pt1;
import com.psamp.lab3pt3.Event;
import com.psamp.lab3pt4.Calculator;

class IdentityTest {

	public static void main(String[] args) {
		
//		Create new instances of event, and a reference variable.
		Event evnOne = new Event();
		Event evnTwo = new Event();
		Event evnThree = evnTwo;
		Calculator calc = null;
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		
//		Check if evnOne and evnTwo are equal.
		if(evnOne == evnTwo) {
			System.out.println("evnOne and evenTwo are equal!");
		} else {
			System.out.println("evnOne and evnTwo are not equal.");
		}
		
//		Check if evnThree and evnTwo are equal.
		if(evnThree == evnTwo) {
			System.out.println("evnThree and evnTwo are equal!");
		} else {
			System.out.println("evnThree and evnTwo are not equal.");
		}
		
//		Check if calc is null.
		if(calc == null) {
			System.out.println("Calc is null.");
		}
		
//		Check if s2s 1 and two are equal to each other.
		if (s1 == s2) {
			System.out.println("s1 and s2 are equal.");
		} else {
			System.out.println("s1 and s2 are not equal");
		}
		
//		Check if s2 and s3 are the same.
		if (s2 == s3) {
			System.out.println("s2 and s3 are equal.");
		} else {
			System.out.println("s2 and s3 are not equal.");
		}
		
//		Check if s3 is the same as s1 and s2.
		if (s3 == s2 | s3 == s1) {
			System.out.println("s1 and s2 are the same as s3.");
		} else {
			System.out.println("s1 and s2 are different from s3.");
		}
		
//		Use equals method.
		System.out.println(s1.equals(s3));
		
	}
}
