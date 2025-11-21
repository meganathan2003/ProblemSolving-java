package com.problems.easy.Arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Below the problem for find the
 * acroynm for eact charat in array
 * and check the given S String and
 * our concat string
 * Input: words = ["alice","bob","charlie"], s = "abc"
 * Output: true
 */
public class IsAcronym {
    public boolean isAcronym(List<String> words, String s) {
        if (!words.isEmpty() || !(s.isEmpty())) {
            StringBuilder concatWord = new StringBuilder();
            for (String str : words) {
                concatWord.append(str.charAt(0));
            }
            return concatWord.toString().equals(s);
        }
        return false;
    }

    public static void main(String[] args) {
        // create a array list
        List<String> arr = new ArrayList<>(Arrays.asList("an", "apple"));
        String s = "a";
        //create a obj
        IsAcronym isAcronym = new IsAcronym();
        System.out.println(isAcronym.isAcronym(arr, s));
    }
}
