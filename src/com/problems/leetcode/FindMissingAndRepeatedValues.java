package com.problems.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingAndRepeatedValues {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        if (grid.length == 0 || grid[0].length == 0) {
            return new int[0];
        }
        int n = grid.length;

        int[] res = new int[2];
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (set.contains(grid[i][j])) {
                    res[0] = grid[i][j];
                } else {
                    set.add(grid[i][j]);
                }
            }
        }

        System.out.println(set);

        // find the missing number
        for (int i = 1; i <= n * n; i++) {
            if (!set.contains(i)) {
                res[1] = i;
                break;
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int[][] grid = {{9, 1, 7}, {8, 9, 2}, {3, 4, 6}};

        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));

    }
}
