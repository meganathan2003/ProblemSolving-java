package com.problems.zoho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Day 11
 *
 * @author Meganathan
 */

class SnackCombination {

    public static void findCombinations(List<Map<String, Integer>> snackList, int target) {
        List<List<String>> results = new ArrayList<>();

        // seprate both snack and spicy
        List<String> snackNames = new ArrayList<>();
        List<Integer> spicinessValues = new ArrayList<>();

        for (Map<String, Integer> snack : snackList) {
            for (Map.Entry<String, Integer> entry : snack.entrySet()) {
                snackNames.add(entry.getKey());
                spicinessValues.add(entry.getValue());
            }
        }
        backtrack(snackNames, spicinessValues, target, new ArrayList<>(), results, 0);

        System.out.println(results.size()); // print total spicy combo
    }

    // helper function to handle the spiciness combo
    private static void backtrack(List<String> snacks, List<Integer> spiciness, int target, List<String> current, List<List<String>> results, int start) {
        if (target == 0) {
            results.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) {
            return;
        }
        for (int i = start; i < snacks.size(); i++) {
            current.add(snacks.get(i)); // current snack
            backtrack(snacks, spiciness, target - spiciness.get(i), current, results, i);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Map<String, Integer>> snackList = new ArrayList<>();

        Map<String, Integer> snack1 = new HashMap<>();
        snack1.put("Samosa", 5);
        snackList.add(snack1);

        Map<String, Integer> snack2 = new HashMap<>();
        snack2.put("Ketchup", 2);
        snackList.add(snack2);

        Map<String, Integer> snack3 = new HashMap<>();
        snack3.put("Chips", 3);
        snackList.add(snack3);

        Map<String, Integer> snack4 = new HashMap<>();
        snack4.put("Spicy Nuts", 4);
        snackList.add(snack4);

        int target_spiciness = 7;
        findCombinations(snackList, target_spiciness);
    }
}
