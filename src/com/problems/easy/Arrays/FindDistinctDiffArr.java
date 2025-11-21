package com.problems.easy.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindDistinctDiffArr {

    public static int[] distinctDifferenceArray(int[] nums) {
        if (nums.length == 0) {
            return new int[0];
        }

        int n = nums.length;

        int[] res = new int[n];

        Set<Integer> prefixSet = new HashSet<>();
        Set<Integer> suffixSet = new HashSet<>();

        int[] suffixDistinctCount = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffixSet.add(nums[i]);
            suffixDistinctCount[i] = suffixSet.size();
        }

        // this loop for calculate the result of each index

        for (int i = 0; i < n; i++) {
            prefixSet.add(nums[i]);
            int prefixCount = prefixSet.size();
            int suffixCount = suffixDistinctCount[i + 1];
            res[i] = prefixCount - suffixCount;
        }

        
        return res;

    }

    public static void main(String[] args) {

        int[] nums = { 3, 2, 3, 4, 2 };
        System.out.println(Arrays.toString(distinctDifferenceArray(nums)));
    }
}
