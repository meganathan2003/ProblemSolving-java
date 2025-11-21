package com.problems.zoho;

public class HikingTrail {
    public static int minBootChanges(int[] trail, int[] boots) {
        int boot = -1; // -1 for no boot selected
        int changes = 0;

        for (int i = 0; i < trail.length; i++) {
            for (int j = 0; j < boots.length; j++) {
                if (boots[j] >= trail[i]) {
                    // if we wish to change to diff boot increase count also
                    if (boot != j) {
                        boot = j;
                        changes++;
                    }
                    break;
                }
            }
        }

        return changes;
    }

    public static void main(String[] args) {
        int[] trail = {3, 2, 1};
        int[] boots = {4, 5, 3};

        System.out.println(minBootChanges(trail, boots));
    }
}
