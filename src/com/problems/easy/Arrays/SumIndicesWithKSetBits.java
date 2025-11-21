package com.problems.easy.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Below the code for find the binary set
 * bits how many 1 and in the k bits
 *
 * @author meganathan
 */

public class SumIndicesWithKSetBits {
    // below the separate function for good practice
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        if (!nums.isEmpty()) {
            int totalCount = 0;
            for (int i = 0; i < nums.size(); i++) {
                String bin = Integer.toBinaryString(i);
                int setBits = 0;
                for (char c : bin.toCharArray()) {
                    if (c == '1') {
                        setBits++;
                    }
                }
                if (setBits == k) {
                    totalCount += nums.get(i);
                }
            }
            return totalCount;
        }
        return 0;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        int k = 2;
        SumIndicesWithKSetBits indicesWithKSetBits = new SumIndicesWithKSetBits();
        System.out.println(indicesWithKSetBits.sumIndicesWithKSetBits(nums, k));
    }
}