package com.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * PriorityQueue is also class that is defined in the
 * collection framework that gives us a way for processing
 * the objects on the basis of priority. It is already
 * described that the insertion and deletion of objects
 * follows FIFO pattern in the Java queue. However, sometimes
 * the elements of the queue are needed to be processed
 * according to the priority, that's where a PriorityQueue comes into action.
 */
public class PriorityQueueExample {

    public static void main(String[] args) {

        // Two way we can import the queue and queue is the interface we cannot create a obj
        Queue<Integer> queue = new LinkedList<>();

        queue.add(29);
        queue.add(19);
        queue.add(20);
        queue.add(30);
        queue.add(1);

        // peek method return the head number does not remove
        System.out.println("Head is " + queue.peek());
        System.out.println("offer " + queue.offer(10));

        System.out.println(queue);

        /**
         * IN queue,we have another part is priority queue,
         * the main advantage when we
         * add the elements and it will maintain insertion order very usefull to remove and
         * insert the element. and it allows duplicate
         */

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(2);
        
        // What ever queue method have same priority queue there peek poll and element
        System.out.println(priorityQueue);
    }
}
