package com.problems.easy.Arrays;

import java.util.*;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
        int[] arr2 = {2, 1, 4, 3, 9, 6};


        System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
    }

    //    Create a static method
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        // Validation
        // Create a frequency map to count occurrences of elements in arr1
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr1) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Create a result list to store sorted elements
        List<Integer> result = new ArrayList<>();

        // Add elements of arr2 in the same order, using the frequency map
        for (int num : arr2) {
            if (freqMap.containsKey(num)) {
                int count = freqMap.get(num);
                for (int i = 0; i < count; i++) {
                    result.add(num);
                }
                freqMap.remove(num); // Remove from map after processing
            }
        }

        // Process remaining elements not in arr2
        List<Integer> remaining = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            for (int i = 0; i < count; i++) {
                remaining.add(num);
            }
        }

        // Sort remaining elements in ascending order and add to result
        Collections.sort(remaining);
        result.addAll(remaining);

        // Convert result list back to array
        int[] sortedArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            sortedArray[i] = result.get(i);
        }

        return sortedArray;
    }

}
