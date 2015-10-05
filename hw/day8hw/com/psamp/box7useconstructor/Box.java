package com.psamp.box7useconstructor;

public class Box {
	
	double height;
	double width;
	double depth;
	
	Box(double w, double h, double d) {
		System.out.println("Constructing box...");
		this.width = w;
		this.height = h;
		this.depth = d;
	}
	
	double volume(String boxName) {
		 double vol;
		 vol = this.width * this.height * this.depth;
		 System.out.println("The volume of " + boxName + " is " + vol + ".");
		 return 0;
	 }
}