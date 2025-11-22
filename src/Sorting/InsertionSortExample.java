package Sorting;

import java.util.Arrays;

/**
 * Here the Ds is insertion sort these is also one of the type of
 * sorting method and this sorting is all about shifting the numbers.
 *
 * @author Meganathan
 */

public class InsertionSortExample {

    public static void main(String[] args) {

        int[] nums = {55, 12, 20, 10, 1, 2, 5, 4};
        int n = nums.length;

        int[] result = insertionSort(nums, n);
        System.out.println(Arrays.toString(nums));

    }

    // method for insertion sort
    public static int[] insertionSort(int[] nums, int n) {

        if (nums.length == 0) return new int[0];
        for (int i = 1; i < n; i++) {

            // {55, 12, 20, 10, 1, 2, 5, 4}
            // first we have to set the key

            int key = nums[i];
            int j = i - 1; // store the previous index

            while (j >= 0 && nums[j] > key ) {

                nums[j + 1] = nums[j];
                j = j - 1; // like we have to check the previous number also that's why we put minus one here
            }

            // if all element check then we have to shift the key at right position
            nums[j + 1] = key;
        }
        return nums;
    }


}
