package com.psamp.average;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AverageTests {
	
	Average avg;
	
	@Before
	public void beforeTests() {
		avg = new Average();
	}
	
	@Test
	public void testParseArray() {
		String[] arr = {"3", "6", "9"};
		
		double[] expecteds = {3, 6, 9};
		double[] actuals = avg.parseArray(arr);
		double delta = .001;
		
		assertArrayEquals(expecteds, actuals, delta);
		
	}

	@Test
	public void testAverageScoresWithWholeNumbers() {
		String[] arr = { "98", "84", "59", "87", "71"};
		
		double expected = 79.8;
		double actual = avg.averageScores(arr);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testAverageScoresWithDecimals() {
		String[] arr = { "99.4", "88.3", "66.8", "87.5"};
		
		double expected = 85.5;
		double actual = avg.averageScores(arr);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testAverageScoresWithNegatives() {
		String[] arr = { "99.4", "88.3", "66.8", "-87.5"};
		
		double expected = 41.75;
		double actual = avg.averageScores(arr);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testGetSmallestScore() {
		String[] arr = { "99.4", "88.3", "66.8", "87.5"};
		
		double expected = 66.8;
		double actual = avg.lowestScore(arr);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testGetSmallestScoreWithNegatives() {
		String[] arr = { "99.4", "88.3", "66.8", "-87.5"};
		
		double expected = -87.5;
		double actual = avg.lowestScore(arr);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}
	
	@Test
	public void testGetHighestScore() {
		String[] arr = { "99.4", "88.3", "66.8", "87.5"};
		
		double expected = 99.4;
		double actual = avg.highestScore(arr);
		double delta = .001;
		
		assertEquals(expected, actual, delta);
	}

}
