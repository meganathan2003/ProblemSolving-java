package com.problems.easy.Arrays;

public class RunLengthEncoding {

    // create a static method
    public static String runLengthEncodingString(String s) {
        if (s.isEmpty()) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        // a1b10
        int i = 0; // 0

        while (i < s.length()) {

            // Get the char
            char ch = s.charAt(i);
            i++; // increment for get the number

            StringBuilder numberBuilder = new StringBuilder();
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                numberBuilder.append(s.charAt(i));
                i++; // may be two digit number will come so that i++
            }
            int number = Integer.parseInt(numberBuilder.toString());

            for (int j = 0; j < number; j++) {
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "a1b10";
        System.out.println(runLengthEncodingString(s));
    }
}
