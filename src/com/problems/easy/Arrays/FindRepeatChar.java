package com.problems.easy.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the repeated char in the string s = aaaabbbccc Output: a4b3c3
 */
public class FindRepeatChar {

    // Create a new method
    public static String findRepeatedChar(String s) {

        if (s.isEmpty()) {
            return "";
        }
        char[] charArr = s.toCharArray();
        Map<Character, Integer> charCountMap = new HashMap<>();

        // create a new String builder obj
        StringBuilder res = new StringBuilder();

        for (char c : charArr) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            res.append(entry.getKey());
            res.append(entry.getValue());
        }

        return res.toString();
    }

    public static void main(String[] args) {

        String s = "aaaabbbccc";
        System.out.println(findRepeatedChar(s));
    }
}
