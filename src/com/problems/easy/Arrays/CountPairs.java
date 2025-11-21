package com.problems.easy.Arrays;
import javax.swing.plaf.IconUIResource;
import java.util.Arrays;
import java.util.List;

/**
 * @author meganathan
 * <p>
 * Below the code for find the count of the pairs in the Array
 */
public class CountPairs {

    // Create a separate method for good practice and return the values
    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                int add = (nums.get(i)) + (nums.get(j));
                if (add < target) {
                    count++;
                }
            }
        }
        return count;

    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(-6, 2, 5, -2, -7, -1, 3);
        CountPairs pairs = new CountPairs();
        int res = pairs.countPairs(nums, -2);
        System.out.println(res);
    }

}
