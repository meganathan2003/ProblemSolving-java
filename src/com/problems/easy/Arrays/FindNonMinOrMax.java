package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Here is problems is to solve the
 * Given an integer array nums containing
 * distinct positive integers, find and return
 * any number from the array that is neither the
 * minimum nor the maximum value in the array,
 * or -1 if there is no such number.
 * 
 * Return the selected integer.
 *
 * Input: nums = [3,2,1,4]
 * Output: 2
 */
public class FindNonMinOrMax {

    // here the sepereate static method
    public static int findNonMinOrMax(int[] nums) {

        if (nums.length <= 2) {
            return -1;
        }

        // find the minimium number
        Arrays.sort(nums);

        return nums[1];

    }

    public static void main(String[] args) {
        // create a new array
        int[] arr = { 2, 1, 3 };
        System.out.println(findNonMinOrMax(arr));
    }

}
