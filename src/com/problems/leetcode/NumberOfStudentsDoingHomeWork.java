package com.problems.leetcode;

public class NumberOfStudentsDoingHomeWork {

    // Create a static method
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        if (startTime.length == 0 || endTime.length == 0 || queryTime < 0) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {


        int[] startTime = {4};
        int[] endTime = {4};
        int queryTime = 4;

        System.out.println(busyStudent(startTime, endTime, queryTime));
    }
}
