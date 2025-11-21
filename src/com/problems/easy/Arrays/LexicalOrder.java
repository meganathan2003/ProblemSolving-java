package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexicalOrder {

    // Create a new method
    public static List<Integer> lexicalOrder(int n) {
        if (n < 0) {
            return new ArrayList<>(Arrays.asList(0));
        }

        // Change the integer to string
        String[] strValue = new String[n];

        for (int i = 0; i < n; i++) {
            strValue[i] = String.valueOf(i + 1);
        }

        Arrays.sort(strValue); // Here we sort the lexicall order
        System.out.println(Arrays.toString(strValue));

        // create a new arraylist
        List<Integer> res = new ArrayList<>();
        for (String value : strValue) {
            res.add(Integer.parseInt(value));
        }

        return res;
    }

    public static void main(String[] args) {

        int n = 13;
        System.out.println(lexicalOrder(n));

    }
}
