package com.problems.easy.Arrays;

/**
 * Below the code for find the largest
 * Altitude in the trip
 * Input: gain = [-5,1,5,0,-7]
 * Output: 1
 */
public class    LargestAltitude {

    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for(int alti : gain){
            currentAltitude += alti;
            maxAltitude = Math.max(currentAltitude,maxAltitude);
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        int[] gain = {-5, 1, 5, 0, -7};
        // create a obj
        LargestAltitude altitude = new LargestAltitude();
        System.out.println(altitude.largestAltitude(gain));
    }

}
