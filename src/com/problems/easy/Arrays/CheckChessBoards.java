package com.problems.easy.Arrays;

public class CheckChessBoards {

    public static void main(String[] args) {
        String coordinate1 = "a1";
        String coordinate2 = "c3";

        System.out.println(checkTwoChessboards(coordinate1,coordinate2));
    }

    // Create a static method
    public static boolean checkTwoChessboards(String coordinate1, String coordinate2) {

        if (coordinate1.isEmpty() || coordinate2.isEmpty()) {
            return false;
        }

        // get the first letter of the word
        char firstLetter1 = coordinate1.charAt(0);
        char firstLetter2 = coordinate2.charAt(0);
        int secondLetter1 = coordinate1.charAt(1) - '0'; // directly convert to int 61 -  60 = 1
        int secondLetter2 = coordinate2.charAt(1) - '0';

        // get the both total
        int total1 = (firstLetter1 - 'a' + 1) + secondLetter1; // 61 - 61 + 1 = 1
        int total2 = (firstLetter2 - 'a' + 1) + secondLetter2; // 61 - 61 + 1 = 1

        return total1 % 2 == 0 && total2 % 2 == 0 || total1 % 2 == 1 && total2 % 2 == 1;
    }

}
