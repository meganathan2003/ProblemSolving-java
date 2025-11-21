package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleteGreatestValue {

    public static int deleteGreatestValue(int[][] grid) {
        if (grid[0].length == 0) {
            return 0;
        }

        int answer = 0;


        // now we have to convert arrays to arraylist
        List<List<Integer>> sortedGrid = new ArrayList<>();

        for (int[] row : grid) {
            ArrayList<Integer> listRow = new ArrayList<>();
            for (int num : row) {
                listRow.add(num); // Adding each element to the inner ArrayList
            }
            listRow.sort(Integer::compareTo); // sort in ascending
            sortedGrid.add(listRow); // Adding the inner ArrayList to the outer ArrayList
        }


        while (!sortedGrid.get(0).isEmpty()) {
            int maxOfRemoved = 0;

            for (List<Integer> row : sortedGrid) {

                // removed the last ele in the sorted arr
                int removed = row.remove(row.size() - 1);
                maxOfRemoved = Math.max(removed, maxOfRemoved);
            }

            answer += maxOfRemoved;
        }

        return answer;

    }

    public static void main(String[] args) {


        int[][] grids = {{1, 2, 4}, {3, 3, 1}};

        System.out.println(deleteGreatestValue(grids));

    }
}
