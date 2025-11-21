package com.problems.easy.Arrays;

import java.util.Arrays;

public class SortIntegerByBits {

    public static int[] sortByBits(int[] arr) {
        // Convert int[] to Integer[] for sorting with a comparator
        Integer[] integerArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        // Sort the Integer array with custom comparator
        Arrays.sort(integerArray, (a, b) -> {
            int bitsA = Integer.bitCount(a);
            int bitsB = Integer.bitCount(b);

            if (bitsA != bitsB) {
                return bitsA - bitsB;
            }
            return a - b;
        });

        return Arrays.stream(integerArray).mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Output: " + Arrays.toString(sortByBits(arr1)));

        int[] arr2 = {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        System.out.println("Output: " + Arrays.toString(sortByBits(arr2)));
    }
}
