package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Here the problems is to find the
 * are given the nums arr you should
 * seperete the digit in that nums arr
 *
 * @author Meganathan
 */
public class SeparateDigits {

    // create a static method
    public static int[] separateDigits(int[] nums) {

        if (nums.length == 0) {
            return new int[0];
        }

        // create a new arraylist and push it all
        List<Character> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            String firstNumber = String.valueOf(nums[i]); // "13"
            for (char word : firstNumber.toCharArray()) {
                arr.add(word); // This will convert to char to int ASCII
            }
        }

        /**
         * int num = 247;
         * while (num > 0) {
         *     int lastDigit = num % 10;  // Extract the last digit
         *     System.out.println(lastDigit);  // Output each digit
         *     num = num / 10;  // Remove the last digit
         * }
         */

        System.out.println(arr);

        // We can do both approach one is loop another one is stream
        // Integer::intValue is equivalent to (Integer x) -> x.intValue()
        return arr.stream().mapToInt(Character::getNumericValue).toArray();
    }

    public static void main(String[] args) {

        // create a new array
        int[] arr = {7, 1, 3, 9};
        System.out.println(Arrays.toString(separateDigits(arr)));

    }
}
