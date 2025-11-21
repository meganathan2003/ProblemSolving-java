package com.problems.leetcode;

import java.util.*;

public class TwoOutOfThree {

    // Create a static method
    public static List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        if (nums1.length == 0 || nums2.length == 0 || nums3.length == 0) {
            return new ArrayList<>();
        }


        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();


        for (int num : nums1) set1.add(num);
        for (int num : nums2) set2.add(num);
        for (int num : nums3) set3.add(num);

        // freq add to the map
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : set1) freq.put(num, freq.getOrDefault(num, 0) + 1);
        for (int num : set2) freq.put(num, freq.getOrDefault(num, 0) + 1);
        for (int num : set3) freq.put(num, freq.getOrDefault(num, 0) + 1);

        List<Integer> res = new ArrayList<>();

        // if the value is more the 2 print that
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() >= 2) {
                res.add(entry.getKey());
            }

        }

        return res;

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 1, 3, 2};
        int[] nums2 = {2, 3};
        int[] nums3 = {3};

        System.out.println(twoOutOfThree(nums1, nums2, nums3));
    }
}
