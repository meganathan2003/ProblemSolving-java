package com.problems.easy.Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Below the code for find the diff in array and return the int
 *
 * Input: nums = [0,1,4,6,7,10], diff = 3 Output: 2
 */
public class ArithmeticDiff {

	// create a separate method
	public int arithmeticTriplets(int[] nums, int diff) {
		Set<Integer> numSet = new HashSet<Integer>();

		// append the all integer to set
		for (int num : nums) {
			numSet.add(num);
		}

		int count = 0;
		for (int num : nums) {
			// check the condition to find the diff
			if (numSet.contains(num + diff) && numSet.contains(num + 2 * diff)) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		int[] nums = { 0, 1, 4, 6, 7, 10 };
		int diff = 3;
		ArithmeticDiff arithmeticDiff = new ArithmeticDiff();
		System.out.println(arithmeticDiff.arithmeticTriplets(nums, diff));
	}

}
