package com.problems.zoho;

/**
 * Day 27
 *
 * @author Meganathan
 */
public class RoadSafety {

    public static int minimumMarkers(int[] road) {
        int markers = 0;
        int i = 0;

        while (i < road.length) {
            if (road[i] == 1) {
                markers++;
                i += 3;
            } else {
                i++;
            }
        }

        return markers;
    }

    public static void main(String[] args) {
        int[] road1 = {1, 0, 1, 1, 0, 1};
        int[] road2 = {1, 0, 0, 1, 1, 0, 1};

        System.out.println(minimumMarkers(road1));
        System.out.println(minimumMarkers(road2));
    }
}


