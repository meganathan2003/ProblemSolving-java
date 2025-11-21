package com.problems.easy.Arrays;

/*
 * Below the code for find the
 * first palindrome in the string array
 * and return the string
 * 
 * Input: words = ["abc","car","ada","racecar","cool"]
Output: "ada"
 */
public class FirstPalindrome {

    public String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            char[] s = words[i].toCharArray();
            if (checkReverseString(s)) {
                return words[i];
            }
        }
        return "";

    }

    // Below the code for private method to check the condition
    private boolean checkReverseString(char[] arr) {
        String s = String.valueOf(arr); // convert char array to string
        char[] reverseString = new char[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reverseString[index++] = arr[i];

        }
        return s.equals(String.valueOf(reverseString));
        // below the for alter method using two p
//		 int left = 0;
//		    int right = arr.length - 1;
//		    
//		    while (left < right) {
//		        if (arr[left] != arr[right]) {
//		            return false;
//		        }
//		        left++;
//		        right--;
//		    }
//		    return true;
    }

    public static void main(String[] args) {

        String[] str = {"abc", "car", "ada", "racecar", "cool"};

        // Call the method
        FirstPalindrome palindrome = new FirstPalindrome();
        System.out.println(palindrome.firstPalindrome(str));

    }

}
