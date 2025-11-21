package com.problems.easy.Arrays;

public class ReverseDigit {

    // Create a static method

    public static int reverseDigit(int n) {
//        Validation
        if (n < 0) {
            return 0;


        }

        int reverseInt = 0;

        while (n > 0) {

            int lastDigit = n % 10;

            reverseInt = reverseInt * 10 + lastDigit; // 2 * 10 + 2 = 22

            // remove the last digit
            n /= 10;
        }
        return reverseInt;
    }

    public static void main(String[] args) {
        int n = 200;

        System.out.println(reverseDigit(n));
    }
}
