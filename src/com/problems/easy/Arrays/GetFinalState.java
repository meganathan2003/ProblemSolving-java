
package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Here the problem to Find the minimum value x in nums.
 * If there are multiple
 * occurrences of the minimum value, select the one that
 * appears first.
 * 
 */

public class GetFinalState {

    // create a static method
    public static int[] getFinalState(int[] nums, int k, int multiplier) {

        while (k > 0) {
            int indexNumber = getSmallNumber(nums);
            System.out.println(Arrays.toString(nums));

            if (indexNumber == -1) {
                break; // Exit the loop if the array is empty
            }
            nums[indexNumber] = nums[indexNumber] * multiplier;
            k--;
        }
        return nums;
    }

    private static int getSmallNumber(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        // now we have to find the small number and return it index
        int min = nums[0];
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
                index = i;
            }
        }
        return index;

    }

    public static void main(String[] args) {

        int[] nums = { 2, 1, 3, 5, 6 };
        int k = 5;
        int multiplier = 2;
        System.out.println(Arrays.toString(getFinalState(nums, k, multiplier)));
    }
}
