package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * The problem is to find the
 * stable mountains in the array
 * and return the indices of stable mountains
 * based on the given threshold.
 * <p>
 * A mountain at index `i` is stable if the mountain
 * at index `i-1` has a height greater than the threshold.
 *
 * @author meganathan
 */
public class StableMountains {

    // Create a static method
    public static List<Integer> stableMountains(int[] height, int threshold) {

        List<Integer> res = new ArrayList<>();

        // Loop from the second mountain to check if the previous mountain is greater than the threshold
        for (int i = 1; i < height.length; i++) {
            if (height[i - 1] > threshold) {
                res.add(i);  // Add the current index, i.e., index of the stable mountain
            }
        }
        return res;

    }

    public static void main(String[] args) {

        // Create a height array
        int[] arr = {10, 1, 10, 1, 10};
        int threshold = 3;
        System.out.println(stableMountains(arr, threshold));  // Output: [1, 3, 4]
    }
}
