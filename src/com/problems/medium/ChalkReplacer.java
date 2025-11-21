package com.problems.medium;

/**
 * Here the problems is to sove that
 * You are given a 0-indexed integer array chalk and an integer k. There are
 * initially k pieces of chalk. When the student number i is given a problem to
 * solve, they will use chalk[i] pieces of chalk to solve that problem. However,
 * if the current number of chalk pieces is strictly less than chalk[i], then
 * the student number i will be asked to replace the chalk.
 * 
 * Input: chalk = [5,1,5], k = 22
 * Output: 0
 * 
 */

public class ChalkReplacer {

    public static int chalkReplacer(int[] chalk, int k) {
        // Step 1: Calculate the total sum of chalk
        int totalSum = 0;
        // to find the single round
        for (int amount : chalk) {
            totalSum += amount;
        }
        System.out.println(totalSum);

        k = k % totalSum;

        int i = 0;
        while (k >= chalk[i]) {
            k -= chalk[i];
            i++;

            if (i == chalk.length) {
                i = 0;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] chalk = { 5, 1, 5 };
        int k = 22;

        int result = chalkReplacer(chalk, k);
        System.out.println("Student who cannot take chalk: " + result); // Output: 0
    }
}
