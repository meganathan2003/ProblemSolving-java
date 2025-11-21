package com.problems.easy.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * @author meganathan
 * 
 *         below the code for find the candies in the children sums
 */
public class NumberOfCandies {

	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		List<Boolean> booleanList = new ArrayList<Boolean>();

		for (int i = 0; i < candies.length; i++) {
			int candy = candies[i] + extraCandies;
			boolean check = false;
			for (int j = 0; j < candies.length; j++) {
				if (candies[j] <= candy) { // 2 <= 6
					System.out.println(candies[j]);
					check = true;
				} else {
					check = false;
					break;
				}
			}
			if (check == true) {
				booleanList.add(check);
			} else {
				booleanList.add(false);
			}
		}
		return booleanList;
	}

	public static void main(String[] args) {

		int[] candies = { 1, 3, 9 };
		int extraCandies = 4;

		NumberOfCandies numberOfCandies = new NumberOfCandies();
		List<Boolean> res = numberOfCandies.kidsWithCandies(candies, extraCandies);

		System.out.println(res);
	}
}
