package Arrays;

import java.util.HashMap;

public class FindLhs {

    public int findLHS(int[] nums) {

        if (nums.length == 0) return 0;

        // first we have to add the values into hashmap
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        // find the hormonies value
        for (int num : freq.keySet()) {

            if (freq.containsKey(num + 1)) {

                int currentLength = freq.get(num) + freq.get(num + 1);

                maxLength = Math.max(currentLength, maxLength);

            }

        }

        return maxLength;

    }

    static void main(String[] args) {

        int[] input = {1, 3, 2, 2, 5, 2, 3, 7};

        FindLhs soln = new FindLhs();
        System.out.println(soln.findLHS(input));
    }
}
