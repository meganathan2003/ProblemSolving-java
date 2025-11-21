package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Here the problems is to
 * find the anagram like both
 * string is same but letters
 * are different
 * 
 * @author megaanathan
 */

public class AnagramChecker {

    // create a static method
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.isEmpty() || s2.isEmpty()) {
            return false;
        }

        // conver the chararry
        char[] words1 = s1.toCharArray();
        char[] words2 = s2.toCharArray();

        Arrays.sort(words1);
        Arrays.sort(words2);

        return Arrays.equals(words1, words2);

    }

    public static void main(String[] args) {

        // Creae a new String
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(areAnagrams(s1, s2));

    }
}
