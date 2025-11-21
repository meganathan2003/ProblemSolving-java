package com.problems.easy.Arrays;

import java.util.Arrays;

public class OddCells {

    public static int oddCells(int m, int n, int[][] indices) {

        if (m == 0 || n == 0 || indices[0].length == 0) {
            return 0;
        }

        int[] rows = new int[m];
        int[] cols = new int[n];

        // Increment counts for each row and column specified in indices
        for (int[] index : indices) {
            rows[index[0]]++;
            cols[index[1]]++;
        }

        int oddCount = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // If the sum of row[i] and col[j] is odd, then this cell is odd
                if ((rows[i] + cols[j]) % 2 != 0) {
                    oddCount++;
                }
            }
        }

        return oddCount;


    }

    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0, 1}, {1, 1}};

        System.out.println(oddCells(m, n, indices));
    }
}
