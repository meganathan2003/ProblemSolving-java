package com.problems.leetcode;

import java.util.Arrays;

public class MinSumOfFourDigits {

    //Create a static method
    public static int minimumSum(int num) {


//        validation
        if (num < 0) {
            return 0;
        }
        int[] digits = new int[4];
        for (int i = 0; i < 4; i++) {
            digits[i] = num % 10; // Get the last digit
            num /= 10;           // Remove the last digit
        }

        // Step 2: Sort the digits in ascending order
        Arrays.sort(digits);


        int new1 = digits[0] * 10 + digits[2];
        int new2 = digits[1] * 10 + digits[3];

        return new1 + new2;


    }

    public static void main(String[] args) {

    }
}
