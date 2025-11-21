package com.problems.medium;

/**
 * Here the problems is to solve is
 * find the largest bitwise in the
 * subarray and return the length
 * the soln is biggest number does
 * not give always give biggest bitwise
 * value 4 & 4 = 4 so find the biggest value
 * and find that largest number
 * 
 * Input: nums = [1,2,3,3,2,2]
 * Output: 2
 * 
 * @author meganaathan
 */

public class LongestSubArray {

    // Create a static method
    public static int longestSubArray(int[] arr) {

        // Now we have to find the biggest value in the array
        int maxValueInArr = 0;
        int maxLengthValue = 0;

        for (int num : arr) {
            maxValueInArr = Math.max(maxValueInArr, num);
        }

        // now find the longest subarray in the array
        int currentLength = 0;
        for (int num : arr) {
            if (num == maxValueInArr) {
                currentLength++;
                maxLengthValue = Math.max(currentLength, maxLengthValue);
            } else {
                currentLength = 0;
            }
        }
        return maxLengthValue;

    }

    public static void main(String[] args) {

        // Create a new array
        int[] nums = { 1, 2, 3, 3, 2, 2 };
        System.out.println(longestSubArray(nums));
    }

}
