package com.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Here the problems is to find the
 * uncommon word in the string and
 * return the Array of uncommon string
 * you are given s1 and s2 both String
 * 
 * Input: s1 = "this apple is sweet", s2 = "this apple is sour"
 * Output: ["sweet","sour"]
 * 
 */
public class UnCommonFromSentences {

    // create a sepreate static method
    public static String[] uncommonFromSentences(String s1, String s2) {

        if (s1.isEmpty() && s2.isEmpty()) {
            return new String[0];
        }

        // convert the string to array
        String[] firstStr = s1.split(" ");
        String[] secondStr = s2.split(" ");

        // we can solve using hashmap
        Map<String, Integer> wordCount = new HashMap<>();

        for (String str : firstStr) {
            wordCount.put(str, wordCount.getOrDefault(str, 0) + 1);
        }

        for (String str : secondStr) {
            wordCount.put(str, wordCount.getOrDefault(str, 0) + 1);
        }

        // now we have to find the
        List<String> uncommonWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uncommonWords.add(entry.getKey());
            }
        }

        return uncommonWords.toArray(new String[0]);
    }

    public static void main(String[] args) {

        String s1 = "this apple is sweet";
        String s2 = "this apple is sour";

        System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
        

    }

}
