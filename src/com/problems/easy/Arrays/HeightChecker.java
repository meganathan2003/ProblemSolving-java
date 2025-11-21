package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Below the problems for find the
 * height in the student A school is trying
 * to take an annual photo of all the students.
 * The students are asked to stand in a single file line
 * in non-decreasing order by height. Let this ordering
 * be represented by the integer array expected where
 * expected[i] is the expected height of the ith student in line
 *
 * @author meganathan
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 */
public class HeightChecker {

    // Create a new method
    public int heightChecker(int[] height) {

        int n = height.length;
        int[] heightArr = new int[height.length];

        // We can use Arrays.copyof method also using loop
        for (int i = 0; i < n; i++) {
            heightArr[i] = height[i];
        }
        Arrays.sort(height);
        int doesnotMatch = 0;
        for (int i = 0; i < n; i++) {
            if (heightArr[i] != height[i]) {
                doesnotMatch++;
            }
        }
        return doesnotMatch;
    }

    public static void main(String[] args) {

        // Create a new array
        int[] arr = {1, 1, 4, 2, 1, 3};

        //  Create a new obj
        HeightChecker heightChecker = new HeightChecker();
        System.out.println(heightChecker.heightChecker(arr));

    }
}
