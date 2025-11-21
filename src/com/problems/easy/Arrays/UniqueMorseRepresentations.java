package com.problems.easy.Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Below the code for find the
 * code words of the string and
 * return the distinct string count
 * <p>
 * Input: words = ["gin","zen","gig","msg"]
 * Output: 2
 */
public class UniqueMorseRepresentations {

    public int uniqueMorseRepresentations(String[] words) {
        if (words.length != 0) {
            String[] codeWords = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                    "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                    "--.." };
            String[] strArr = new String[words.length];
            int i = 0;
            for (String word : words) {
                char[] charArr = word.toCharArray(); // change toCharArr
                String concat = "";
                for (int c = 0; c < charArr.length; c++) {
                    int asciiValue = (int) charArr[c] - 96; // to get the alphabet order in small 97 - 96 = 1
                    concat += codeWords[asciiValue - 1];
                }
                strArr[i] = concat;
                i++;
            }
            // Write the code for get the transformation
            // Count distinct transformations
            Set<String> uniqueTransformations = new HashSet<>(Arrays.asList(strArr));
            return uniqueTransformations.size();
        }
        return 0;
    }

    /**
     * @param args Below the code for anthoer efficennt method
     *             class Solution {
     *             public int uniqueMorseRepresentations(String[] words) {
     *             <p>
     *             String[] arr= new
     *             String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
     *             Set<String> set = new HashSet<>();
     *             for(String word: words) {
     *             set.add(transform(word, arr));
     *             }
     *             return set.size();
     *             }
     *             <p>
     *             public String transform(String word, String[] arr) {
     *             StringBuilder sb = new StringBuilder();
     *             for(char c: word.toCharArray())
     *             sb.append(arr[(int)c-97]);
     *             return sb.toString();
     *             }
     *             }
     */

    public static void main(String[] args) {
        String[] words = { "gin", "zen", "gig", "msg" };
        // create the obj
        UniqueMorseRepresentations morseRepresentations = new UniqueMorseRepresentations();
        System.out.println(morseRepresentations.uniqueMorseRepresentations(words));
    }
}