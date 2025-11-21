package com.problems.easy.Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class UniqueNumberOcc {

    // Create a Seprate method
    public static boolean uniqueOccurrences(int[] arr) {

        if (arr.length == 0) {
            return false;
        }

        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

        }

        HashSet<Integer> occurrenceSet = new HashSet<>(countMap.values());

        return occurrenceSet.size() == countMap.size();
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3 };
        System.out.println(uniqueOccurrences(arr));
    }

}
