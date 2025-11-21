
/**
 * Below the code for find the ruleset
 * and rule key form the list and return 
 * the number 
 * 
 * Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
 */

package com.problems.easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMatchers {

	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

		int index = 0;
		switch (ruleKey) {
		case "type":
			index = 0;
			break;
		case "color":
			index = 1;
			break;
		case "name":
			index = 2;
			break;
		}

		int count = 0;
		for (List<String> item : items) {
			if (item.get(index).equals(ruleValue)) {
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {
		// call the method
		List<List<String>> itemsList = new ArrayList<>();

		// Step 2: Create and populate the first inner list
		List<String> item1 = new ArrayList<>();
		item1.add("phone");
		item1.add("blue");
		item1.add("pixel");

		// Step 3: Create and populate the second inner list
		List<String> item2 = new ArrayList<>();
		item2.add("computer");
		item2.add("silver");
		item2.add("lenovo");

		// Step 4: Create and populate the third inner list
		List<String> item3 = new ArrayList<>();
		item3.add("phone");
		item3.add("gold");
		item3.add("iphone");

		// Step 5: Add the inner lists to the outer list
		itemsList.add(item1);
		itemsList.add(item2);
		itemsList.add(item3);

		String ruleKey = "color";
		String ruleValue = "silver";
		System.out.println(itemsList);
		CountMatchers countMatchers = new CountMatchers();
		System.out.println(countMatchers.countMatches(itemsList, ruleKey, ruleValue));

	}

}
