package com.problems.easy.Arrays;

public class FaultyKeyboard {

    // Create a static method
    public static String finalString(String s) {
        if (s.isEmpty()) {
            return "";
        }
        StringBuilder res = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch != 'i') {
                res.append(ch);
            } else {
                res.reverse();
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "string";

        System.out.println(finalString(s));
    }
}
