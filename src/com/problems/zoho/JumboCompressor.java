package com.problems.zoho;

import java.util.ArrayList;
import java.util.List;


/**
 * Day 28
 *
 * @author Meganathan
 */

public class JumboCompressor {


    public static List<String> compressWords(List<String> words) {

        List<String> compressWords = new ArrayList<>();

        if (words.isEmpty()) {
            return new ArrayList<>();
        }

        for (String word : words) {

            if (checkCompressWord(word.toLowerCase())) {
                compressWords.add("JUMBO");
            } else {
                compressWords.add(word);
            }
        }
        return compressWords;
    }

    // Helper method for check the compress All char in words
    private static boolean checkCompressWord(String word) {
        String sequence = "jumbo";
        int index = 0;

        for (char ch : word.toCharArray()) {

            if (ch == sequence.charAt(index)) {
                index++;
            }

            // ella char uh seq oda match achu means true
            if (index == sequence.length()) {
                return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {

        List<String> words = new ArrayList<>(List.of("jumbo", "robot", "aubjuvombo"));

        System.out.println(compressWords(words));

    }
}
