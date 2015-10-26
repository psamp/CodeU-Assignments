package com.psamp.methodoverriding;

class Triangle extends Figure {
	
	Triangle(double a, double b) {
		super(a, b);
	}
	
	double area() {
		System.out.println("Inside area for triangle.");
		return dim1 * dim2 / 2;
	}

}
