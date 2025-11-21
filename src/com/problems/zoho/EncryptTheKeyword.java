package com.problems.zoho;

import java.util.ArrayList;
import java.util.List;

/**
 * Day 17
 *
 * @author Meganathan
 */

public class EncryptTheKeyword {

    public static List<String> encryptTheKeyword(String[] keywords, int n, int shiftValue) {

        if (keywords.length == 0 || n <= 0 || shiftValue <= 0) {
            return new ArrayList<>();
        }

        List<String> encryptAlgoKeyword = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder encryptStr = new StringBuilder();
            for (char ch : keywords[i].toCharArray()) {
                char shiftedChar;
                if (Character.isUpperCase(ch)) {

                    // intha formula vanthu circular ah Alpabetic eh vachikum
                    shiftedChar = (char) ('A' + (ch - 'A' + shiftValue) % 26);
                } else if (Character.isLowerCase(ch)) {
                    shiftedChar = (char) ('a' + (ch - 'a' + shiftValue) % 26);
                }

                // else part vanthu non letter ah iruntha apdiye iruka
                else {
                    shiftedChar = ch;
                }
                encryptStr.append(shiftedChar);
            }
            encryptAlgoKeyword.add(encryptStr.toString());
        }

        return encryptAlgoKeyword;
    }

    public static void main(String[] args) {
        int n = 3;
        String[] keywords = {"Hello", "Journal", "Secret"};
        int shiftValue = 3;

        System.out.println(encryptTheKeyword(keywords, n, shiftValue));
    }
}
