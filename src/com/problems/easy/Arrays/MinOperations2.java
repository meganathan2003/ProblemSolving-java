package com.problems.easy.Arrays;

/**
 * Below the problems are we need to
 * strict increase the array
 *
 * @author meganathan
 *         Input: nums = [1,1,1]
 *         Output: 3
 */
public class MinOperations2 {

    // create a seperate method
    public static int minOperation(int[] nums) {

        // Here the logic will be there
        if (nums.length == 0) {
            return 0;
        }
        // int count = 0;
        int minOps = 0;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int cur = nums[i]; // 5
            if (cur <= prev) { // 5 <= 1
                minOps += (prev - cur + 1);
                prev = prev + 1;
            } else {
                prev = cur;
            }
        }
        return minOps;
    }
    // System.out.println(Arrays.toString(nums));

    public static void main(String[] args) {
        // Create a new arr of input
        int[] arr = { 1, 5, 2, 4, 1 };

        System.out.println(minOperation(arr));

    }

}
