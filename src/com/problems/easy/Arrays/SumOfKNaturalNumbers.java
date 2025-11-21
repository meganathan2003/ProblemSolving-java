package com.problems.easy.Arrays;

/**
 * problems is to print the sum for
 * K natural numbers
 *
 * @author Meganathan
 */
public class SumOfKNaturalNumbers {

    public static int sumOfKNaturalNumbers(int k) {
        int res = 0;

        for (int i = 1; i <= k; i++) {
            res += i;
        }
        return res;

    }

    public static void main(String[] args) {
        int k = 3;
        System.out.println(sumOfKNaturalNumbers(k));
    }

}
