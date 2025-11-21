package com.problems.easy.Arrays;

public class ReversePrefix {

    // Create a static method
    public static String reversePrefix(String word, char ch) {

        // validation
        if (word.isEmpty()) {
            return "";
        }

        // Find the index number in String
        int index = word.indexOf(ch);

        // now we have to substring the word
        String subString = word.substring(0, index + 1);
        String remainWord = word.substring(index + 1);

        StringBuilder res = new StringBuilder();

        // loop for reverse the string
        for (int i = subString.length() - 1; i >= 0; i--) {
            res.append(subString.charAt(i));
        }

        // Finally append the remaining word
        return res.append(remainWord).toString();
    }

    public static void main(String[] args) {

        String word = "abcdefd";
        char ch = 'd';

        System.out.println(reversePrefix(word, ch));
    }
}
