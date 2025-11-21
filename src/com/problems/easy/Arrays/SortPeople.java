package com.problems.easy.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Below the problem are sort the
 * name descending order using another
 * nums array
 *
 * @author meganathan
 * Input: names = ["Mary","John","Emma"], heights = [180,165,170]
 * Output: ["Mary","Emma","John"]
 */
public class SortPeople {

    // Create a new method
    public String[] sortPeople(String[] names, int[] heights) {

        int k = 0;
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            map.put(heights[i], names[i]); // it stores the key and value
        }
        System.out.println(map);
        Arrays.sort(heights);
        for (int i = heights.length - 1; i >= 0; i--) {
            names[k++] = map.get(heights[i]);
        }
        return names;
    }

    public static void main(String[] args) {

        // Create a new array
        String[] name = {"Alice", "Bob", "Bob"};
        int[] heights = {155, 185, 150};

        // Crate a new obj
        SortPeople people = new SortPeople();
        System.out.println(Arrays.toString(people.sortPeople(name, heights)));
    }
}
