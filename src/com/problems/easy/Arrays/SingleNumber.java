package com.problems.easy.Arrays;

/**
 * Find the non repeat element in the array
 *
 * Input: nums = [2,2,1] Output: 1
 */
public class SingleNumber {

    // Create a new method
    public static int getSingleNumber(int[] nums) {

        // check the validation
        if (nums.length == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            result ^= nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        System.out.println(getSingleNumber(arr));
    }

}
