package com.psamp.morepractical;

class Box {
	double width;
	double height;
	double depth;
	
	Box(Box obj) {
		this.width = obj.width;
		this.height = obj.height;
		this.depth = obj.depth;
	}	
	
	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	Box() {
		this.width = -1;
		this.height = -1;
		this.depth = -1;
	}
	
	Box(double len) {
		this.width = this.height = this.depth = len;
	}
	
	double volume() {
		return width * height * depth;
	}
	

}
