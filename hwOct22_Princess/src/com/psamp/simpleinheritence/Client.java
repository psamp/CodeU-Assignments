package com.psamp.simpleinheritence;

public class Client {
	
	public static void main(String[] args) {
		
		A superclass = new A();
		B subclass = new B();
		
		superclass.i = 10;
		superclass.j = 20;
		
		System.out.println("Contents of superclass: ");
		superclass.showij();
		System.out.println();
		
		
		subclass.i = 1;
		subclass.j = 2;
		subclass.k = 3;
		
		System.out.println("Contents of subclass: ");
		subclass.showij();
		subclass.showk();
		System.out.println();
		
		System.out.println("Sum of subclass: ");
		subclass.sum();
		
		
	}
}
