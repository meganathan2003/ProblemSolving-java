package com.problems.leetcode;

public class CountNegativeNumbers {

    public static int countNegatives(int[][] grid) {

        if (grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int cnt = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    cnt++;
                }
            }
        }

        return cnt;
    }


    public static void main(String[] args) {


        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};

        System.out.println(countNegatives(grid));
    }

}
