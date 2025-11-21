package com.problems.medium;

import java.util.Arrays;

/**
 * Here the problems is
 * Given a list of non-negative integers nums,
 * arrange them such that they form
 * the largest number and return it.
 * <p>
 * Since the result may be very large, so you
 * need to return a string instead of
 * an integer.
 * <p>
 * Input: nums = [10,2]
 * Output: "210"
 */
public class LargestNumber {

    // Create a static method
    private static String largestNumber(int[] nums) {
        if (nums.length == 0) {
            return "";
        }
        String[] strNums = new String[nums.length];

        // Nums are we are converting the string
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        // now we have to sort the array lexicographically
        Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));

        if (strNums[0].equals("0")) {
            return "0";
        }
        String result = "";

        for (String str : strNums) {
            result += str;
        }

        return result;
    }

    public static void main(String[] args) {
        // create a string
        int[] nums = {0, 1};
        System.out.println(largestNumber(nums));
    }

}
