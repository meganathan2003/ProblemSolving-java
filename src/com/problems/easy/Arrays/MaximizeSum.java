package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Below the code for maximize the sum and
 * you are given the K and nums array
 * and return the maximum number you add
 *
 * @author meganathan
 * Input: nums = [1,2,3,4,5], k = 3
 * Output: 18
 */
public class MaximizeSum {

    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int score = nums[nums.length - 1]; // 11
        for (int i = 1; i < k; i++) {
            int lastEle = nums.length - 1; // 5
            score += nums[lastEle] + 1; // score = 5
            nums[lastEle] = nums[lastEle] + 1;
        }

        /*--------------------------------*/
        // another solution is
        int max = Integer.MIN_VALUE;
        int ans = 0;
        int n = nums.length;

        // loops for find the max value in array
        for (int i = 0; i < n; i++) {
            max = Math.max(max, nums[i]);
        }

        while (k > 0) {
            ans += max; // initally set the max number in answer
            max = max + 1;
            k--;
        }
        return score;

    }

    public static void main(String[] args) {

        // create a new array
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;

        // Create a new obj
        MaximizeSum sum = new MaximizeSum();
        System.out.println(sum.maximizeSum(nums, k));
    }

}
