package com.problems.easy.Arrays;

public class CountCompleteDayPairs {

    public static int countCompleteDayPairs(int[] hours) {

        if (hours.length == 0) {
            return 0;

        }

        int count = 0;

        for (int i = 0; i < hours.length; i++) {
            for (int j = i + 1; j < hours.length; j++) {
                if ((hours[i] + hours[j]) % 24 == 0) {
                    count++;
                }
            }
        }

        return count;

    }

    public static void main(String[] args) {

        int[] hours = {72, 48, 24, 3};
        System.out.println(countCompleteDayPairs(hours));

    }

}
