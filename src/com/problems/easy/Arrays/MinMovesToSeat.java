package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Below the problem for find the
 * minimum seat that students from move
 * to one and another and return the
 * minimum move
 *
 * @author meganathan
 * <p>
 * Input: seats = [3,1,5], students = [2,7,4]
 * Output: 4
 */
public class MinMovesToSeat {
    // create a new method
    public int minMoveToSeat(int[] seats, int[] students) {
        if (seats.length != 0 && students.length != 0) {
            List<Integer> seats1 = new ArrayList<>(IntStream.of(seats).boxed().toList());
            List<Integer> students1 = new ArrayList<>(IntStream.of(students).boxed().toList());
            Collections.sort(seats1);
            Collections.sort(students1);
            int Minmove = 0;
            for (int i = 0; i < seats1.size(); i++) {
                // Math.abs means absolute this means i will return the negative to positive value
                Minmove += Math.abs(seats1.get(i) - students1.get(i));
            }
            return Minmove;
        }
        return 0;
    }

    public static void main(String[] args) {
        // Create a new array
        int[] seats = {4, 1, 5, 9};
        int[] students = {1, 3, 2, 6};
        // create a new obj
        MinMovesToSeat minMovesToSeat = new MinMovesToSeat();
        System.out.println(minMovesToSeat.minMoveToSeat(seats, students));
    }
}
