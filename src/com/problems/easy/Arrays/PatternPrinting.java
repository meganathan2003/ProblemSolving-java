package com.problems.easy.Arrays;

/**
 * Print the pattern below using any loop. The number of rows should be obtained
 * from the user while running the program. The below is an example for user
 * input of 5.
 * <p>
 * <p>
 * *
 * * *
 * * * *
 * * * * *
 * </p>
 */
public class PatternPrinting {

    // // Create a static method
    // public static String printingPattern() {

    // // loop for print the pattern
    // String patternStar = "";

    // }

    public static void main(String[] args) {
        String start = "";
        for (int i = 1; i <= 5; i++) {
            start += "*";
            System.out.println(start);
        }


    }

}
