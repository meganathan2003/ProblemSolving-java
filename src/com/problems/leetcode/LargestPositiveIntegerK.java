package com.problems.leetcode;

import java.util.HashSet;

public class LargestPositiveIntegerK {

    // Create a static method
    public static int findMaxK(int[] nums) {

//        valiation
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        int maxK = -1;

        // Add all numbers to the HashSet
        for (int num : nums) {
            set.add(num);
        }

        // Check for the largest k
        for (int num : nums) {
            if (set.contains(-num)) {
                maxK = Math.max(maxK, Math.abs(num));
            }
        }

        return maxK;

    }

    public static void main(String[] args) {

    }
}
