package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Below the problems are find the
 * max product number and returm the
 * max product choose the random indcies and
 * find the product diff
 *
 * @author meganathan
 * Input: nums = [5,6,2,7,4]
 * Output: 34
 */
public class MaxProductDifference {

    public int maxProductDifference(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        // add the element arr to list
        for (int num : nums) {
            arr.add(num);
        }
        Collections.sort(arr);

        int firstMinValue = arr.get(0);
        int secondMinValue = arr.get(1);
        int firstLargeValue = arr.get(arr.size() - 2);
        int secondLargeValue = arr.get(arr.size() - 1);

        return (firstLargeValue * secondLargeValue) - (firstMinValue * secondMinValue);

    }

    public static void main(String[] args) {
        // create a array
        int[] arr = {4, 2, 5, 9, 7, 4, 8};
        // create a obj
        MaxProductDifference productDifference = new MaxProductDifference();
        System.out.println(productDifference.maxProductDifference(arr));

    }
}
