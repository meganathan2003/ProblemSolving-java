package com.problems.zoho;

import java.util.*;

/**
 * Day 19
 *
 * @author Meganathan
 */

public class RidgePathFinder {
    static int[] rowDirs = {-1, 1, 0, 0}; // Up, down, left, right
    static int[] colDirs = {0, 0, -1, 1};

    public static List<int[]> findLongestRidgePath(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        List<int[]> resultPath = new ArrayList<>();
        List<int[]>[][] memo = new ArrayList[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                List<int[]> currentPath = dfs(grid, i, j, n, m, memo);
                if (currentPath.size() > resultPath.size()) {
                    resultPath = currentPath;

                } else if (currentPath.size() == resultPath.size()) {

                    int currentPathSum = currentPath.stream().mapToInt(point -> grid[point[0]][point[1]]).sum();
                    int resultPathSum = resultPath.stream().mapToInt(point -> grid[point[0]][point[1]]).sum();
                    if (currentPathSum > resultPathSum) {
                        resultPath = currentPath;
                    }
                }
            }
        }
        return resultPath;
    }

    // Depth first search algo vanthu search panurathuku
    public static List<int[]> dfs(int[][] grid, int row, int col, int n, int m, List<int[]>[][] memo) {
        if (memo[row][col] != null) {
            return memo[row][col];
        }

        List<int[]> maxPath = new ArrayList<>();
        maxPath.add(new int[]{row, col});

        for (int d = 0; d < 4; d++) {
            int newRow = row + rowDirs[d];
            int newCol = col + colDirs[d];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && grid[newRow][newCol] > grid[row][col]) {
                List<int[]> newPath = dfs(grid, newRow, newCol, n, m, memo);
                if (newPath.size() + 1 > maxPath.size()) {

                    maxPath = new ArrayList<>();
                    maxPath.add(new int[]{row, col});
                    maxPath.addAll(newPath);


                } else if (newPath.size() + 1 == maxPath.size()) {

                    int newPathSum = newPath.stream().mapToInt(point -> grid[point[0]][point[1]]).sum();
                    int maxPathSum = maxPath.stream().skip(1).mapToInt(point -> grid[point[0]][point[1]]).sum();
                    if (newPathSum > maxPathSum) {

                        maxPath = new ArrayList<>();
                        maxPath.add(new int[]{row, col});
                        maxPath.addAll(newPath);

                    }
                }
            }
        }

        memo[row][col] = maxPath;
        return maxPath;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {10, 12, 14, 13, 9},
                {9, 11, 15, 14, 8},
                {8, 10, 12, 16, 7},
                {7, 9, 11, 10, 6}
        };

        List<int[]> result = findLongestRidgePath(grid);

        for (int[] point : result) {
            System.out.print("(" + point[0] + ", " + point[1] + ") ");
        }
    }
}

