package com.psamp.badlands;

public class BadlandsSong {
	BadlandsTracklist title;
	double duration;
	Halsey artist = Halsey.HALSEY;
	int played = 0;
	String liked = "";
	
//	Constructor that takes in a string and a double, and sets class variables based on their values.
	BadlandsSong(String name, double length) {
		this.title = BadlandsTracklist.valueOf(name.toUpperCase().trim());
		
		this.duration = length;
	}
	
//	Return object title and duration.
	public String printInfo() {
		System.out.println(this.title + " is "  + this.duration + " minutes.");
		
		return this.title + " is "  + this.duration + " minutes.";
	}
	
//	Get object's artist value, print a message, and return it as a string.
	public String getArtist() {
		System.out.println("The artist of this song is " + this.artist.toString() + ".");
		
		return this.artist.toString();
	} 
	
//	Increment object's played variable by one, return it, and print a message.
	public int playSong() {
		this.played += 1;
		
		System.out.println("Played " + this.title + " " + this.played + " time(s).");
		
		return this.played;
	} 
	
//	Increment object's likes variable by one, return it, and print a message.
	public String likeSong() {
		this.liked += "*";
		
		System.out.println("Liked " + this.title + " " + this.liked.length() + " time(s): " + this.liked);
		
		return this.liked;
	} 
	
}
