package com.problems.easy.Arrays;

public class CountDigits {

    // create a static method
    public static int countDigits(int num) {

        if (num < 0) {
            return 0;
        }

        int count = 0;
        int n = num;

        while (num > 0) {

            // now get the last digit
            int lastDigit = num % 10;

            // check is that digit divisible by num
            if (n % lastDigit == 0) {
                count++;
            }
            num /= 10;
        }

        return count;
    }


    public static void main(String[] args) {
        int n = 1248;

        System.out.println(countDigits(n));
    }
}
