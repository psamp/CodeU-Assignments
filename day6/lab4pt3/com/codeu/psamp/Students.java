package com.codeu.psamp;

class Students {
	
	public static void main(String[] args) {
		
//		Create short and long array.
		String[] names = new String[3];
		String[] namesShort = {"Bucky Barnes", "Avatar Korra", "Ahsoka Tano" };
		
//		Give the indexes for the long array values.
		names[0] = "Bucky Banres";
		names[1] = "Avatar Korra";
		names[2] = "Ahsoka Tano";
		
//		Print out long array.
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] +"\n");
		}
		
//		Print out shortcut.
		for (int i = 0; i < namesShort.length; i++) {
			System.out.println(names[i] + "\n");
		}
		

	}
}
