package com.problems.zoho;

/**
 * Day 26
 *
 * @author Meganathan
 */
public class CellsCoveredByCamera {

    public static boolean isFullyCovered(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (cols == 0) {
            return false;
        }

        boolean[][] coveredCells = new boolean[rows][cols];

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 'C') {
                    // Mark the camera's own position as covered
                    if (coverCell(r, c, grid)) coveredCells[r][c] = true;
                    if (coverCell(r - 1, c, grid)) coveredCells[r - 1][c] = true;
                    if (coverCell(r + 1, c, grid)) coveredCells[r + 1][c] = true;
                    if (coverCell(r, c - 1, grid)) coveredCells[r][c - 1] = true;
                    if (coverCell(r, c + 1, grid)) coveredCells[r][c + 1] = true;
                }
            }
        }

        // This loop for check the all open areas
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == '.' && !coveredCells[r][c]) {
                    return false;
                }
            }
        }

        return true;
    }

    // create a new helper function to check that is valid cell or not
    private static boolean coverCell(int r, int c, char[][] grid) {
        return r >= 0 && r < grid.length && c >= 0 && c < grid[0].length && grid[r][c] != 'X';
    }

    public static void main(String[] args) {

        char[][] grid = {
                {'C', '.', '.', '.', '.'},
                {'X', '.', '.', 'C', '.'},
                {'.', '.', '.', 'X', 'C'}
        };

        System.out.println(isFullyCovered(grid));
    }

}
