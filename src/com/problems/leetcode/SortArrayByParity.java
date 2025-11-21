package com.problems.leetcode;

import java.util.Arrays;

public class SortArrayByParity {

    public static int[] sortArrayByParity(int[] nums) {

        if (nums.length == 0) {
            return new int[0];
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] % 2 == 1 && nums[right] % 2 == 0) {

                // swap logic
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            } else if (nums[left] % 2 == 0) {
                left++;
            } else if (nums[right] % 2 == 1) {
                right--;
            }
        }

        return nums;

    }

    public static void main(String[] args) {

        int[] nums = {3, 1, 2, 4};
        System.out.println(Arrays.toString(sortArrayByParity(nums)));

    }
}
