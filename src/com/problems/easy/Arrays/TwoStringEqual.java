package com.problems.easy.Arrays;
/**
 * Below the code for find the two
 * string are equal or not
 *
 * @author meganathan
 */

class  Solution {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        if (word1.length != 0 && word2.length != 0) {
            String str1 = extractAlphabeticChars(word1);
            String str2 = extractAlphabeticChars(word2);
            return str1.equals(str2);
        } else {
            return false;
        }
    }

    private static String extractAlphabeticChars(String[] words) {
        StringBuilder builder = new StringBuilder(); // this is used for append the new string each time
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (Character.isAlphabetic(ch)) {
                    builder.append(ch);
                }
            }
        }
        System.out.println(builder);
        return builder.toString();
    }
}

public class TwoStringEqual {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};

        Solution solution = new Solution();
        boolean ans = Solution.arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }
}

