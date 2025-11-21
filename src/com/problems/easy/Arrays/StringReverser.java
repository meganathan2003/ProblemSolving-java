package com.problems.easy.Arrays;

/**
 * Here the problem you're given
 * the string you have to reverse
 * the string
 * 
 * 
 * @author meganathan
 */
public class StringReverser {

    // Create a sepreate static method
    public static String stringReverser(String s) {
        if (s.isEmpty()) {
            return "";
        }

        String reversed = "";

        // loop for reverse the string
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }

        return reversed;

    }

    public static void main(String[] args) {
        // create a string
        String str = "hello";
        System.out.println(stringReverser(str));
    }
}
