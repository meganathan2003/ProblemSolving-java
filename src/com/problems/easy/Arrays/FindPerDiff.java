package com.problems.easy.Arrays;

public class FindPerDiff {

    //    Create a static method
    public static int findPermutationDifference(String s, String t) {

        // validation
        if (s.isEmpty() || t.isEmpty()) {
            return 0;
        }

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            for (int j = 0; j < t.length(); j++) {
                if (currentChar == t.charAt(j)) {

                    // Get the index no
                    res += Math.abs(i - j);
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {

        String s = "abc";
        String t = "bac";

        System.out.println(findPermutationDifference(s, t));

    }
}
