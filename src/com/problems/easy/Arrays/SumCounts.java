package com.problems.easy.Arrays;

import java.util.*;
import java.util.concurrent.LinkedTransferQueue;

/**
 * Below the problem for find the subarray and
 * multiply it and return the integer
 *
 * @author meganathan
 * Input: nums = [1,2,1]
 * Output: 15
 */
public class SumCounts {

    // create a new method
    public int sumCounts(List<Integer> nums) {
        if (!nums.isEmpty()) {
            int n = nums.size();
            int sum = 0;

            for (int i = 0; i < n; i++) {
                Set<Integer> distinctSet = new HashSet<>();
                for (int j = i; j < n; j++) {
                    // [1,2,1]
                    distinctSet.add(nums.get(j)); // get the number from nums
                    int distinctCount = distinctSet.size(); // length
                    sum += distinctCount * distinctCount; // this will square the count of the element
                }
            }

            return sum;
        }
        return 0;
    }

    public static void main(String[] args) {
        // create a new arraylist
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1));

        // Create a obj
        SumCounts sumCounts = new SumCounts();
        System.out.println(sumCounts.sumCounts(list));
    }
}
