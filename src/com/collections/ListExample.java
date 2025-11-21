package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Below the code for learn and
 * implement the list in java
 * collections framework
 *
 * @author meganathan
 */
public class ListExample {

    public static void main(String[] args) {

        // import the list class
        List<String> list = new ArrayList<String>();

        // adding the elements in list
        list.add("dinesh");
        list.add("subha");
        list.add("meganathan");

        System.out.println(list.get(1)); // return the index one
        System.out.println(list.set(0, "sathish")); // we can change the elemet also using index
        // java.util package provide the collection class
        Collections.sort(list); // this collection

        // now getting travese the for loop
        for (String name : list) {
            System.out.println(name);
        }

        // java 8 have new feature called the lambda experssion
        // here we use lamda expression  { a -> }
        list.forEach(System.out::println); // this is very advanced method

        /**
         *  below the code for how to use iterator class
         *  for getting the names inside the array list
         */
        Iterator<String> itr = list.iterator();
        itr.forEachRemaining(System.out::println); // this is new method jdk 18
    }
}
