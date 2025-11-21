package com.problems.leetcode;

public class SubProductSumDigit {
    // create a static method

    public static int subtractProductAndSum(int n) {

//        validation
        if (n < 0) {
            throw new IllegalArgumentException("Integer must be non-negative Integer");
        }

        int product = 1; // Start product as 1
        int sum = 0;     // Start sum as 0

        while (n > 0) {
            int digit = n % 10; // Extract the last digit
            product *= digit;   // Multiply to the product
            sum += digit;       // Add to the sum
            n /= 10;            // Remove the last digit
        }

        return product - sum;


    }

    public static void main(String[] args) {

        int n = 234;

        System.out.println(subtractProductAndSum(n));
    }
}
