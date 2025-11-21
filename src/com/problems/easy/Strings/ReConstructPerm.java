package com.problems.easy.Strings;

import java.util.Arrays;

public class ReConstructPerm {

    public static int[] diStringMatch(String s) {

        if (s.isEmpty()) {
            return new int[0];
        }

        int low = 0;
        int high = s.length();
        int[] perm = new int[s.length() + 1];

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I') {
                perm[i] = low++;
            } else { // 'D'
                perm[i] = high--;
            }
        }

        // finally add the last number
        perm[s.length()] = low;

        return perm;

    }


    public static void main(String[] args) {
        String s = "IDID";
        int[] result = diStringMatch(s);
        System.out.println(Arrays.toString(result));
    }
}
