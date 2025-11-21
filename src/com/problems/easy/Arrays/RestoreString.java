package com.problems.easy.Arrays;

/**
 * Below the code for shuffle the array and make it proper string and return
 * 
 * @author meganathan
 * 
 *         Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3] Output: "leetcode"
 */
public class RestoreString {

	public String restoreString(String s, int[] indices) {
		if (!s.isEmpty() && indices.length != 0 && s.length() == indices.length && indices != null) {
			// run the for loop
			char[] str = new char[s.length()];
			for (int i = 0; i < s.length(); i++) {
				str[indices[i]] = s.charAt(i);
			}
			return new String(str);
		}
		return s;
	}

	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		RestoreString string = new RestoreString();
		System.out.println(string.restoreString(s, indices));
	}
}
