package com.problems.leetcode;

public class FindEncryptedInt {

    //     Create a static method
    public int sumOfEncryptedInt(int[] nums) {

        //  validation
        if (nums.length == 0) {
            return 0;
        }

        int sumEle = 0;

        for (int num : nums) {
            int maxDigit = Integer.MIN_VALUE;

            while (num > 0) {

                // extract the last ele
                int digit = num % 10;
                maxDigit = Math.max(maxDigit, digit);

                // remove the last element
                num /= 10;
            }

           
        }

        return sumEle;

    }

    public static void main(String[] args) {

    }
}
