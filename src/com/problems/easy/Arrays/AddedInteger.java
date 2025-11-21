package com.problems.easy.Arrays;

/**
 * Below the code for find the As a result,
 * nums1 becomes equal to nums2.
 * Two arrays are considered equal when they
 * contain the same integers with the same frequencies.
 *
 * @author meganthan
 * Input: nums1 = [2,6,4], nums2 = [9,7,5]
 * <p>
 * Output: 3
 */
public class AddedInteger {

    // TODO: This sum need to understand the question
    public int addedInteger(int[] nums1, int[] nums2) {
        int sum1 = 0, sum2 = 0;
        for (int num : nums1) {
            sum1 += num;
        }
        for (int num : nums2) {
            sum2 += num;
        }
        int diff = sum2 - sum1;
        return diff / nums1.length;
    }

    public static void main(String[] args) {
        // create a new array
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 3, 4};

        // Create a obj
        AddedInteger addedInteger = new AddedInteger();
        System.out.println(addedInteger.addedInteger(nums1, nums2));
    }

}
