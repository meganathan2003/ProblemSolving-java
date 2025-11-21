package com.problems.leetcode;

import java.util.Stack;

public class DecodingString {

    public static String decodeString(String s) {

        if (s.isEmpty()) {
            return "";
        }

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder current = new StringBuilder();


        int k = 0;

        for (char ch : s.toCharArray()) {

            if (Character.isDigit(ch)) {

                k = k * 10 + (ch - '0');
            } else if (ch == '[') {

                countStack.push(k);
                resultStack.push(current);

                k = 0;
                current = new StringBuilder();

            } else if (ch == ']') {

                int repeatedTimes = countStack.pop();
                StringBuilder decodedSegment = resultStack.pop();
                current = decodedSegment.append(String.valueOf(current).repeat(Math.max(0, repeatedTimes)));
            } else {
                current.append(ch);
            }
        }

        return current.toString();


    }

    public static void main(String[] args) {

//        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
//        System.out.println(decodeString("2[abc]3[cd]ef"));
    }
}
