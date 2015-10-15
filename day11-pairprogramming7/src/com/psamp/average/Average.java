package com.psamp.average;

import java.util.Arrays;

class Average {

	// This method should take in an array of strings and parse it into an array of doubles.

	double[] parseArray(String[] strings) {

		double[] dbls;

		dbls = new double[strings.length];

		for (int i = 0; i < dbls.length; i++) {

			double parsed = Double.parseDouble(strings[i]);
			dbls[i] = parsed;
		}

		return dbls;
	}

	double averageScores(String nums[]) {
		double avg = 0;
		double[] parsed = parseArray(nums);

		for (int i = 0; i < parsed.length; i++) {
			avg += parsed[i] / parsed.length;
		}

		return avg;
	}

	double lowestScore(String nums[]) {
		double largest = 0;

		double[] parsed = parseArray(nums);
		Arrays.sort(parsed);

		largest = parsed[0];

		return largest;
	}

	double highestScore(String nums[]) {
		double highest = 0;

		double[] parsed = parseArray(nums);
		Arrays.sort(parsed);

		highest = parsed[parsed.length - 1];

		return highest;
	}

}