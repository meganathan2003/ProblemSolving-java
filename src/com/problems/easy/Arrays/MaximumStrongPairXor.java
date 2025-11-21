package com.problems.easy.Arrays;

/**
 * Here is the problem to find that
 * You are given a 0-indexed integer array nums. A pair of integers x and y is
 * called a strong pair if it satisfies the condition:
 * 
 * |x - y| <= min(x, y)
 * You need to select two integers from nums such that they form a strong pair
 * and their bitwise XOR is the maximum among all strong pairs in the array.
 * 
 * Return the maximum XOR value out of all possible strong pairs in the array
 * nums.
 * 
 * Note that you can pick the same integer twice to form a pair.
 * 
 * Input: nums = [1,2,3,4,5]
 * Output: 7
 * 
 */
public class MaximumStrongPairXor {

    // Create a sepreate static method
    public static int maximumStrongPairXor(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int maxXorValue = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= Math.min(nums[i], nums[j])) {

                    // find xor value
                    int xor = nums[i] ^ nums[j];
                    if (xor > maxXorValue) {
                        maxXorValue = xor;
                    }
                }
            }
        }
        return maxXorValue;

    }

    public static void main(String[] args) {

        // Create a new array
        int[] nums = { 10, 100 };
        System.out.println(maximumStrongPairXor(nums));
    }

}
