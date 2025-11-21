package com.problems.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class NRepeatedElements {

    public static int repeatedNTimes(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();


        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3};
        System.out.println(repeatedNTimes(nums));

    }
}
