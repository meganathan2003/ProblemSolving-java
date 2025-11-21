package com.problems.easy.Arrays;

public class PyramidPattern {

    public static void main(String[] args) {

        // input
        int n = 5;

        for (int i = 1; i <= n; i++) {

            // this loop for print the spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // this loop for print the stars
            for (int k = 1; k <= (i * 2 - 1); k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
