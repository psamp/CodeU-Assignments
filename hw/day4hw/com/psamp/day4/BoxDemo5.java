package com.psamp.day4;

 class BoxDemo5 {
//	 Start the program. Create new boxes, set their dimensions, and compute and print their value.
	public static void main(String[] args) {
		
		Box myBox1 = new Box();
		Box myBox2 = new Box();
		
		myBox1.setDim(10,20,15);
		myBox2.setDim(3,6,9);
		
		myBox1.volume("myBox1");
		myBox2.volume("myBox2");
		
	}

}
