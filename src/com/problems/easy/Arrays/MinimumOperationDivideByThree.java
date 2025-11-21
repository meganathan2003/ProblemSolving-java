package com.problems.easy.Arrays;

/**
 * Your're a Given the Integer Array and you can element Return the minimum
 * number of operations to make all elements of nums divisible by 3. Input nums
 * = [1,2,3,4] Output: 3
 */
public class MinimumOperationDivideByThree {

    // Create a new method for return the solution
    public int minimumOperations(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 == 0) {
                continue;
            }

            if ((nums[i] - 1) % 3 == 0 || (nums[i] + 1) % 3 == 0) {
                count += 1;
            }
        }
        return count;

    }

    public static void main(String[] args) {

        // Create a new nums array
        int[] nums = {3, 6, 9};

        // Call the method
        MinimumOperationDivideByThree divideByThree = new MinimumOperationDivideByThree();

        System.out.println(divideByThree.minimumOperations(nums));
    }
}
