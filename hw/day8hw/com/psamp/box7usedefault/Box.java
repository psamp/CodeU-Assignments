package com.psamp.box7usedefault;

class Box {
	  double width;
	  double height;
	  double depth;
	  
	  //Return volume.
	  void volume(String name) {
	    double vol = this.width * this.height * this.depth;
	    System.out.println("The volume of " + name + " is " + vol + ".");
	  }
	}