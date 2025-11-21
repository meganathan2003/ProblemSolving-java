package com.problems.leetcode;

public class JewelsAndStones {

    // Create a static method
    public static int numJewelsInStones(String jewels, String stones) {

        // Validation
        if (jewels.isEmpty() || stones.isEmpty()) {
            return 0;
        }


        int count = 0;

        for (char ch : stones.toCharArray()) {
            for (char jewelsCh : jewels.toCharArray()) {
                if (jewelsCh == ch) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {


        String jewels = "aA";
        String stones = "aAAbbbb";

        System.out.println(numJewelsInStones(jewels, stones));
    }
}
