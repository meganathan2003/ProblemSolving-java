package Searching;

/**
 * Here the DS is Searching algo like we got
 * and sorted array that sorted array we have to check the
 * target element is there or not if there return index if not
 * return -1
 *
 * @author Meganathan
 */
public class LinearSearch {


    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5,6};
        int target = 4;

        
        int result = linearSearch(nums,target);

        System.out.println("Element found at index in "+ result);
    }

    public static int linearSearch(int[] nums, int target) {
        int n = nums.length;
        
        if(n == 0) return -1;
        
        for(int i = 0; i < n -1; i++){
            if(nums[i] == target) return i;
        }
        // if nothing found return -1
        return -1;
    }
}
