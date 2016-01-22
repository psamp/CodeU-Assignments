package com.psamp.memberaccess;

class Client {

	public static void main(String[] args) {
		B subclass = new B();
		
		subclass.setIJ(10, 12);
		subclass.sum();
		
		System.out.println("Total is: " + subclass.total);

	}

}
