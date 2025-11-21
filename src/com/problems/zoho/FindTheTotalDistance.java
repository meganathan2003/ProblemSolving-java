package com.problems.zoho;


import java.util.List;

/**
 * Day 31
 *
 * @author Meganathan
 */
public class FindTheTotalDistance {

    public static double calculateTotalDistance(List<int[]> landmarks) {

        if (landmarks.isEmpty()) {
            return 0.0;
        }

        double totalDistance = 0.0;
        for (int i = 0; i < landmarks.size() - 1; i++) {
            int[] point1 = landmarks.get(i);
            int[] point2 = landmarks.get(i + 1);

            // ithuthan acutal ah
            double distance = Math.sqrt(Math.pow(point2[0] - point1[0], 2) + Math.pow(point2[1] - point1[1], 2));

            totalDistance += distance;

        }

        System.out.println(totalDistance);

        // ithu vathu round panuratuhku vara ans ah
        return Math.round(totalDistance * 100.0) / 100.0;
    }

    public static void main(String[] args) {

        List<int[]> landmarks = List.of(
                new int[]{1, 2},
                new int[]{4, 6},
                new int[]{8, 10}
        );

        /**
         * Based on the first example we get answer 10.66 is right not 11 becasue
         * first coordinate ku 5.0 + sec cord 5.656854249492381  = 10.65685424949238
         * ithu round pana 10.66
         */
        System.out.println(calculateTotalDistance(landmarks));

    }

}
