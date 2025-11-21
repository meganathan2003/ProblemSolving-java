package com.problems.easy.Arrays;
class insertPosition {
    public static int solution(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left = 0;
        int right = nums.length - 1; // 40 // get the last value

        while (left <= right) { //  0 < 40
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid; // check the mid value
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 10, 40};
        int target = 4;
        int res = solution(arr, target);
        if (res == -1) {
            System.out.println("Element not in array");
        } else {
            System.out.println(res);
        }
    }

}
