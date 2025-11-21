package com.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainChar {

    //    Create a static method
    public static List<Integer> findWordsContaining(String[] words, char x) {

        // Validation
        if (words.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[i].charAt(j) == x) {
                    res.add(i);
                    break;
                }
            }
        }

        return res;

    }

    public static void main(String[] args) {

        String[] words = {"leet", "code"};
        char x = 'e';

        System.out.println(findWordsContaining(words, x));

    }
}
