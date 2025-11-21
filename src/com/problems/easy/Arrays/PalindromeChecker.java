package com.problems.easy.Arrays;

/**
 * Here the problem to find the
 * string is palindrome are not
 * 
 * 
 */
public class PalindromeChecker {

    // Create a sepreate static method
    public static boolean palindromeCheck(String s) {
        if (s.isEmpty()) {
            return false;

        }

        // use two pointer to solve this problem
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        // create a new string
        String s = "MADAM";
        System.out.println(palindromeCheck(s));
    }

}
