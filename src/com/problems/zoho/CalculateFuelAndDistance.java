package com.problems.zoho;

/**
 * Day 18
 *
 * @author Meganathan
 */
public class CalculateFuelAndDistance {

    public static boolean calculateFuelDistance(int distance, int fuel) {

        if (distance <= 0 || fuel <= 0) {
            return false;
        }

        // ithu vannthu 24km check pananum
        int neededFuel = distance / 24; // 24Km per litre

        // Calculate the extra fuel needed
        int extraFuel = distance / 30; //  extra litre for 30km

        int totalFuel = neededFuel + extraFuel;

        System.out.println(neededFuel);
        System.out.println(extraFuel);

        return fuel >= totalFuel;

    }

    public static void main(String[] args) {

        int Distance = 900;
        int Fuel = 90;

        System.out.println(calculateFuelDistance(Distance, Fuel));
    }

}
