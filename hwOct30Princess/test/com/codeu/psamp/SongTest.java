package com.codeu.psamp;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.codeu.psamp.Song;

public class SongTest {
	
	Collection<Song> musicLibrary;
	
	Song colors;
	Song countingStars;
	Song yfb;
	Song pgr;

	@Before
	public void setUp() throws Exception {
		musicLibrary = new ArrayList<Song>();
		
		colors = new Song("Colors", 4.09, "Halsey");
		countingStars = new Song("Counting Stars", 4.18, "One Republic");
		yfb = new Song("Yellow Flicker Beat", 3.53, "Lorde");
		pgr = new Song("Pretty Girl Rock", 4.03, "Keri Hilson");
		
		musicLibrary.add(colors);
		musicLibrary.add(countingStars);
		musicLibrary.add(yfb);
		musicLibrary.add(pgr);
		
	}
	
	@Test
	public final void testNotNull() {
		
		assertNotNull(musicLibrary);
		assertEquals(4, musicLibrary.size());
		assertEquals(true, musicLibrary.contains(colors));
	}

	@Test
	public final void testToString() {
		
		for(Song song : musicLibrary) {
			System.out.println(song.toString());
		}
		
		String expected = "Yellow Flicker Beat by Lorde (3.53)" + "\n";
		String actual = yfb.toString();
		
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testComparable() {
		
		List<String> why = new ArrayList<String>();
		
		why.add("bucky barnes, my son");
		why.add("korra, my daughter");
		why.add("ahsoka, my daughter");
		
		Collections.sort(why, new Alphabetically());
		
		for (String mmmmmmkalright : why) {
			System.out.println(mmmmmmkalright);
		}
		
		System.out.println();
	}

}
