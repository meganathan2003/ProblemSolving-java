package com.problems.leetcode;

import java.util.Arrays;

public class ConvertTemp {

    //     create a static method
    public static double[] convertTemperature(double celsius) {

        // validation
        if (celsius < 0) {
            return new double[]{0.0};
        }

        // convert kelvin and fah
        double[] ans = new double[2];

        ans[0] = celsius + 273.15;
        ans[1] = celsius * 1.80 + 32.00;

        return ans;
    }

    public static void main(String[] args) {

        double celsius = 36.50;

        System.out.println(Arrays.toString(convertTemperature(celsius)));
    }
}
