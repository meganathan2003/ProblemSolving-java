package Sorting;

import java.util.Arrays;

/**
 * Here the file i wrote the selection sort this is also
 * one of the sorting types like you have to select the one
 * element from the array and you assume that you picked the element
 * is smaller than other and comparing others changing the values
 *
 * @author Meganathan
 */
public class SelectionSortExample {

    public static void main(String[] args) {

        int[] nums = {2, 10, 12, 8, 1};
        int n = nums.length;
        int temp = 0;
        int minIndex = -1;

        int[] result = selectionSort(nums, n, minIndex, temp);

        System.out.println(Arrays.toString(result));
    }

    // Separate method for this sorting
    public static int[] selectionSort(int[] nums, int n, int minIndex, int temp) {

        for (int i = 0; i < n - 1; i++) {
            minIndex = i; // assume that first element is smaller than other


            for (int j = i + 1; j < n; j++) {
                if (nums[minIndex] > nums[j]) // 2 > 10
                    minIndex = j; // find the minIndex and swap the below code

            }

            // Swap the two elements
            temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;

            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        return nums;
    }
};
