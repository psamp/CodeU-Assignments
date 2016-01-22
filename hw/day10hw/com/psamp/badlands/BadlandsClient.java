package com.psamp.badlands;

public class BadlandsClient {

	public static void main(String[] args) {
		
		BadlandsSong colors = new BadlandsSong("colors", 4.09);
		
		colors.printInfo();
		
		colors.getArtist();
		
		colors.playSong();
		colors.playSong();
		
		colors.likeSong();
		colors.likeSong();

	}

}
