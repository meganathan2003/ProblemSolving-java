package com.problems.easy.Arrays;

/**
 * Below the code for find the largest number in the n x n matrix and create a
 * new array and return the largest number arr
 *
 * Input: grid = [[9,9,8,1],[5,6,2,6],[8,2,6,4],[6,2,2,2]] Output: [[9,9],[8,6]]
 */
public class FindLargestLocalValue {

    // create a seprate method
    public static int[][] generateMaxLocalMatrix(int[][] grid) {
        int n = grid.length;  // size of the original grids
        System.out.println(n);
        int[][] maxLocal = new int[n - 2][n - 2];

        // Loop through each possible 3x3 submatrix
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {

                int maxVal = Math.max(
                        Math.max(grid[i][j], grid[i][j + 1]),
                        Math.max(grid[i][j + 2], grid[i + 1][j])
                );
                maxVal = Math.max(maxVal, Math.max(
                        Math.max(grid[i + 1][j + 1], grid[i + 1][j + 2]),
                        Math.max(grid[i + 2][j], grid[i + 2][j + 1])
                ));
                maxVal = Math.max(maxVal, grid[i + 2][j + 2]);

                maxLocal[i][j] = maxVal;  // Store the max value in maxLocal
            }
        }

        return maxLocal;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {9, 9, 8, 1},
            {5, 6, 2, 6},
            {8, 2, 6, 4},
            {6, 2, 2, 2}
        };

        int[][] maxLocal = generateMaxLocalMatrix(grid);

        // Print the result
        for (int[] maxLocal1 : maxLocal) {
            for (int j = 0; j < maxLocal1.length; j++) {
                System.out.print(maxLocal1[j] + " ");
            }
            System.out.println();
        }
    }

}
