package com.collections;

import java.util.TreeSet;

/**
 * Below the code for learn the collections
 * from the Tree set it behind used the red and
 * black tree, and it was very efficient to retrieve and
 * sort the number also it maintains the sorted order and
 * it won't allow the null elements
 */
public class TreeSetExample {

    public static void main(String[] args) {
        // import the set from treeset
        TreeSet<String> ts = new TreeSet<String>();

        // add into the treeset
        ts.add("Dinesh");
        ts.add("Dinesh"); // dinesh and Dinesh is not same so here treeset cannot find that
        ts.add("geetha");
        ts.add("subha");
        System.out.println(ts);

        // loop it and get the elements
        for (String t : ts) {
            System.out.println(t);
        }

        // same all hash set and set these also have some default methods
        System.out.println("Lowest Value: " + ts.pollFirst()); // return the first alpha name
        System.out.println("Highest Value: " + ts.pollLast());

        // below the methods have their own usage we decending the number or strings

        System.out.println("-----------------------------------");
        System.out.println("Initial Set: " + ts);

        System.out.println("Reverse Set: " + ts.descendingSet());

        System.out.println("Head Set: " + ts.headSet("geetha", true));

        System.out.println("SubSet: " + ts.subSet("Dinesh", false, "geetha", true));

        System.out.println("TailSet: " + ts.tailSet("subha", false));

    }


}
