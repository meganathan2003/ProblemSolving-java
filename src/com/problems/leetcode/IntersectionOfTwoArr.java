package com.problems.leetcode;

import java.util.*;

public class IntersectionOfTwoArr {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // validation
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }

        set1.retainAll(set2);

        // Finally convert the list to integer
        int[] result = set1.stream().mapToInt(Integer::intValue).toArray();
        return result;

        // Another solution
//        class Solution {
//            public int[] intersection(int[] nums1, int[] nums2) {
//                HashSet<Integer> set=new HashSet<>();
//                ArrayList<Integer> ans=new ArrayList<>();
//                for(int i=0;i<nums1.length;i++){
//                    set.add(nums1[i]);
//                }
//                for(int i=0;i<nums2.length;i++){
//                    if(set.contains(nums2[i])){
//                        ans.add(nums2[i]);
//                        set.remove(nums2[i]);
//                    }
//                }
//                int[] arr=new int[ans.size()];
//                for(int i=0;i<arr.length;i++){
//                    arr[i]=ans.get(i);
//                }
//                return arr;
//            }
//        }
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
