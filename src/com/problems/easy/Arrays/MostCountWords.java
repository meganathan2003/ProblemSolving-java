package com.problems.easy.Arrays;

/**
 * @param {*} sentences
 *            Below the code for find the most sententes in the
 *            array
 * @author meganathan
 */

public class MostCountWords {
    public int mostWordsFound(String[] sentences) {
        if (sentences.length != 0) {
            int wordCount = 0;
            for (int i = 0; i < sentences.length; i++) {
                String currentWords = sentences[i];
                // below the code for use inbuilt method
                // the split method
                int count = currentWords.split(" ").length;
                if (count > wordCount) wordCount = count;
            }
            return wordCount;
        }

        return 0;
    }


    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        MostCountWords countWords = new MostCountWords();
        System.out.println(countWords.mostWordsFound(sentences));
    }
}

