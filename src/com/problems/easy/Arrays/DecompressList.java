package com.problems.easy.Arrays;
import java.util.Arrays;

/**
 * Below the code for decompresss the
 * array and return the array
 *
 * @author meganathan
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [2,4,4,4]
 */

public class DecompressList {

    public int[] decompressRLElist(int[] nums) {
        // arr empty check
        if (nums.length != 0) {
            int totalLen = 0;

            // Below the loop for getting the total leng
            for (int i = 0; i < nums.length; i += 2) {
                totalLen += nums[i];
            }

            int[] res = new int[totalLen];
            int index = 0; // for tracking the loop

            for (int i = 0; i < nums.length; i += 2) {
                int freq = nums[i];
                int value = nums[i + 1];
                for (int j = 0; j < freq; j++) {
                    res[index++] = value;
                }
            }
            return res;
        }
        return null;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};
        // call the method
        DecompressList decompressList = new DecompressList();
        System.out.println(Arrays.toString(decompressList.decompressRLElist(arr)));
    }
}
