package com.problems.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindPeaks {

    // create a static method
    public static List<Integer> findPeaks(int[] mountain) {

        if (mountain.length == 0) {
            return new ArrayList<>();
        }

        List<Integer> res = new ArrayList<>();

        for (int i = 1; i < mountain.length - 1; i++) {
            if (mountain[i] > mountain[i - 1] && mountain[i] > mountain[i + 1]) {
                res.add(i);
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int[] mountain = {1, 4, 3, 8, 5};
        System.out.println(findPeaks(mountain));

    }
}
