package com.problems.leetcode;

public class FindNumber {

    public static int findNumbers(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int currentDigit = String.valueOf(nums[i]).length();

            if (currentDigit % 2 == 0) {
                count++;
            }

        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
