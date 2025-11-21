package com.problems.easy.Arrays;

/**
 * Below the sum for find the
 * min operation in the array and
 * how many operation to need to find the
 * answer
 *
 * @author meganathan
 */
public class MinOperation {

    public int minOperations(int[] nums, int k) {
        if (nums.length != 0 && k != 0) {
            int operation = 0;
            for (int num : nums) {
                if (k > num) { // 9 > 1
                    operation++;
                }
            }
            return operation;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 11, 10, 1, 3};
        int k = 10;
        MinOperation minOperation = new MinOperation();
        System.out.println(minOperation.minOperations(arr, k));
    }
}
