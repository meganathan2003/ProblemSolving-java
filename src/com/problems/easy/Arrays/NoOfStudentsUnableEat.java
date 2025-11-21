package com.problems.easy.Arrays;

/**
 * Here the problems is find the
 * who are all unable to eat the
 * sandwich in candeen and return
 * the student count
 *
 * @author Meganathan
 */
public class NoOfStudentsUnableEat {

    public static int countStudents(int[] students, int[] sandwiches) {

        if (students.length == 0 || sandwiches.length == 0) {
            return 0;
        }

        int count0 = 0;
        int count1 = 0;

        for (int student : students) {
            if (student == 0) count0++;
            else count1++;
        }

        for (int sandwich : sandwiches) {
            if (sandwich == 0 && count0 > 0) {
                count0--;
            } else if (sandwich == 1 && count1 > 0) {
                count1--;
            } else {
                break;
            }
        }

        return count0 + count1;


    }


    public static void main(String[] args) {

        int[] students = {1, 1, 1, 0, 0, 1};
        int[] sandwiches = {1, 0, 0, 0, 1, 1};
        System.out.println(countStudents(students, sandwiches));
    }
}
