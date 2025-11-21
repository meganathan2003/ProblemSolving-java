package com.problems.easy.Arrays;

public class SortTheSentence {

    public static void main(String[] args) {

        String s = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    // Create a static method
    public static String sortSentence(String s) {


        if (s.isEmpty()) {
            return "";
        }

        String[] splitArr = s.split(" ");


        // is2 sentence4 This1 a3
        String[] res = new String[splitArr.length];


        for (String string : splitArr) {
            int indexNum = 0;
            StringBuilder value = new StringBuilder();
            for (char ch : string.toCharArray()) {
                if (!Character.isDigit(ch)) {
                    value.append(ch);
                }
                indexNum = Character.getNumericValue(ch);

            }
            res[indexNum - 1] = String.valueOf(value);
        }

        return String.join(" ", res);

    }
}
