package com.problems.easy.Arrays;

/**
 * Here the problems is to find that
 * Given an array of strings patterns
 * and a string word,return the number
 * of strings in patterns that exist as
 * a substring in word.
 * A substring is a contiguous sequence of characters within a string
 * <p>
 * Input: patterns = ["a","abc","bc","d"], word = "abc"
 * Output: 3
 * <p/>
 */
public class NumOfStrings {

    public static int numOfStrings(String[] patterns, String word) {

        // check the validation
        if (patterns.length == 0 || word.isBlank()) {
            return 0;
        }

        int count = 0;
        for (String pattern : patterns) {

            if (word.contains(pattern)) {
                count += 1;
            }
        }

        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {

        // Create a arr and word
        String[] patterns = {"a", "b", "c"};
        String word = "aaaaabbbbb";

        numOfStrings(patterns, word);
    }
}

