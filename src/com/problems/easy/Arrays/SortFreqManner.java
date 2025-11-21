package com.problems.easy.Arrays;

import java.util.*;

public class SortFreqManner {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        Integer[] arr = new Integer[n];  // Use Integer[] instead of int[]

        // Reading input array
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }

        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort the array by frequency, and by value if frequency is the same
        Arrays.sort(arr, (a, b) -> {
            int freqA = freqMap.get(a);
            System.out.println("Freq A " + freqA);
            int freqB = freqMap.get(b);

            if (freqA != freqB) {
                return Integer.compare(freqA, freqB); // Sort by frequency
            } else {
                return Integer.compare(a, b); // If frequencies are the same, sort by value
            }
        });

        Set<Integer> printed = new HashSet<>();
        for (int num : arr) {
            if (!printed.contains(num)) {
                System.out.print(num + " ");
                printed.add(num);
            }
        }
    }
}
