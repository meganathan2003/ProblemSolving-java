package com.problems.leetcode;

public class DivSumDiff {

    // Create a static method
    public static int differenceOfSums(int n, int m) {

        // validation
        if (n < 0 || m < 0) {
            return 0;
        }
        int num1 = 0;
        int num2 = 0;

        // Create a loop
        for (int i = 1; i <= n; i++) {

            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return Math.abs(num1) - Math.abs(num2);

    }

    public static void main(String[] args) {

        int n = 5;
        int m = 6;

        System.out.println(differenceOfSums(n, m));
    }
}
