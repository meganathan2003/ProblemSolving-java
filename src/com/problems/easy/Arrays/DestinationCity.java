package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * Output: "Sao Paulo"
 *
 * @author meganathan
 */

public class DestinationCity {

    public String destCity(List<List<String>> paths) {
        // Create a HashSet to store all starting cities
        HashSet<String> startingCities = new HashSet<>();

        // Add all starting cities to the set
        for (List<String> path : paths) {
            startingCities.add(path.get(0));
        }
        System.out.println(startingCities); // print the starting cities

        // The destination city is the one that is not in the starting cities set
        for (List<String> path : paths) {
            if (!startingCities.contains(path.get(1))) { // contains check the place there or not in List
                return path.get(1);
            }
        }

        // If no destination city is found, return an empty string
        return "";
    }

    public static void main(String[] args) {
        // Create a list of lists to represent the paths
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York", "Lima"));
        paths.add(Arrays.asList("Lima", "Sao Paulo"));

        // Create an instance of the DestinationCity class
        DestinationCity destinationCity = new DestinationCity();

        // Call the destCity method and print the result
        String result = destinationCity.destCity(paths);
        System.out.println("Destination City: " + result);  // Output: Sao Paulo
    }
}
