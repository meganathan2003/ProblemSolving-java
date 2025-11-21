package com.problems.easy.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {
    public static int[] solution(int[] arr) {
        if (arr.length == 1 && arr[0] == 9) {
            return new int[]{1, 0};
        }
        List<Integer> arrList = new ArrayList<>();

        String nums = "";
        for (int j : arr) {
            nums += j;
        }
        int number = Integer.parseInt(nums) + 1;
        nums = String.valueOf(number);

        for (int i = 0; i < nums.length(); i++) {
            arrList.add(Character.getNumericValue(nums.charAt(i)));
        }

        int[] result = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++) {
            result[i] = arrList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] res = solution(arr);
        System.out.println(Arrays.toString(res));
    }

}
