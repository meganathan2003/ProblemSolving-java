package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Here the sum we travel the all points and find the optimal way and return the
 * seconds
 *
 * Input: points = [[1,1],[3,4],[-1,0]] Output: 7 Explanation: One optimal path
 * is [1,1] -> [2,2] -> [3,3] -> [3,4] -> [2,3] -> [1,2] -> [0,1] -> [-1,0] Time
 * from [1,1] to [3,4] = 3 seconds Time from [3,4] to [-1,0] = 4 seconds Total
 * time = 7 seconds
 */
public class MinTimeToVistiAllPoints {

    // Create a new method
    public static int minTimeToVisitAllPoints(int[][] points) {

        if (points.length == 0 && points[0].length == 0) {
            return 0;
        }

        int totalTime = 0;

        for (int i = 0; i < points.length - 1; i++) {

            System.out.println(Arrays.toString(points[i]));
            System.out.println(Arrays.toString(points[i + 1]));
            totalTime += timeBetweenPoints(points[i], points[i + 1]); // 
            System.out.println(totalTime);

        }

        return totalTime;

        /**
         * This is alternate soln using recursion
         * 
         * if (points.length == 0 && points[0].length == 0) {
            return 0;
        }

        int totalTime = 0;

        for (int i = 0; i < points.length - 1; i++) {

            // Current points
            int x1 = points[i][0]; // [[1,1],[3,4],[-1,0]]
            int y1 = points[i][1]; // 1

            // calculate the second points
            int x2 = points[i + 1][0]; // 3
            int y2 = points[i + 1][1]; // 4

            // find horizontal and vertical time
            int horizontalDiff = Math.abs(x1 - x2);
            int verticalDiff = Math.abs(y1 - y2);

            totalTime += Math.max(horizontalDiff, verticalDiff);

        }
         */
        //     int totalTime = 0;
        //     for (int i = 0; i < points.length - 1; i++) {
        //         totalTime += timeBetweenPoints(points[i], points[i + 1]);
        //     }
        //     return totalTime;
        // }
        // private static int timeBetweenPoints(int[] p1, int[] p2) {
        //     return Math.max(Math.abs(p2[0] - p1[0]), Math.abs(p2[1] - p1[1]));
        // }
    }

    private static int timeBetweenPoints(int[] p1, int[] p2) {
        return Math.max(Math.abs(p2[0] - p1[0]), Math.abs(p2[1] - p1[1]));
    }

    public static void main(String[] args) {
        int[][] points = {{1, 1}, {3, 4}, {-1, 0}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
}
