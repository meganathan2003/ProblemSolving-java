package com.problems.easy.Arrays;

/**
 * Below the code for find the
 * subarray and return the sum of
 * odd length
 */
class OddLengthSubarraysSum {
    public static int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int totalSum = 0;

        for (int i = 0; i < n; i++) {
            // Calculate the total number of subarrays including arr[i]
            int totalSubarrays = (i + 1) * (n - i);
            // Calculate the number of odd-length subarrays including arr[i]
            int oddSubarrays = (totalSubarrays + 1) / 2;
            // Contribution of arr[i] to the sum of all odd-length subarrays
            totalSum += arr[i] * oddSubarrays;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 3};
        int result = sumOddLengthSubarrays(arr);
        System.out.println(result);  // Output: 58
    }
}
