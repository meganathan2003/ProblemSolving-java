package com.problems.easy.Arrays;

public class RemoveOuterParentheses {

    // create a static method
    public static String removeOuterParentheses(String s) {

        if (s.isEmpty()) {
            return "";

        }

        // (()())(())

        int counter = 0;
        int index = 0;
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                counter++;
            } else if (s.charAt(i) == ')') {
                counter--;
            }


            // check the counter is 0
            if (counter == 0) {
                res.append(s.substring(index + 1, i));
                index = i + 1;
            }


        }
        return res.toString();


        // Anotherr solution
//        StringBuilder result = new StringBuilder();
//        int balance = 0; // To track the balance of parentheses
//
//        for (char c : s.toCharArray()) {
//            if (c == '(') {
//                if (balance > 0) { // If balance > 0, it's not an outer parenthesis
//                    result.append(c);
//                }
//                balance++; // Increase balance for '('
//            } else if (c == ')') {
//                balance--; // Decrease balance for ')'
//                if (balance > 0) { // If balance > 0, it's not an outer parenthesis
//                    result.append(c);
//                }
//            }
//        }
//        return result.toString();
    }

    public static void main(String[] args) {

        String s = "(()())(())(()(()))";

        System.out.println(removeOuterParentheses(s));
    }
}
