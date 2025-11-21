package com.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Here the problems is to find
 * the minimum time in the array and
 * return the minutes you have to
 * compare the all hours and minutes
 * and return the minimum minutes in
 * int
 * 
 * @author meganathan
 */
public class FindMinimumTimeDiff {

    // Create a sepreate static method
    public static int findMinDifference(List<String> timePoints) {

        // Create a new array
        int[] times = new int[timePoints.size()];

        // now we have to find the hours and minutes in using split
        for (int i = 0; i < timePoints.size(); i++) {

            String[] parts = timePoints.get(i).split(":");
            // System.out.println(Arrays.toString(parts));

            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);

            // now we have to find the minutes in each time
            times[i] = (hours * 60) + minutes; // get the total minutes

        }

        Arrays.sort(times); // now we are sorted

        int minDifference = Integer.MAX_VALUE;
        

        for (int i = 0; i < times.length - 1; i++) {
            minDifference = Math.min(minDifference, times[i + 1] - times[i]);
        }

        int wrapAroundDifference = 1440 - (times[times.length - 1] - times[0]);
        minDifference = Math.min(minDifference, wrapAroundDifference);      
        System.out.println(minDifference);


        return minDifference;

    }

    public static void main(String[] args) {

        // Create a arr for input
        List<String> time = new ArrayList<>(Arrays.asList("00:00", "23:59", "00:00"));
        System.out.println(findMinDifference(time));

    }
}
