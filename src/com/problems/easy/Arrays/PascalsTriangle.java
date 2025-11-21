package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    // create a new method
    public static List<List<Integer>> generatePascalsTriangle(int numRows) {

        // check the validation
        if (numRows <= 0) {
            return new ArrayList<>();
        }
        // Create a new array list for triangle And add first row
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1); // added first row

        for (int i = 1; i < numRows; i++) {
            List<Integer> preRow = triangle.get(i - 1); // get the pervious arr [1],[1,1] 

            // Create a new Array for create each time new row
            List<Integer> newRow = new ArrayList<>();

            // the first value must be 1 
            newRow.add(1);

            // Another loop for get pervious value and plus it and add new row
            for (int j = 1; j < preRow.size(); j++) {
                newRow.add(preRow.get(j - 1) + preRow.get(j)); // it will get the value based on index
            }

            // now add the last ele 1
            newRow.add(1);
            triangle.add(newRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 0;
        List<List<Integer>> triangle = generatePascalsTriangle(numRows);
        System.out.println(triangle);
    }

}
