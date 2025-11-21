package com.problems.zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Day 20
 *
 * @author Meganathan
 */
public class FindLongestWordInString {

    public static String findLongestWord(List<String> words, char ch) {

        if (words.isEmpty() || !Character.isLetter(ch)) {
            return "";
        }

        String longestWord = "";

        for (String word : words) {
            if (word.charAt(0) == ch && word.length() > longestWord.length()) {
                longestWord = word; // longest word eh update panurom
            }
        }

        return longestWord;
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("quest", "voyage", "map", "horizon"));
        char ch = 'a';

        System.out.println(findLongestWord(words, ch));
    }
}
