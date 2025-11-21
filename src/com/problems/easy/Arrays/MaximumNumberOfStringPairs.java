package com.problems.easy.Arrays;

/**
 * Below the Sum for find the
 * maximum number of string pairs in
 * array and return the count
 *
 * @author meganathan
 * Input: words = ["cd","ac","dc","ca","zz"]
 * Output: 2
 */
public class MaximumNumberOfStringPairs {

    // Create a new method
    public int maximumNumberOfStringPairs(String[] words) {
        int n = words.length;
        int pairsCount = 0;

        // Loop for find the words in string
        for (int i = 0; i < n - 1; i++) {
            String s = words[i];
            for (int j = i + 1; j < n; j++) {
                if (words[i].charAt(0) ==  words[j].charAt(1) && words[i].charAt(1) == words[j].charAt(0)) {
                    pairsCount++;
                }
            }
        }
        return pairsCount;
    }

    public static void main(String[] args) {

        // create a new String array
        String[] arr = {"cd", "ac", "dc", "ca", "zz"};

        // Create a new obj
        MaximumNumberOfStringPairs numberOfStringPairs = new MaximumNumberOfStringPairs();
        System.out.println(numberOfStringPairs.maximumNumberOfStringPairs(arr));

    }
}
