package Searching;

/**
 * Here the DS is Linear searching time complexity is
 * O(log n)that means it split the array half and half and
 * make it more efficient
 *
 * @author Meganathan
 */

public class binarySearchExample {

    public static void main(String[] args) {

        int[] nums = {2,3,4,6,7,8,9};
        int target = 4;


        int result = binarySearch(nums,target);

        System.out.println("Element found in array index at "+ result);
    }

    public static int binarySearch(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right){ // check the boundary of the array

            int mid = (left+right) / 2;

            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }

        return -1;
    }
}
