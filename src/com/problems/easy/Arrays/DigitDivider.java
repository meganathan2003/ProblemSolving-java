package com.problems.easy.Arrays;

public class DigitDivider {

    // Create a static method
    public static int countDividingDigits(int n) {
//        Validation
        if (n < 0) {
            return 0;
        }

        int count = 0;
        // while loop for statify the condition
        while (n > 0) {

            // Extract the last digit
            int lastDigit = n % 10;
            if (lastDigit != 0 && n % lastDigit == 0) {
                count++;
            }

            n /= 10;
        }

        return count;
    }


    public static void main(String[] args) {
        int n = 2446;

        System.out.println(countDividingDigits(n));
    }
}
