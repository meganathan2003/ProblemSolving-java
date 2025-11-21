package com.problems.easy.Arrays;

import java.util.HashMap;

public class MaxFrequencyElements {

    public static int maxFrequencyElements(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int freqCount = 0;

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // find the max freq
        int maxFreq = 0;
        for (int frequency : frequencyMap.values()) {
            maxFreq = Math.max(frequency, maxFreq);
        }


        // find the key and value how many times its return
        int totalCount = 0;
        for (int num : frequencyMap.values()) {
            if (num == maxFreq) {
                totalCount += maxFreq;
            }
        }
        return totalCount;

    }

    public static void main(String[] args) {

        int[] nums = {19, 19, 19, 20, 19, 8, 19};
        System.out.println(maxFrequencyElements(nums));

    }
}
