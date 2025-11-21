package com.problems.easy.Arrays;

/**
 * Below the code for find the
 * count triplets in the array and
 * return the array
 *
 * @author meganathan
 * Input: arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3
 * Output: 4
 */
public class CountGoodTriplets {

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        int n = arr.length;
        int iCount = 0, jCount = 0, kCount = 0;

        // below the loop for minus the number
        for (int i = 0; i < n - 2; i++) { // it reduce the loops times
            iCount++;
            for (int j = i + 1; j < n - 1; j++) { // It omited the last one element
                jCount++;
                for (int k = j + 1; k < n; k++) { // it check all last elements
                    kCount++;
                    if (Math.abs(arr[i] - arr[j]) <= a &&
                            Math.abs(arr[j] - arr[k]) <= b &&
                            Math.abs(arr[i] - arr[k]) <= c) {
                        {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println("i loop runs: " + iCount + " times");
        System.out.println("j loop runs: " + jCount + " times");
        System.out.println("k loop runs: " + kCount + " times");
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 1, 9, 7};
        int a = 7;
        int b = 2;
        int c = 3;

        System.out.println("Number of good triplets: " + countGoodTriplets(arr, a, b, c));  // Output: 4
    }
}

