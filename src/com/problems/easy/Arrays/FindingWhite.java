package com.problems.easy.Arrays;

public class FindingWhite {
    // Create a static method
    public static boolean squareIsWhite(String coordinates) {
//        Validation
        if (coordinates.isEmpty()) {
            return false;
        }

        char firstLetter = coordinates.charAt(0);
        int secNum = coordinates.charAt(1) - '0'; // Convert char to int directly

        int total = (firstLetter - 'a' + 1) + secNum;

        // Return true if the sum is odd (white square), false otherwise (black square)
        return total % 2 != 0;

    }

    public static void main(String[] args) {

        String coordinates = "h3";

        System.out.println(squareIsWhite(coordinates));
    }
}
