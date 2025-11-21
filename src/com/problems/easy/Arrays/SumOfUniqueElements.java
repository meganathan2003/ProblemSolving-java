package com.problems.easy.Arrays;

/*
  Find the unique element in the
  array and the sum it and return
  <p>
  @author Meganathan
  </p>
 */

import java.util.HashMap;
import java.util.Map;

public class SumOfUniqueElements {

    public static int sumOfUnique(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Map<Integer, Integer> freqNum = new HashMap<>();

        for (int num : nums) {
            freqNum.put(num, freqNum.getOrDefault(num, 0) + 1);
        }

        int totalCount = 0;

        for (Map.Entry<Integer, Integer> entry : freqNum.entrySet()) {

            if (entry.getValue() == 1) {

                totalCount += entry.getKey();
            }

        }

        return totalCount;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2};
        System.out.println(sumOfUnique(nums));

    }
}
