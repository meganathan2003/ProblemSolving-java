package com.problems.zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplyMagnificationToScene {

    public static List<List<Integer>> applyMagnificationToScene(List<List<Integer>> scene, int factor) {

        if (scene.isEmpty() || factor <= 0) {
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();

        for (List<Integer> integers : scene) {
            // each time create a new arr and
            List<Integer> newRow = new ArrayList<>();
            for (Integer integer : integers) {
                newRow.add(integer * factor);
            }
            res.add(newRow); // add to res list
        }

        return res;
    }

    public static void main(String[] args) {

        List<List<Integer>> arr = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2, 3)),
                new ArrayList<>(Arrays.asList(4, 5, 6)),
                new ArrayList<>(Arrays.asList(7, 8, 9))
        ));
        System.out.println(arr);
        int factor = 3;
        System.out.println(applyMagnificationToScene(arr, factor));
    }
}
