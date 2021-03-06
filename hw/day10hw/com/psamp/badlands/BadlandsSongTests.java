package com.psamp.badlands;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BadlandsSongTests {
	
	BadlandsSong song;
	
	@Before public void beforeTests() {
		song = new BadlandsSong("roman_holiday", 3.22);
	}

	@Test
	public void testPrintInfo() {
		String expected = "ROMAN_HOLIDAY is 3.22 minutes.";
		String actual = song.printInfo();
		
		assertEquals(expected, actual);
	}

	@Test
	public void testGetArtist() {
		String expected = "HALSEY";
		String actual = song.getArtist();
		
		assertEquals(expected, actual);
	}

	@Test
	public void testPlaySong() {
		int expected = 1;
		int actual = song.playSong();
		
		assertEquals(expected, actual);
	}

	@Test
	public void testLikeSong() {
		String expected = "*";
		String actual = song.likeSong();
		
		assertEquals(expected, actual);
	}

}
