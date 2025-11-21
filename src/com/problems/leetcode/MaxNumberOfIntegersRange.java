package com.problems.leetcode;

import java.util.HashSet;
import java.util.Set;

public class MaxNumberOfIntegersRange {

    public static int maxCount(int[] banned, int n, int maxSum) {

        if (banned.length == 0 || n < 0 || maxSum < 0) {
            return 0;
        }


        // Convert the banned array to a Set for faster lookup
        Set<Integer> bannedSet = new HashSet<>();
        for (int num : banned) {
            bannedSet.add(num);
        }

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (bannedSet.contains(i)) {
                continue;
            }

            // check the sum with maxsum
            if (sum + i > maxSum) {
                break;
            }

            sum += i;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] banned = {1, 6, 5};
        int n = 5;
        int maxSum = 6;

        System.out.println(maxCount(banned, n, maxSum));
    }
}
