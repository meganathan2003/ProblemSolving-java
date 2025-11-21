package com.problems.zoho;

import java.util.*;

/**
 * Day 15
 *
 * @author Meganathan
 */

public class SortTheSection {

    public static List<String> sortTheBook(List<String> titles) {

        if (titles.isEmpty()) {
            return new ArrayList<>();
        }
        // collections.sort method sort the values in lexicographically order like Alphabetic order
        // This sort method uses that algo is merge sort
        Collections.sort(titles);

        return titles;


    }

    public static void main(String[] args) {

        List<String> titles = new ArrayList<>(Arrays.asList("Introduction", "Conclusion", "Appendix", "History", "Methods"));

        System.out.println(sortTheBook(titles));
    }
}
