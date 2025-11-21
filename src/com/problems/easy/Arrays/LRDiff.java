package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * This problems is find the left and right sum diff in the array
 *
 * Input: nums = [10,4,8,3] Output: [15,1,11,22] Explanation: The array leftSum
 * is [0,10,14,22] and the array rightSum is [15,11,3,0]. The array answer is
 * [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].
 */
public class LRDiff {

    // create a new method
    public static int[] leftRightDifference(int[] nums) {

        // int[] leftSum = new int[nums.length];
        // leftSum[0] = 0; // initally we set the left arr
        // int[] rightsum = new int[nums.length];
        // rightsum[nums.length - 1] = 0;
        // // Create a new array for ans
        // int[] ans = new int[nums.length];
        // if (nums.length == 0) {
        //     return new int[0];
        // }
        // for (int i = 0; i < nums.length - 1; i++) {
        //     leftSum[i + 1] = leftSum[i] + nums[i]; //  [10, 4, 8, 3]
        // }
        // // another loop for right sum
        // for (int i = nums.length - 1; i > 0; i--) {
        //     rightsum[i - 1] = rightsum[i] + nums[i]; // [0,0,8,0]
        // }
        // // This loop for merge the both array
        // for (int i = 0; i < nums.length; i++) {
        //     ans[i] = Math.abs(leftSum[i] - rightsum[i]);
        // }
        // return ans;


        /**
         * Below the code is effiecent soluton
         */
        int n = nums.length;

        // Create an answer array
        int[] ans = new int[n];

        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            ans[i] = leftSum;  
            leftSum += nums[i];
        }

        int rightSum = 0;
        for (int i = n - 1; i >= 0; i--) { // n- i = 3
            ans[i] = Math.abs(ans[i] - rightSum); 
            rightSum += nums[i]; 
        }
        return ans;

    }

    public static void main(String[] args) {
        // create a new arr
        int[] arr = {10, 4, 8, 3};
        System.out.println(Arrays.toString(leftRightDifference(arr)));

    }

}
