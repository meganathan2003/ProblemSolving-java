package com.problems.zoho;


/**
 * Day 21
 *
 * @author Meganathan
 */
public class RhinoPatrol {

    public static int minRangers(int[] rhinoCounts, int maxRhinosPerRanger) {
        int rangers = 0;

        for (int rhinos : rhinoCounts) {
            int fullRangers = rhinos / maxRhinosPerRanger;
            rangers += fullRangers;

            int remainingRhinos = rhinos % maxRhinosPerRanger; // remainingrhinos check pana
            if (remainingRhinos > 0) {
                // If there are remaining rhinos, assign one more ranger
                rangers++;
            }
        }

        return rangers;
    }

    public static void main(String[] args) {
        int[] rhinoCounts = {10, 8, 15, 12};
        int maxRhinosPerRanger = 10;

        int result = minRangers(rhinoCounts, maxRhinosPerRanger);
        System.out.println(result);
    }
}

