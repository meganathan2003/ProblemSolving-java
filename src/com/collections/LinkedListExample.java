package com.collections;

import java.util.LinkedList;

/**
 * Below the code for learn the linkedlist in collection framework and implement
 * the code also linkedlist use for doubly linked list also it implement the
 * List deque and stack
 *
 * @author meganathan
 */
public class LinkedListExample {

    public static void main(String[] args) {

        // import the linkedlist class
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Diensh");
        linkedList.add("meganathan");
        linkedList.add("subha");

        // And it have some methods like add addfirst and addlast
        linkedList.add(1, "geetha");
        linkedList.addFirst("Dinesh");
        linkedList.addLast("sathish");

        linkedList.removeLastOccurrence("Dinesh"); // remove the duplicate in last occurence
        linkedList.forEach(System.out::println);

    }
}
