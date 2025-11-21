package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Below the code for learn the set and
 * implement the code set is very powerful
 * while manipulate the data it inherit the
 * abstract class and Set interface
 * <p>
 * Also, it does not allow the duplicate element in the
 * Hash set
 *
 * @author Meganathan
 */
public class SetExample {

    public static void main(String[] args) {

        // import the set
        Set<String> set = new HashSet<>();
        // add the elements into the set
        set.add("dinesh");
        set.add("dinesh");
        set.add("Meganathan");

        set.forEach(System.out::println); // this is for lambda experssion

        // Here also we can use Iterator
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) { // This condition check the like if
            System.out.println(itr.next());
        }


        // Also set have own lamda method that is very useful and efficent
        set.removeIf(str -> str.contains("dinesh")); // this condition check like if using lamda

        System.out.println("-------------------");
        System.out.println(set);
    }
}
