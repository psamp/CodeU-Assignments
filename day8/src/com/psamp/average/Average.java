package com.psamp.average;

class Average {

	public static void main(String[] args) {
		
//		Array of test scores.
		String nums[] = {"98", "84", "59", "87", "71"};
		
//		Empty double.
		double avg = 0;
		
//		Loop over nums, and set avg to each number parsed to a double, added to its previous value, and divide it by the length of nums.
		for (int i = 0; i < nums.length; i++) {
			avg +=  Double.parseDouble(nums[i]) / nums.length;
		}
		
//		Print averages.
		System.out.println("The class average is: " + avg);
	}

}