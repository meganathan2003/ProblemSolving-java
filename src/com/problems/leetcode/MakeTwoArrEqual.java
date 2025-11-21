package com.problems.leetcode;

import java.util.Arrays;

public class MakeTwoArrEqual {

    public static boolean canBeEqual(int[] target, int[] arr) {

        if (target.length <= 1 || arr.length <= 1) {
            return true;
        }

        Arrays.sort(target);
        Arrays.sort(arr);

        return Arrays.equals(target, arr);
    }

    public static void main(String[] args) {

        int[] target = {3, 7, 9};
        int[] arr = {3, 7, 11};

        System.out.println(canBeEqual(target, arr));

    }
}
