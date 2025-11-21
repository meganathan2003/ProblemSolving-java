package com.problems.easy.Arrays;

/**
 * Below the code for sum the
 * number in the diagonal way
 *
 * @author meganathan
 * <p>
 * Input: mat = [[1,2,3],
 * [4,5,6],
 * [7,8,9]]
 * Output: 25
 */
public class DiagonalSum {

    public int diagonalSum(int[][] mat) {
        if (mat[0].length != 0 || mat != null || mat.length != 0) {
            int n = mat.length;

            // mid point index
            int mid = n / 2;

            // to add the value
            int summation = 0;

            for (int i = 0; i < n; i++) {
                // for first mat is primary
                summation += mat[i][i];

                // secondary matrix
                summation += mat[n - 1 - i][i]; // it will check the reverse
            }

            // now check the odd length in matrix
            if (n % 2 == 1) summation -= mat[mid][mid];
            return summation;
        }
        return 0;
    }

    public static void main(String[] args) {

        // Create a array
        int[][] array = {{5}};

        DiagonalSum diagonalSum = new DiagonalSum();
        System.out.println(diagonalSum.diagonalSum(array));
    }

}
