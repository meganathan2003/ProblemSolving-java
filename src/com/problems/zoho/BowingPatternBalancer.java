package com.problems.zoho;

/**
 * Day 30
 *
 * @author Meganathan
 */
public class BowingPatternBalancer {

    public static String[] bowingPattern(String pattern) {

        if (pattern.isEmpty()) {
            return new String[]{""};
        }

        int dCount = 0;
        int uCount = 0;

        for (char ch : pattern.toCharArray()) {
            if (ch == 'D') dCount++;
            else if (ch == 'U') uCount++;
        }

        // already balanced aidcuhu means apdiye return pana vendiyathu than
        if (Math.abs(dCount - uCount) <= 1) {
            return new String[]{"true", pattern};
        }

        // Check entha count athigama irukunu
        char excessChar = dCount > uCount ? 'D' : 'U'; // 3 D and 6 U
        char replaceChar = dCount > uCount ? 'U' : 'D';
        int startIndex = dCount > uCount ? 0 : 1; // ithu vanthu odd or even ku


        String balancedPattern = tryBalance(pattern, excessChar, replaceChar, startIndex);
        boolean canBalance = Math.abs(count(balancedPattern, 'D') - count(balancedPattern, 'U')) <= 1;


        // pattern eh replace pani balance irukanu pathu string eh return panurom
        return new String[]{String.valueOf(canBalance), balancedPattern};
    }

    // intha helper function vanthu balance akumanu check panurathuku
    private static String tryBalance(String pattern, char from, char to, int startIndex) {
        char[] chars = pattern.toCharArray();

        // ithu vanthu upto half excess sona nala divide panurom
        int replacements = 0, maxReplacements = Math.abs(count(pattern, from) - count(pattern, to)) / 2;

        for (int i = startIndex; i < chars.length && replacements < maxReplacements; i += 2) {
            if (chars[i] == from) {
                chars[i] = to;
                replacements++;
            }
        }
        return new String(chars);
    }

    // Intha helper function vanthu pattern eh count panuratuku after replace pana aprm
    private static int count(String pattern, char ch) {

        int count = 0;
        for (char c : pattern.toCharArray()) {
            if (c == ch) count++;
        }
        return count;
    }


    public static void main(String[] args) {

        String pattern1 = "DUDUUUUUD";
        String pattern2 = "DUDUUUDUD";

        /**
         * First pattter1 ku vanthu true the because question la extra oru U
         * or D iruntha athu balanced tha nu soli irukanga so first ithuku
         * oru extra U iruthalu athu balanced that according to this problems
         * statement so canbalance true aki true return panuthu
         * */
        System.out.println(String.join(", ", bowingPattern(pattern1)));

        System.out.println(String.join(", ", bowingPattern(pattern2)));


    }
}
