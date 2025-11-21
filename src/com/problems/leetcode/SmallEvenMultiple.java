package com.problems.leetcode;

public class SmallEvenMultiple {

    // create a static method
    public static int smallestEvenMultiple(int n) {

        if (n % 2 == 0) {

            return n; // n is already a multiple of 2
        } else {
            return n * 2;
        }

    }

    public static void main(String[] args) {
        int n = 5;

        System.out.println(smallestEvenMultiple(n));

    }
}
