package com.problems.easy.Arrays;

/**
 * Here is the problem to find that
 * Given a 0-indexed integer array
 * nums of length n and an integer k, return
 * the number of pairs (i, j) where 0 <= i < j < n,
 * such that nums[i] == nums[j] and (i * j)
 * is divisible by k.
 *
 * @author meganathan
 */
public class CountEqualAndDivisiblePairs {

    // Create a static method
    public static int countParis(int[] nums, int k) {

        int count = 0;

        // loop for check the index
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if ((i * j) % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {

        // create a new array
        int[] arr = {3, 1, 2, 2, 2, 1, 3};
        int k = 2;

        System.out.println(countParis(arr, k));
    }
}
