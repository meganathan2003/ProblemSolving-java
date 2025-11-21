package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Here the sum find the minelement and maxelement in the arr and divide by 2
 * and return the mini ele arr
 *
 * Input: nums = [7,8,3,4,15,13,4,1] Output: 5.5
 */
public class FindMinimumAvg {

    public static double minimumAverage(int[] nums) {

        if (nums.length % 2 != 0) {
            throw new IllegalArgumentException("Given Arra must be the Even number");
        }

        // here we sort the array and use two pointer
        Arrays.sort(nums);

        int left = 0; // index start from 0
        int right = nums.length - 1;
        double minValue = Double.MAX_VALUE;
        double avg;

        while (left < right) {
            // averages.add((nums[left] + nums[right]) / 2.0);
            avg = ((double) nums[left] + nums[right]) / 2.0;
            if (avg < minValue) {
                minValue = avg;
            }
            left++;
            right--;
        }

        return minValue;
    }

    public static void main(String[] args) {
        int[] nums = {7, 8, 3, 4, 15, 13, 4, 1};
        System.out.println(minimumAverage(nums));
    }
}
