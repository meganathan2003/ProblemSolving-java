package com.collections;

/**
 * Below the code for link hashmap is part
 * of the java collections framework, and it
 * was use the DSA behind is combined with
 * hashtable and linked list to order of
 * insertion Values will be duplicate but
 * keys does not be duplicate.
 *
 * @author meganathan
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        // Create a new obj for LinkedHashmap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // now add the key value in hashmap
        linkedHashMap.put(1, "apple");
        linkedHashMap.put(2, "apple");
        linkedHashMap.put(3, "banana");
        linkedHashMap.put(4, "banana");
        linkedHashMap.put(5, "banana");


        // Now call the sub interface Entry in map
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());

        }
    }
}
