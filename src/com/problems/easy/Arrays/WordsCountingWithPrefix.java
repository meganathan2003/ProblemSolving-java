package com.problems.easy.Arrays;

public class WordsCountingWithPrefix {


    public static int prefixCount(String[] words, String pref) {

        if (words.length == 0 || pref.isEmpty()) {
            return 0;
        }
        int count = 0;
        for (String s : words) {
            if (s.startsWith(pref)) count++;
        }

        return count;
    }

    /**
     * Another method to
     * solve this problem
     *
     * @param args
     */
//    // helper function to check the words is same pref or not
//    private static int isPrefixWords(String[] words, String pref) {
//
//        int i = 0;
//        int count = 0;
//
//        while (i < words.length) {
//
//            if (words[i].length() >= pref.length()) {
//
//                System.out.println(words[i]);
//                String spliceWord = words[i].substring(0, pref.length());
//                if (spliceWord.equals(pref)) {
//                    count++;
//                }
//            }
//
//            i++;
//        }
//
//        return count;
//    }
    public static void main(String[] args) {

        String[] words = {"leetcode", "win", "loops", "success"};
        String pref = "code";

        System.out.println(prefixCount(words, pref));


    }
}
