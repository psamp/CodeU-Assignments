package com.psamp.methodoverriding;

class Client {

	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		
		Figure figuref;
		
		figuref = r;
		
		System.out.println("Area is " + figuref.area());
		System.out.println();
		
		figuref = t;
		
		System.out.println("Area is " + figuref.area());

	}

}
