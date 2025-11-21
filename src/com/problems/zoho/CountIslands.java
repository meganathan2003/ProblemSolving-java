package com.problems.zoho;


/**
 * Day 29
 *
 * @author Meganathan
 */
public class CountIslands {

    public static int numIslands(int[][] grid) {

        if (grid == null || grid.length == 0) {
            return 0;
        }


        int numIslands = 0;
        int row = grid.length;
        int col = grid[0].length;

        // loop
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 1) {

                    numIslands++; // island count eh increase panitom

                    dfs(grid, i, j); // helper function ku send panurom values eh

                }
            }
        }

        return numIslands;
    }


    // Helper function to handle the all side like check panum all side
    private static void dfs(int[][] grid, int row, int col) {

        // intha if vanthu bounderis check panurathuku
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col] == 0) {
            return;
        }

        grid[row][col] = 0; // zero pothuku reason nama antha place eh visited panitom nu therirathuku

        // inga the recursive start akum
        dfs(grid, row - 1, col);  // Up ku
        dfs(grid, row + 1, col);  // Down ku
        dfs(grid, row, col - 1);  // Left ku
        dfs(grid, row, col + 1); // Right ku
    }

    public static void main(String[] args) {

        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 1, 0, 0, 1},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };
        int result = numIslands(grid);
        System.out.println(result);

    }
}
