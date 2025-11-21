package com.problems.zoho;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidHorizonPoint {

    public static List<Integer> validHorizonPoint(List<Integer> buildingHeights) {
        if (buildingHeights.isEmpty()) {
            return new ArrayList<>();
        }

        List<Integer> result = new ArrayList<>();
        int maxHeight = buildingHeights.get(0);
        result.add(0);  // first building is always a horizon point

        for (int i = 1; i < buildingHeights.size(); i++) {
            if (buildingHeights.get(i) > maxHeight) { // 1 > 3
                result.add(i);
                maxHeight = buildingHeights.get(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> buildingHeights = new ArrayList<>(Arrays.asList(3, 1, 5, 2, 6));
        System.out.println(validHorizonPoint(buildingHeights));
    }
}
