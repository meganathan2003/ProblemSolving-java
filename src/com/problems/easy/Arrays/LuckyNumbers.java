package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Here is the problem to solve is
 * Given an m x n matrix of distinct
 * numbers, return all lucky numbers
 * in the matrix in any order.
 * A lucky number is an element of the
 * matrix such that it is the minimum
 * element in its row and maximum in its column.
 * <p>
 * Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * Output: [15]
 * <p/>
 */
public class LuckyNumbers {

    // create a static method
    public static List<Integer> luckyNumbers(int[][] matrix) {

        if (matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        List<Integer> luckyNumbers = new ArrayList<>();

        // loop for find the minimum ele in the row
        for (int[] ints : matrix) {

            int minRowValue = ints[0]; // which means first arr first ele
            int minColumnIndex = 0;

            // loop for find the minvalue in row
            for (int j = 1; j < ints.length; j++) {

                if (ints[j] < minRowValue) {
                    // change the value
                    minRowValue = ints[j];
                    minColumnIndex = j; // this will remind the column
                }

            }


            // this loop is find the max ele in the column
            boolean isCheckValue = true;
            for (int[] value : matrix) {
                if (value[minColumnIndex] > minRowValue) {
                    isCheckValue = false;
                    break;
                }
            }

            if (isCheckValue) {
                luckyNumbers.add(minRowValue);
            }
        }

        return luckyNumbers;


    }


    public static void main(String[] args) {
        // Create a new array
        int[][] matrix = {
                {1, 10, 4, 2},
                {9, 3, 8, 7},
                {15, 16, 17, 12}
        };

        List<Integer> result = luckyNumbers(matrix);
        System.out.println("Lucky Numbers: " + result);

    }

}
