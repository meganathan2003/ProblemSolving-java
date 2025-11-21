package com.problems.easy.Arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Below the code for find the non repeating char in the string and return the
 * string
 *
 * @author meganathan
 *
 */
public class NonRepeatingChar {

    public Character findFirstNonRepeatedCharacter(String str) {

        Map<Character, Integer> charMap = new HashMap<>();

        // set the all characeter into the map
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
            }
        }

        // Step 2: Find the first non-repeated character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ' && charMap.get(ch) == 1) {
                return ch;
            }
        }
        return null;

    }

    public static void main(String[] args) {

        // Create a new method
        NonRepeatingChar nonRepeatingChar = new NonRepeatingChar();
        String str = "Mathivanan";
        System.out.println(nonRepeatingChar.findFirstNonRepeatedCharacter(str));

    }

}
