package com.problems.easy.Arrays;

/**
 * Here the problems is you're a given
 * a Integer Arr and you take single digit
 * or double digit in the array and sum check
 * you value is max then bob value return the
 * boolean value
 * 
 * Input: nums = [1,2,3,4,10]
 * Output: false
 */
public class CanAlicewin {

    // Create a sepreate method
    public static boolean canAliceWin(int[] arr) {
        if (arr.length == 0) {
            return false;
        }

        // Create a variable for alice and bob
        int bob = 0;
        int alice = 0;
        for (int num : arr) {
            if (num >= 0 && num <= 9) {
                alice += num;
            } else {
                bob += num;
            }

        }
        return alice > bob || bob > alice;
    }

    public static void main(String[] args) {

        // Create a new array
        int[] nums = { 5, 5, 5, 25 };
        System.out.println(canAliceWin(nums));

    }

}
