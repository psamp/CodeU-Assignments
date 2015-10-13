package com.psamp.average;

import java.util.Arrays;

class Average {
	
//	This method should take in an array of strings, parse each number to a double, and average them. Return the average.
	
	public double[] parseArray(String[] nums) {
		
		double[] dbls;
		
		dbls  = new double[nums.length];
		
		for (int i = 0; i < dbls.length; i++) {
			
			double parsed = Double.parseDouble(nums[i]);
			dbls[i] = parsed;
		}
		
		return dbls;
	}
	
	public double averageScores(String nums[]) {
		double avg = 0;
		double[] parsed = parseArray(nums);
		
		for (int i = 0; i < parsed.length; i++) {
			avg += parsed[i] / parsed.length;
		}
		
		return avg;
	}
	
	public double lowestScore(String nums[]) {
		double largest = 0;
		
		double[] parsed = parseArray(nums);
		Arrays.sort(parsed);
		
		largest = parsed[0];
		
		return largest;
	}
	
	public double highestScore(String nums[]) {
		double highest = 0;
		
		double[] parsed = parseArray(nums);
		Arrays.sort(parsed);
		
		highest = parsed[parsed.length - 1];
		
		return highest;
	}

}