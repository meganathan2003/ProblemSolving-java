package com.problems.easy.Arrays;
/**
 * @author meganathan
 * 
 */

public class EmployeeMetTarget {

	// Below the create a sperate method
	/**
	 * @param hours
	 * @param target
	 * @return
	 */
	public int employeeMetTarget(int[] hours, int target) {
		int count = 0;
		for (int i = 0; i < hours.length; i++) {
			if (hours[i] == target || hours[i] > target) { // 4 > 6
				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		int[] hours = { 5, 1, 4, 2, 2 };
		// call the method
		EmployeeMetTarget metTarget = new EmployeeMetTarget();
		int res = metTarget.employeeMetTarget(hours, 6);

		System.out.println(res);

	}
}
