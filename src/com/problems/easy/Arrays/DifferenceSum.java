package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Below the code for find the difference in sum of the array and return the
 * array absolute
 * 
 * Input: nums = [1,15,6,3] Output: 9
 */
public class DifferenceSum {

	public int differenceOfSum(int[] nums) {
		int elementDigit = 0;
		int sumDigit = 0;
		for (int i = 0; i < nums.length; i++) {
			elementDigit += nums[i];
		}
//		System.out.println(elementDigit);

		// Convert int[] to char[]
		char[] chars = Arrays.toString(nums).replaceAll("[^0-9]", "").toCharArray();
		System.out.println(chars);
		for (int i = 0; i < chars.length; i++) {
			if(Character.isDigit(chars[i])) {
				sumDigit += Character.getNumericValue(chars[i]); // convert char to numeric values 
			}
		}
		return elementDigit - sumDigit;

	}

	public static void main(String[] args) {
		int[] nums = { 1, 15, 6, 3 };
		DifferenceSum differenceSum = new DifferenceSum();
		System.out.println(differenceSum.differenceOfSum(nums));

	}

}
