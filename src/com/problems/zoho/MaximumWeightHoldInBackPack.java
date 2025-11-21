package com.problems.zoho;

public class MaximumWeightHoldInBackPack {


    public static int maximizeBackpackValue(int N, int W, int[] weights, int[] values) {

        if (N <= 0 || W <= 0 || weights.length != values.length || weights.length == 0) {
            return 0;
        }

        int maxValue = 0;

        for (int i = 0; i < N; i++) {
            // this condition for vanthu single item match ana
            if (weights[i] <= W) {
                maxValue = Math.max(maxValue, values[i]);
            }

            // this loop for check the both values
            for (int j = i + 1; j < N; j++) {

                int totalWeight = weights[i] + weights[j];
                if (totalWeight <= W) {
                    int currentValues = values[i] + values[j];
                    maxValue = Math.max(maxValue, currentValues);
                }
            }
        }

        return maxValue;
    }

    public static void main(String[] args) {

        int N = 4;
        int W = 10;
        int[] w = {5, 4, 6, 3};
        int[] v = {10, 40, 30, 50};

        System.out.println(maximizeBackpackValue(N, W, w, v));

    }

}
