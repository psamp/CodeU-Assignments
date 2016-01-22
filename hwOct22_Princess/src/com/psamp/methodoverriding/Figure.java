package com.psamp.methodoverriding;

class Figure {
	
	double dim1;
	double dim2;
	
	Figure(double a, double b) {
		this.dim1 = a;
		this.dim2 = b;
	}
	
	double area() {
		System.out.println("Area for figure is undefined.");
		return 0;
	}

}
