package com.codeu.psamp;

class Arguments {

	public static void main(String[] args) {
		
		System.out.println("There are " + args.length + " arguments.");
		System.out.println("The first argument is " + args[0] + "."  );
		
//		This throws errors because I'm not entering a hundred args.
		if (args.length == 100) {
			System.out.println("The hundredth argument is " + args[99] + "."  );
		}

	}

}
