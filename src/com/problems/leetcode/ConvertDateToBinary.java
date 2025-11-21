package com.problems.leetcode;

import java.util.Arrays;

public class ConvertDateToBinary {

    // Create a static method
    public static String convertDateToBinary(String date) {


        // validation
        if (date.isEmpty()) {
            return "";
        }


        // Split the input date into parts
        String[] dateParts = date.split("-");

        StringBuilder binaryDate = new StringBuilder();

        for (int i = 0; i < dateParts.length; i++) {

            int part = Integer.parseInt(dateParts[i]);

            String binaryPart = Integer.toBinaryString(part);

            binaryDate.append(binaryPart);
            if (i < dateParts.length - 1) {
                binaryDate.append("-");
            }
        }

        return binaryDate.toString();

    }

    public static void main(String[] args) {

        String date = "2080-02-29";

        System.out.println(convertDateToBinary(date));
    }
}
