package com.psamp.day4;

//Create Box class. Add methods that set the dimensions, and compute and print the volume.
 public class Box {
	 double height;
	 double width;
	 double depth;
	 
	 double volume(String boxName) {
		 double vol;
		 vol = width * height * depth;
		 System.out.println("The volume of " + boxName + " is " + vol);
		 return 0;
	 }

 
	 void setDim(double w, double h, double d) {
		 width = w;
		 height = h;
		 depth = d;
	 }
 }