package com.problems.easy.Arrays;
import java.util.Arrays;

/**
 * @author meganathan
 * <p>
 * Below the code for find the sum of the
 * array and return it as array
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: [1,3,6,10]
 */

public class SumOfArray {

    // below the code for create a new method
    public int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            arr[i] = nums[i] + arr[i - 1];
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        // create a new instance of object
        SumOfArray sumOfArray = new SumOfArray();
        int[] res = sumOfArray.runningSum(arr);
        System.out.println(Arrays.toString(res));
    }
}
