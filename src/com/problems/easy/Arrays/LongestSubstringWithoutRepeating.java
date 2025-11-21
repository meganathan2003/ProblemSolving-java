package com.problems.easy.Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Here the problems are asked in the top based
 * product company freshworks and the problems
 * is to find the longest substring without
 * repeating the array and return the integer
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * 
 */
public class LongestSubstringWithoutRepeating {

    // create a private static method
    private static int lengthOfLongestSubstring(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        // Create a map for find the repeat char
        Set<Character> CharSet = new HashSet<>();
        System.out.println(CharSet);

        // intitialize the pointer
        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Here we have to use wile loop
            while (CharSet.contains(s.charAt(right))) {
                CharSet.remove(s.charAt(left));
                left++;
            }

            // if no ele are there we have to add the elements in the array
            CharSet.add(s.charAt(right));

            // update the max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {

        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);

    }

}
