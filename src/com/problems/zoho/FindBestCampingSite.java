package com.problems.zoho;

/**
 * Day 24
 *
 * @author Meganathan
 */
class FindBestCampingSite {

    // Directions for adjacent cells: right, down, left, up
    private static final int[] ROW_DIR = {0, 1, 0, -1};
    private static final int[] COL_DIR = {1, 0, -1, 0};

    public static int[] findBestCampingSite(char[][] mapGrid) {
        int rows = mapGrid.length;
        int cols = mapGrid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mapGrid[i][j] == 'E' && hasTwoConditionsNearby(mapGrid, i, j)) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{-1, -1};
    }

    // helper function for nearby la statisfy akuthanu
    private static boolean hasTwoConditionsNearby(char[][] mapGrid, int row, int col) {
        boolean hasWater = false;
        boolean hasTrees = false;
//        boolean hasRocks = false;

        // Check all 4 adjacent cells
        for (int d = 0; d < 4; d++) {
            int newRow = row + ROW_DIR[d];
            int newCol = col + COL_DIR[d];

            if (isValidCell(mapGrid, newRow, newCol)) {
                char terrain = mapGrid[newRow][newCol];
                if (terrain == 'W') hasWater = true;
                if (terrain == 'T') hasTrees = true;

                // comment pana reason output la 1,2 iruku basics ah water tree tha namaku important so athu find pani return panurmom
//                if (terrain == 'R') hasRocks = true;
            }
        }

        int conditionsMet = 0;
        if (hasWater) conditionsMet++;
        if (hasTrees) conditionsMet++;
//        if (hasRocks) conditionsMet++;

        return conditionsMet >= 2;
    }

    // intha helper function vanthu boundries paka
    private static boolean isValidCell(char[][] mapGrid, int row, int col) {
        return row >= 0 && row < mapGrid.length && col >= 0 && col < mapGrid[0].length;
    }

    public static void main(String[] args) {
        char[][] mapGrid1 = {
                {'R', 'E', 'T', 'R'},
                {'T', 'E', 'E', 'W'},
                {'E', 'E', 'W', 'W'},
                {'R', 'E', 'T', 'E'}
        };

        int[] result = findBestCampingSite(mapGrid1);
        System.out.println(result[0] + " " + result[1]);
    }
}

