package com.codeu.psamp;

public class Song {
	
	private String title;
	private double duration;
	private String artist;
	
	
	public Song(String title, double duration, String artist) {
		this.setTitle(title);
		this.setDuration(duration);
		this.setArtist(artist);
	}
	
	@Override
	public String toString() {
		String mssg = this.getTitle() + " by " + this.getArtist() + " (" + this.getDuration() + ")" + "\n";
		return mssg;
	}
	
//	@Override
//	public int compareTo(Song o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
	
	public String getTitle() {
		return title;
	}
	public double getDuration() {
		return duration;
	}
	public String getArtist() {
		return artist;
	}
	private void setTitle(String title) {
		this.title = title;
	}
	private void setDuration(double duration) {
		this.duration = duration;
	}
	private void setArtist(String artist) {
		this.artist = artist;
	}

}
