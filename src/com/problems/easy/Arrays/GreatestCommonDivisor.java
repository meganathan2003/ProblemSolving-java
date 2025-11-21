package com.problems.easy.Arrays;

import java.util.Arrays;

public class GreatestCommonDivisor {

    public static int findGCD(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums); // 6 , 7 ,9

        int smallNum = nums[0];
        int largeNum = nums[nums.length - 1];

        return gcd(smallNum, largeNum);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {

            int remainder = a % b ;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void main(String[] args) {

        int[] nums = {3, 6};
        System.out.println(findGCD(nums));

    }
}
