package com.problems.easy.Arrays;

/**
 * Below the problems are find the count of pairs are there in array and return
 * the count
 * 
 * @author meganathan
 * 
 *         Input: nums = [1,2,2,1], k = 1 Output: 4
 */

public class CountKDifference {

	// Below the code separate method
	public int countKDifference(int[] nums, int k) {
		if (nums.length != 0 && k > 0) {
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				for (int j = 0; j < nums.length; j++) {
					if (nums[i] - nums[j] == k) {
						count++;
					}
				}
			}
			return count;
		}
		return 0;
	}

	public static void main(String[] args) {
		// call the method
		CountKDifference countKDifference = new CountKDifference();
		int[] nums = { 1, 2, 2, 1 };
		int k = 1;
		System.out.println(countKDifference.countKDifference(nums, k));
	}

}
