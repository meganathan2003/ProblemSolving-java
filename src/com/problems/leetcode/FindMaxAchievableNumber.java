package com.problems.leetcode;

public class FindMaxAchievableNumber {

    // create a static method
    public static int theMaximumAchievableX(int num, int t) {

        if (num < 0 || t < 0) {
            return 0;
        }

        // implement the formula
        return num + t + t;
    }

    public static void main(String[] args) {

        int num = 3;
        int t = 2;

        System.out.println(theMaximumAchievableX(num, t));

    }
}
