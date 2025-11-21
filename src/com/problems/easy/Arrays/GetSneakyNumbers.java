package com.problems.easy.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Here is the problem to find that
 * In the town of Digitville, there was
 * a list of numbers called nums containing
 * integers from 0 to n - 1. Each number
 * was supposed to appear exactly once in
 * the list, however, two mischievous
 * numbers sneaked in an additional time,
 * making the list longer than usual.
 * <p>
 * you have to return the two same number
 * in array
 *
 * @author meganathan
 */

public class GetSneakyNumbers {

    // Create a static method
    public static int[] getSneakyNumbers(int[] nums) {

        if (nums.length == 0) {
            return new int[0];
        }

        // create a hash map
        Map<Integer, Integer> map = new HashMap<>();
        // Create a Array list
        int[] res = new int[2];
        int index = 0;

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        System.out.println(map); // print the map

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                res[index++] = entry.getKey();
                if (index == 2) break; // Only need two numbers
            }
        }
        return res;

    }

    public static void main(String[] args) {
        // Create a new array

        int[] arr = {0, 1, 1, 0};

        System.out.println(Arrays.toString(getSneakyNumbers(arr)));

    }
}