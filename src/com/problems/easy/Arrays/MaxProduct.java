package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Below the problems for find the max
 * product in two element in the array
 * and return the int that number
 *
 * @author meganathan
 * <p>
 * Input: nums = [3,4,5,2]
 * Output: 12
 */
public class MaxProduct {
    public int maxProduct(int[] nums) {
        int first = Integer.MIN_VALUE;
        System.out.println(first);
        int second = Integer.MAX_VALUE;
        System.out.println(second);
        for (int num : nums) {
            if (first < num) { //
                second = first;
                first = num;
            } else if (second < num) {
                second = num;
            }
        }
        return (first - 1) * (second - 1);

    }

    public static void main(String[] args) {
        // create a new array
        int[] arr = {1, 5, 4, 5};
        // create a obj
        MaxProduct maxProduct = new MaxProduct();
        System.out.println(maxProduct.maxProduct(arr));

    }
}
