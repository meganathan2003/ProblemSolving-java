package com.problems.easy.Arrays;

import java.util.Arrays;

/**
 * Below the sum for truncate the particular string the return the value
 *
 * @author meganthan
 *         <p>
 *         Input: s = "Hello how are you Contestant", k = 4 Output: "Hello how
 *         are you"
 */

public class TruncateSentence {

	public String truncateSentence(String s, int k) { 
    	  if (!s.isEmpty() && k > 0) {
    	        String[] arr = s.split(" ");
    	        if (k >= arr.length) { // 4 >= 
    	            return s; // If k is greater than or equal to the number of words, return the original string
    	        }
    	        String[] res = new String[k];
    	        for (int i = 0; i < k; i++) {
    	            res[i] = arr[i];
    	        }
    	        return String.join(" ", res);
    	    }
    	    return "";
    	    
    	    // alter solution for effiecent method
//    	    int i=0;
//            int count=0;
//            for( i=0;i<s.length();i++){
//                if(s.charAt(i)==' ') count++;
//                if(count==k) break;
//            }
//            return s.substring(0,i);
	}

	public static void main(String[] args) {

		String s = "Hello how are you Contestant";
		int k = 4;
		// call the method
		TruncateSentence sentence = new TruncateSentence();
		System.out.println(sentence.truncateSentence(s, k));
	}
}
