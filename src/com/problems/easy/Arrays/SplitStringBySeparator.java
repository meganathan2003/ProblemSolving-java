package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SplitStringBySeparator {

    //    Create a static method
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
//    Validation

        if (words.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();

        for (String word : words) {
            // Split the word by the separator
            String[] parts = word.split(String.valueOf("\\" + separator));

            // Add non-empty strings to the result list
            for (String part : parts) {
                if (!part.isEmpty()) {
                    res.add(part);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {


        List<String> words = new ArrayList<>(List.of("one.two.three", "four.five", "six"));

        System.out.println(splitWordsBySeparator(words, '.'));
    }


}
