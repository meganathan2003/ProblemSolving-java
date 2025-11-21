package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Given the array nums consisting of 2n\ elements in the form
 * [x1,x2,...,xn,y1,y2,...,yn].
 *
 *  *Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 *
 *  *Input: nums = [2,5,1,3,4,7], n = 3 Output: [2,3,5,4,1,7]
 *
 *
 * @author meganathan
 */
public class ShuffleArr {

    // create a new method
    public static int[] shuffle(int[] nums, int n) {

        if (n == 0 && nums.length == 0) {
            return new int[0];
        }

        //[2,5,1,3,4,7]
        /**
         * Here we can use two pointer
         *
         */
        int x = 0; // 1
        int y = n; // 4
        int[] newArr = new int[nums.length];

        int index = 0;
        while (x < n && y < nums.length) { // 0 < 3
            newArr[index++] = nums[x++];
            newArr[index++] = nums[y++];
        }
        return newArr;

    }

    public static void main(String[] args) {

        // Create new arra
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        System.out.println(Arrays.toString(shuffle(nums, n)));
    }

}
