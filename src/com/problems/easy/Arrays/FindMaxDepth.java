package com.problems.easy.Arrays;

public class FindMaxDepth {
    // create a static method
    public static int maxDepth(String s) {
        if (s.isEmpty()) {
            return 0;
        }


        int current_depth = 0;
        int max_depth = 0;


        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                current_depth++;
                max_depth = Math.max(max_depth, current_depth);  // Update max depth
            } else if (ch == ')') {
                current_depth--;  // Decrease depth when encountering ')'
            }
        }

        return max_depth;
    }

    public static void main(String[] args) {
        String s = "(1+(2*3)+((8)/4))+1";

        System.out.println(maxDepth(s));
    }
}
