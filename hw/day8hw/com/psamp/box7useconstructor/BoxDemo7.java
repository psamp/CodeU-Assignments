package com.psamp.box7useconstructor;

class BoxDemo7 {

	public static void main(String[] args) {
		
		Box myBox1 = new Box(3, 6, 9);
		Box myBox2 = new Box(2, 4, 6);
		
		myBox1.volume("mybox1");
		myBox2.volume("mybox2");

	}

}
