package com.collections;

import java.util.Map;
import java.util.TreeMap;

/**
 * Below the code for Example of
 * the TreeMap and it was very efficient
 * to store or retrieve the data in Behind
 * DSA is Red Black Tree Also it does not allow
 * the null values, but it does not allows the
 * null key but it allow the null values
 *
 * @author Meganathan
 */
public class TreeMapExample {

    public static void main(String[] args) {
        //Create a obj in TreeMap
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        // Add the elements into the treemap
        treeMap.put(1, "Dinesh");
        treeMap.put(2, "Surya");
        treeMap.put(3, "Shyam");
        treeMap.put(4, "DJ");
        treeMap.put(5, "Subha");

        // Tree map allow the duplicate value
        // Now loop it and get the key and value
        for (Map.Entry<Integer, String> m : treeMap.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

    }
}
