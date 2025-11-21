package com.problems.leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfPairs {

    // Create a static method
    public static int[] numberOfPairs(int[] nums) {

        if (nums.length <= 1) {
            return new int[]{0, nums.length};
        }

        int leftOver = 0;
        int count = 0;
        int[] res = new int[2];

        // push all them to hashmap
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map);

        // now find the count pairs
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            count += entry.getValue() / 2;
            leftOver += entry.getValue() % 2;
        }
        res[0] = count;
        res[1] = leftOver;
        return res;

    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 2, 1, 3, 2, 2};
        System.out.println(Arrays.toString(numberOfPairs(nums)));
    }
}
