package com.problems.zoho;


import java.util.Arrays;

/**
 * Day 22
 *
 * @author Meganathan
 */
public class MaximumNumberOfStoriesWithInTime {

    public static int getMaxStories(int[] storyDurations, int totalTime) {

        if (storyDurations.length == 0 || totalTime <= 0) {
            return 0;
        }

        // Sort the array
        Arrays.sort(storyDurations);
        System.out.println(Arrays.toString(storyDurations));

        int count = 0;
        for (int storyDuration : storyDurations) {

            if (totalTime >= storyDuration) { // total time oda kamiya irukanu check panurom
                totalTime -= storyDuration;
                count++;

            } else {
                break; // next story ku fit akala means time loop stop
            }
        }

        return count;

    }

    public static void main(String[] args) {

        int[] storyDurations = {10, 15, 20, 5, 30};

        int totalTime = 50;
        System.out.println(getMaxStories(storyDurations, totalTime));
    }


}
