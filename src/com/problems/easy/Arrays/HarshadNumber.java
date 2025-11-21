package com.problems.easy.Arrays;

public class HarshadNumber {

    // create a static method
    public static int sumOfTheDigitsOfHarshadNumber(int x) {
        if (x < 0) {
            return 0;
        }


        int originalX = x;
        int num = 0;

        while (x > 0) {

            int n = x % 10;

            num += n;
            // remove the last digit
            x /= 10;
        }

        // Check if that divide in x

        return originalX % num == 0 ? num : -1;


    }

    public static void main(String[] args) {
        int n = 23;

        System.out.println(sumOfTheDigitsOfHarshadNumber(n));
    }
}
