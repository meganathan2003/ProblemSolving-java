package com.problems.zoho;

import java.util.*;

public class TravelPlanner {

    public static List<String> maximizeCountriesVisited(Map<String, Integer> countries, int X) {

        if (countries.isEmpty() || X <= 0) {
            return new ArrayList<>();
        }

        int budget = X;
        List<String> res = new ArrayList<>();

        List<Map.Entry<String, Integer>> sortedCountries = new ArrayList<>(countries.entrySet());
        sortedCountries.sort(Map.Entry.comparingByValue()); // sort the arr by their value

        System.out.println(sortedCountries);

        // loop the sorted country
        for (Map.Entry<String, Integer> countryPrice : sortedCountries) {
            if (budget >= countryPrice.getValue()) {

                budget -= countryPrice.getValue();
                res.add(countryPrice.getKey());

            } else {
                break; // break it if we cannot afford anymore
            }
        }

        return res;
    }

    public static void main(String[] args) {

        int budget = 1000;
        Map<String, Integer> countries = new HashMap<>();

        countries.put("Japan", 1000);
        countries.put("India", 400);
        countries.put("Brazil", 300);
        countries.put("Australia", 500);

        System.out.println(maximizeCountriesVisited(countries, budget));
    }
}
