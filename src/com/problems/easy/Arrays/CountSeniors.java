package com.problems.easy.Arrays;

/**
 * Here the problems is to
 * find the count seniors
 * by their age
 * Return the number of passengers
 * who are strictly more than 60 years old.
 */
public class CountSeniors {
    // Create a sepreate method
    public static int countSeniors(String[] details) {
        if (details.length == 0) {
            return 0;
        }

        int result = 0;
        // loop for find the above 60 age person
        for (int i = 0; i < details.length; i++) {

            if (details[i].length() < 13) {
                continue; // Skip invalid entries
            }
            String currentValue = String.valueOf(details[i].charAt(11) + "" + details[i].charAt(12));
            System.out.println(currentValue);
            if (Integer.parseInt(currentValue) > 60) {
                result++;
            }
        }
        return result;

        // Another resul
        // int count = 0;
        // for(int i = 0; i < details.length; i++) {
        // if(details[i].charAt(11) > '5') {
        // if(details[i].charAt(11) == '6' && details[i].charAt(12) == '0')
        // continue;
        // else
        // count++;
        // }

        // }
        // return count;
    }

    public static void main(String[] args) {
        String[] arr = { "1313579440F2036", "2921522980M5644" };
        System.out.println(countSeniors(arr));
    }

}
