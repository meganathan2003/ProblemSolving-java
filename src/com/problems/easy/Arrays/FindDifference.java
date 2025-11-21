package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * Here is the problem to find that
 * Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
 * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.
 * Note that the integers in the lists may be returned in any order.
 * </p>
 *
 * @author meganathan
 */
public class FindDifference {

    // create a static method
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        // need to check the validation
        if (nums1.length == 0 || nums2.length == 0) {
            return new ArrayList<>();
        }

        // Create a new Array list
        List<List<Integer>> res = new ArrayList<>(2);
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());


        // this loop for check the nums1
        for (int value : nums1) {
            // We have to set the flag
            boolean check = true;
            for (int k : nums2) {
                if (value == k) { // 1 - 0
                    check = false;
                    break;
                }
            }
            if (check) {
                res.get(0).add(value);
            }
        }


        // This loop is for nums2
        for (int j : nums2) {
            // This is for nums 2 check
            boolean num2Check = true;
            for (int k : nums1) {
                if (j == k) {
                    num2Check = false;
                    break;
                }
            }
            if (num2Check) {
                res.get(1).add(j);
            }
        }

        return res;

    }

    public static void main(String[] args) {
        // Create a new array
        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        System.out.println(findDifference(nums1, nums2));
    }
}
