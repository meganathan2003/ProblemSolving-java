package com.problems.leetcode;

import java.util.Arrays;

public class TakeGiftsFromRichestPile {

    // Create a static method
    public static long pickGifts(int[] gifts, int k) {

//         validation
        if (gifts.length == 0 || k < 0) {
            return 0;
        }

        for (int i = 0; i < k; i++) {
            // Find the index of the pile with the maximum gifts
            int maxIndex = 0;
            for (int j = 1; j < gifts.length; j++) {
                if (gifts[j] > gifts[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Reduce the pile with the maximum number of gifts
            int sqrt = (int) Math.floor(Math.sqrt(gifts[maxIndex]));
            System.out.println("SQT " + sqrt + " for index " + maxIndex);
            gifts[maxIndex] = sqrt; // replace with sqrt, not subtract
        }

        // Sum up all gifts remaining after k operations
        int totalNum = 0;
        for (int gift : gifts) {
            totalNum += gift;
        }
        return totalNum;


    }

    public static void main(String[] args) {

        int[] gifts = {25, 64, 9, 4, 100};
        int k = 4;

        System.out.println(pickGifts(gifts, k));
    }
}
