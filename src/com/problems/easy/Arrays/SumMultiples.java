package com.problems.easy.Arrays;

public class SumMultiples {

    // create a static method
    public static int sumOfMultiples(int n) {
        if (n < 0) {
            return 0;
        }

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                sum += i;
            } else if (i % 5 == 0) {
                sum += i;
            } else if (i % 7 == 0) {
                sum += i;
            }
        }

        return sum;

    }

    public static void main(String[] args) {
        int n = 10;

        System.out.println(sumOfMultiples(n));
    }
}
