package com.problems.easy.Arrays;

public class NoOfStepsReduceZero {

    // Create a static method
    public static int numberOfSteps(int num) {
//        Validation

        if (num < 0) {
            return 0;
        }

        int count = 0;
        while (num > 0) {

            // Check even or odd
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int num = 14;
        System.out.println(numberOfSteps(num));
    }
}
