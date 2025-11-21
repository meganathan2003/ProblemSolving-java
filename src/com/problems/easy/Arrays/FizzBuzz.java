package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    //    Create a static method
    public static List<String> fizzBuzz(int n) {

        if (n < 0) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                res.add("FizzBuzz");
            } else if (i % 3 == 0) {
                res.add("Fizz");
            } else if (i % 5 == 0) {
                res.add("Buzz");
            } else {
                res.add(String.valueOf(i));
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int n = 3;

        System.out.println(fizzBuzz(n));
    }
}
