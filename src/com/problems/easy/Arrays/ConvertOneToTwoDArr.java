package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Here the problems is
 * convert the 1D Array to
 * 2D Array
 * Example:
 * Input: original = [1,2,3,4], m = 2, n = 2
 * Output: [[1,2],[3,4]]
 */

class ConvertOneToTwoDArr {

    // Create a seperate static method
    public static int[][] construct2DArray(int[] original, int m, int n) {

        // Create a two dim Arry
        int[][] result = new int[m][n]; // m refers row n refers colum

        if (original.length != m * n || m == 0 || n == 0) {
            return new int[0][];
        }

        // loop for add the elements in the array
        for (int i = 0; i < original.length; i++) {
            result[i / n][i % n] = original[i]; // i / n refers the row and % refers to column
        }
        return result;

    }

    public static void main(String[] args) {

        int[] original = { 1, 2, 3, 4 };
        int m = 2;
        int n = 2;

        // call the method
        int[][] output = construct2DArray(original, m, n);

        // Print the result 2D array
        System.out.println(Arrays.deepToString(output));
    }
}