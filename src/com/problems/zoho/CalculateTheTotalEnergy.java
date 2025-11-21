package com.problems.zoho;

import java.util.*;

/**
 * Day 9
 */

public class CalculateTheTotalEnergy {

    public static double calculateTheTotalEnergy(List<Map<String, Object>> panels) {

        if (panels.isEmpty()) {
            return 0;
        }

        double totalEnergy = 0;

        for (Map<String, Object> panel : panels) {

            int maxCapacity = (int) panel.get("max_capacity");
            double efficiencyFactor = (double) panel.get("efficiency_factor");

            double energyPerPanel = maxCapacity * efficiencyFactor;

            totalEnergy += energyPerPanel; // add to total energy
        }

        // Round to two decimal places
        return Math.round(totalEnergy * 100.0) / 100.0;

    }

    public static void main(String[] args) {

        List<Map<String, Object>> panels = new ArrayList<>(Arrays.asList(
                new HashMap<String, Object>() {{
                    put("max_capacity", 100);
                    put("efficiency_factor", 0.8);
                }},
                new HashMap<String, Object>() {{
                    put("max_capacity", 150);
                    put("efficiency_factor", 0.6);
                }},
                new HashMap<String, Object>() {{
                    put("max_capacity", 200);
                    put("efficiency_factor", 0.75);
                }}
        ));

        System.out.println(panels);

        System.out.println(calculateTheTotalEnergy(panels));
    }

}
