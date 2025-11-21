package com.collections;

import java.util.HashSet;

/**
 * Below the code for example of the hash set and it using the mechanism of
 * hashing key points arr HashSet stores the elements by using a mechanism
 * called hashing HashSet contains un que el HashSet allows null value HashSet
 * is the best approach for search operations.
 */
public class HashsetExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("dinesh");
        set.add("meganathan");
        set.add("subha");
        set.add("dinesh"); // it wont add 
        
        // System.out.println(set. );
        
        // Loop it
        for (String name : set) {
        
            System.out.println(name);
        }

    }

}
