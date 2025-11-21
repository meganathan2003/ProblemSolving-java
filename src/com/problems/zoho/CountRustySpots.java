package com.problems.zoho;

/**
 * Day 23
 *
 * @author Meganathan
 */
public class CountRustySpots {

    public static int countRustySpots(int[][] rustGrid, int maxAllowableRust) {

        if (rustGrid.length == 0 || rustGrid[0].length == 0) {
            return 0;
        }

        int rustCount = 0;

        for (int i = 0; i < rustGrid.length; i++) {
            for (int j = 0; j < rustGrid[i].length; j++) {
                if (rustGrid[i][j] > maxAllowableRust) {
                    rustCount++;
                }
            }
        }

        return rustCount;
    }

    public static void main(String[] args) {

        int[][] rustGrid = {
                {1, 3, 5, 2},
                {4, 6, 8, 3},
                {7, 2, 1, 5},
                {3, 4, 6, 2}
        };
        int maxAllowableRust = 4;

        System.out.println(countRustySpots(rustGrid, maxAllowableRust));

    }
}
