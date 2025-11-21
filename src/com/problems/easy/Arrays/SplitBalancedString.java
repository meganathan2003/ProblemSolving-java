package com.problems.easy.Arrays;

public class SplitBalancedString {

    // Create a static method
    public static int balancedStringSplit(String s) {

        if (s.isEmpty()) {
            return 0;
        }
        int count = 0;   // Count of balanced substrings
        int balance = 0; // Tracks the balance between 'R' and 'L'

        for (char ch : s.toCharArray()) {

            // Increment or decrement balance
            balance += (ch == 'R') ? 1 : -1;

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        String s = "RLRRLLRLRL";

        System.out.println(balancedStringSplit(s));
    }
}
