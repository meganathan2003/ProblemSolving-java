package com.problems.easy.Arrays;

public class CountOfMatchesInTournament {

    //    Create a public class
    public static int numberOfMatches(int n) {


//        Validation
        if (n < 0) {
            return 0;
        }

//         create a variable
        int teams = n;
        int matches = 0;
        int advance = 0;
        int totalMatches = 0;

        while (teams > 1) {

            // check if odd or even
            if (teams % 2 == 1) {
                matches = (teams - 1) / 2;
                advance = (teams - 1) / 2 + 1;
            } else {
                matches = teams / 2;
                advance = teams / 2;
            }
            teams = advance;
            totalMatches += matches;
        }

        return totalMatches;
    }


    public static void main(String[] args) {

        int n = 7;

        System.out.println(numberOfMatches(n));

    }
}
