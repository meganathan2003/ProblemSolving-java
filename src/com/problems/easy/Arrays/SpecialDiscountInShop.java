package com.problems.easy.Arrays;

import java.util.Arrays;

public class SpecialDiscountInShop {


    public static int[] finalPrices(int[] prices) {

        if (prices.length == 0) {
            return new int[0];
        }

        int[] answer = new int[prices.length];

        for (int i = 0; i < prices.length; i++) {
            answer[i] = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]) {
                    answer[i] = prices[i] - prices[j];
                    break; 
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int[] prices = {8, 4, 6, 2, 3};
        System.out.println(Arrays.toString(finalPrices(prices)));
    }
}
