package com.problems.zoho;

import java.math.BigInteger;

/**
 * Day 25
 *
 * @author Meganathan
 */
public class MinimumNumberOfScareCrow {

    public static int minScarecrows(String farm) {
        if (farm.isEmpty()) {
            return 0;
        }

        int n = farm.length();
        int scarecrows = 0;
        int i = 0;

        while (i < n) {
            if (farm.charAt(i) == 'C') {

                if (i + 1 < n && farm.charAt(i + 1) == '.') {
                    scarecrows++;
                    i += 3;
                } else if (i + 2 < n && farm.charAt(i + 2) == '.') {
                    scarecrows++;
                    i += 4;
                } else {
                    return -1;
                }
            } else {
                i++;
            }

        }

        return scarecrows;
    }

    public static void main(String[] args) {

        // First one real ans is 2 not 3 because rendu adjancent athu safe panum so
        // [4 ,5 ,6] three corps will safe so answer is 2
        String farm1 = "C..C.C..";
        System.out.println(minScarecrows(farm1));

        String farm2 = "C.C.#C.CC";
        System.out.println(minScarecrows(farm2));

    }
}
