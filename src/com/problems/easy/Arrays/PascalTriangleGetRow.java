package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangleGetRow {

    // Create a sepreate method
    public static List<Integer> getRow(int rowIndex) {

        // check the validation 
        if (rowIndex < 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1); // added first row

        for (int i = 0; i < rowIndex; i++) {
            List<Integer> preRow = triangle.get(i); // get the pervious arr [1],[1,1] 

            // Create a new Array for create each time new row
            List<Integer> newRow = new ArrayList<>();

            // the first value must be 1 
            newRow.add(1);

            // Another loop for get pervious value and plus it and add new row
            for (int j = 0; j < preRow.size() - 1; j++) {
                newRow.add(preRow.get(j) + preRow.get(j + 1)); // it will get the value based on index
            }

            // now add the last ele 1
            newRow.add(1);
            triangle.add(newRow);
            System.out.println(triangle);
        }
        return triangle.get(rowIndex);

    }

    public static void main(String[] args) {
        int rowIndex = 1;
        System.out.println(getRow(rowIndex));
    }

}
