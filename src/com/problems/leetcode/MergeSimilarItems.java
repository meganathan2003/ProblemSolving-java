package com.problems.leetcode;

import java.util.*;

public class MergeSimilarItems {

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {

        if (items1.length == 0 || items2.length == 0) {
            return new ArrayList<>();
        }


        Map<Integer, Integer> map = new HashMap<>();

        // This loop for items 1
        for (int[] item : items1) {
            map.put(item[0], item[1]);
        }

        // This is for items 2
        for (int[] item : items2) {
            map.put(item[0], map.getOrDefault(item[0], 0) + item[1]);
        }


        // Here you have to change the map to arraylist
        List<List<Integer>> ret = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            ret.add(List.of(entry.getKey(), entry.getValue()));
        }

        ret.sort(Comparator.comparing(o -> o.get(0)));

        return ret;

    }

    public static void main(String[] args) {

        int[][] items1 = {
                {1, 1},
                {4, 5},
                {3, 8}
        };

        int[][] items2 = {
                {3, 1},
                {1, 5}
        };

        System.out.println(mergeSimilarItems(items1, items2));
    }
}
