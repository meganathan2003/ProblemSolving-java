package com.problems.easy.Arrays;

/**
 * Below the sum for find the sum of squares in
 * the array and return the array how much
 * square we find
 *
 * @author Meganathan
 * <p>
 * Input: nums = [1,2,3,4]
 * Output: 21
 */
public class SumOfSquares {

    public int sumOfSquares(int[] nums) {

        int n = nums.length;
        int squareCount = 0;

        for (int i = 0; i < n; i++) {
            if (n % (i + 1) == 0) { // 4 % 1 = 0
                squareCount += nums[i] * nums[i];
            }
        }
        return squareCount;
    }

    public static void main(String[] args) {
        // Create a new int array
        int[] arr = {1, 2, 3, 4};

        // Create a new obj
        SumOfSquares sum = new SumOfSquares();
        System.out.println(sum.sumOfSquares(arr));

    }
}
