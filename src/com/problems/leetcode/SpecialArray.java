package com.problems.leetcode;

public class SpecialArray {

    // Create a static method
    public static boolean isArraySpecial(int[] nums) {

        if (nums.length == 0) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {

        int[] nums = {2, 1, 4};
        System.out.println(isArraySpecial(nums));

    }
}
