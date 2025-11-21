package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Below the code for learn the
 * linked hash set from the collections frame
 * work also linkedhashset is same as set
 * but these insertion order is maintain and not
 * allow the duplicate elements
 *
 * @author meganathan
 */
public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> set = new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");
        set.add("Five");
        set.add("Five");

        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
