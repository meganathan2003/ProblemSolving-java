package com.problems.leetcode;

public class XorOpInArr {

    // Create a static method
    public static int xorOperation(int n, int start) {

        if (n < 0 || start < 0) {
            return 0;
        }


        int result = 0;
        // Define the new array nums
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int num = nums[i] = start + 2 * i;
            result ^= num;
        }
        return result;


    }

    public static void main(String[] args) {

        int n = 5;
        int start = 0;

        System.out.println(xorOperation(n, start));

    }
}
