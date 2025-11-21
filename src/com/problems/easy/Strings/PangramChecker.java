package com.problems.easy.Strings;

public class PangramChecker {

    // create a new static method
    public static boolean checkIfPangram(String sentence) {

        if (sentence.isEmpty()) {
            return false;
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.toLowerCase().indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        //create a string
        String input = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(input));
    }
}
