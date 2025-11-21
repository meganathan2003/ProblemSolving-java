package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Here the problems is find
 * to Given an array of strings arr, and an
 * integer k, return the kth distinct
 * string present in arr. If there are fewer
 * than k distinct strings, return an
 * empty string "".
 * 
 * Note that the strings are considered in
 * the order in which they appear in the
 * array.
 * 
 * Input: arr = ["d","b","c","b","c","a"], k = 2
 * Output: "a"
 */
public class KthDistinct {

    // Create a static sepreate array
    public static String kthDistinct(String[] arr, int k) {
        if (arr.length == 0 || k <= 0) {
            return "";
        }

        Map<String, Integer> countMap = new HashMap<>();

        // loop for add the value in countMap
        for (String str : arr) {
            countMap.put(str, countMap.getOrDefault(str, 0) + 1);
        }

        // Create a new Arraylist
        List<String> uniquStrings = new ArrayList<>();

        for (String str : arr) {
            if (countMap.get(str) == 1) { // .get method return the values of the map
                uniquStrings.add(str);
            }
        }
        if (k > uniquStrings.size()) {
            return "";
        }

        return uniquStrings.get(k - 1);

    }

    public static void main(String[] args) {

        String[] arr = { "apple", "banana", "apple", "orange", "banana" };
        int k = 1;
        System.out.println(kthDistinct(arr, k));
    }

}
