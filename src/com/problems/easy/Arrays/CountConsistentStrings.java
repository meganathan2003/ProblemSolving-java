package com.problems.easy.Arrays;

/**
 * Below the code for find the
 * consitent String and return
 * the number
 * <p>
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 */
public class CountConsistentStrings {

    // below the code for separate method
    public int countConsistentStrings(String allowed, String[] words) {
        if (!allowed.isEmpty() && words.length != 0) {
            int count = 0;
            for (String word : words) {
                if (isConsistent(word, allowed)) {
                    count++;
                }
            }
            return count;
        }
        return 0;
    }

    // Below the code for create a private method
    private static boolean isConsistent(String word, String allowed) {
        for (char c : word.toCharArray()) {
            System.out.println(allowed.indexOf(c));
            if (allowed.indexOf(c) == -1) { //index of method return the index of the char
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        // create a obj
        CountConsistentStrings consistentStrings = new CountConsistentStrings();
        System.out.println(consistentStrings.countConsistentStrings(allowed, words));

    }
}
