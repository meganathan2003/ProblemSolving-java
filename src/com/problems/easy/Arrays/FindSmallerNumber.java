package com.problems.easy.Arrays;
import java.util.Arrays;

/**
 * @author meganthan
 * <p>
 * Below the code for find the smallest
 * number from the current number
 */
public class FindSmallerNumber {

    // Below the code separate method for find the solution and best practice
    public int[] smallerNumbersThanCurrent(int[] nums) {
        if (nums.length != 0 && nums != null) {
            int[] arr = new int[nums.length];
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] > nums[j] && nums[j] != nums[i]) { // 8 > 1
                        count++;
                    }
                }
                arr[i] = count;
                count = 0;
            }
            return arr;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {

        int[] values = {8, 1, 2, 2, 3};
        // call the method
        FindSmallerNumber findSmallerNumber = new FindSmallerNumber();
        int[] res = findSmallerNumber.smallerNumbersThanCurrent(values);
        System.out.println(Arrays.toString(res));
    }
}
