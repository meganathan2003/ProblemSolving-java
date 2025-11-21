package com.problems.leetcode;

public class MinElementAfterReplacement {


    // Create a static method
    public static int minElement(int[] nums) {

//        Validation
        if (nums.length == 0) {
            return 0;
        }

        int minimumValue = Integer.MAX_VALUE;
        for (int num : nums) {

            int digitSum = 0;

            while (num > 0) {

                // Use the modulo and divide
                digitSum += num % 10;
                num /= 10; // remove the last element and return all

            }
            minimumValue = Math.min(digitSum, minimumValue);

        }

        return minimumValue;
    }

    public static void main(String[] args) {

        int[] nums = {10, 12, 13, 14};

        System.out.println(minElement(nums));

    }
}
