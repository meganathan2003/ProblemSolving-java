package com.problems.easy.Arrays;

import java.util.*;

/**
 * Below the problem for find the intersection
 * value in both array and return the array
 * in common count values
 *
 * @author meganathan
 * Input: nums1 = [2,3,2], nums2 = [1,2]
 * <p>
 * Output: [2,1]
 */

public class FindIntersectionValues {

    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num); // [4,3,2,1]
        }

        for (int num : nums2) {
            set2.add(num);
        }

        int count1 = 0;
        for (int num : nums1) {
            if (set2.contains(num)) {
                count1++;
            }
        }

        int count2 = 0;
        for (int num : nums2) {
            if (set1.contains(num)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }

    public static void main(String[] args) {
        // create a two array
        int[] nums1 = {4, 3, 2, 3, 1};
        int[] nums2 = {2, 2, 5, 2, 3, 6};

        //Create a obj
        FindIntersectionValues intersectionValues = new FindIntersectionValues();
        System.out.println(Arrays.toString(intersectionValues.findIntersectionValues(nums1, nums2)));
    }
}

