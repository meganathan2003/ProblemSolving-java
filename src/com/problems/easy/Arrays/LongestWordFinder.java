package com.problems.easy.Arrays;

/**
 * Here the problems is find the
 * longest word in the string
 * 
 * @author meganathan
 */
public class LongestWordFinder {

    // create a new static method
    public static String longestWordFinder(String s) {
        if (s.isEmpty()) {
            return "";
        }

        // now we have to split the array
        String[] spiltArr = s.split(" ");

        int length = 0;
        for (int i = 0; i < spiltArr.length; i++) {
            if (spiltArr[i].length() >= length) {
                length = spiltArr[i].length();
            }
        }
        return spiltArr[length];
    }

    public static void main(String[] args) {
        String sentence = "Find the longest word in this sentence";
        System.out.println(longestWordFinder(sentence));
    }
}
