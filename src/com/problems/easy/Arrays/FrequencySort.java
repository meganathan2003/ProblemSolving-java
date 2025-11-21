package com.problems.easy.Arrays;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Here the problems to find the frequency word
 * in the array and if the array has duplicate
 * value sort them as the descending order
 *
 * @author meganathan
 */
public class FrequencySort {

    // create a static method
    public static int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        // count frequency of each number
        Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));

        // custom sort using strem
        return Arrays.stream(nums).boxed().sorted((a, b) -> !Objects.equals(map.get(a), map.get(b)) ? map.get(a) - map.get(b) : b - a).
                mapToInt(n -> n).toArray();
    }

    public static void main(String[] args) {

        // create a new array
        int[] nums = {1, 2, 2, 2, 2, 3, 3, 3};

        System.out.println(Arrays.toString(frequencySort(nums)));

    }

}
