package com.problems.zoho;

import java.util.*;

/**
 * Here the problem is to find new unique elements from caves
 * excluding the ones in the known_element list.
 *
 * @author Meganathan
 */
public class FindUniqueElementsInCave {

    public static List<String> findUniqueElements(List<List<String>> caves, List<String> known_ele) {

        // check the validation
        if (caves.isEmpty() || known_ele.isEmpty()) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>(); // Store result

        // loop each cave
        for (List<String> cave : caves) {
            for (String element : cave) {
                // If element is not there in know ele add to result
                if (!checkKnownEle(element, known_ele) && !res.contains(element)) {
                    res.add(element);
                }
            }
        }

        return res;
    }

    // Helper function to check if a single element is there in known array
    private static boolean checkKnownEle(String element, List<String> knownEle) {
        return knownEle.contains(element);
    }

    public static void main(String[] args) {
        List<List<String>> caves = new ArrayList<>(Arrays.asList(
                Arrays.asList("gold", "silver", "emerald"),
                Arrays.asList("emerald", "diamond", "ruby"),
                Arrays.asList("sapphire", "silver", "gold")
        ));

        List<String> knownEle = new ArrayList<>(Arrays.asList("gold", "silver", "platinum"));
        System.out.println(findUniqueElements(caves, knownEle));
    }
}
