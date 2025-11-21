package com.problems.easy.Arrays;

public class OddBinaryNumber {
    //    Create a static method
    public static String maximumOddBinaryNumber(String s) {
//        Validation
        if (s.isEmpty()) {
            return "";
        }

        int oneCount = 0;
        int zeroCount = 0;

        for (char ch : s.toCharArray()) {
            oneCount += (ch == '1') ? 1 : 0;
            zeroCount += (ch == '0') ? 1 : 0;
        }


        StringBuilder res = new StringBuilder();
        // form the odd bit
        for (int i = 0; i < oneCount - 1; i++) {
            res.append('1');
        }

        for (int i = 0; i < zeroCount; i++) {
            res.append('0');
        }

        // finally add the one in the end
        res.append('1');

        return res.toString();
    }

    public static void main(String[] args) {
        String s = "0101";

        System.out.println(maximumOddBinaryNumber(s));
    }
}
