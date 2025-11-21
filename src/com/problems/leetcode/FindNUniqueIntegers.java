package com.problems.leetcode;
import java.util.Arrays;

public class FindNUniqueIntegers {

    // create a seperate method
    public static int[] sumZero(int n) {

        if (n < 1) {
            return new int[0];
        }

        int[] result = new int[n];
        int index = 0; // for tracking the index value

        for (int i = 1; i <= n / 2; i++) {
            result[index++] = i;
            result[index++] = -i;
        }

        // check if n is odd then add 0
        if (n % 2 == 1) {
            result[index] = 0;
        }

        return result;

    }

    public static void main(String[] args) {

        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));
    }
}
