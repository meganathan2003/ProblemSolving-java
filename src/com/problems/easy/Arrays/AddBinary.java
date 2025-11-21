package com.problems.easy.Arrays;
import java.math.BigInteger;

public class AddBinary {
	public static String addBinary(String a, String b) {
		BigInteger number1 = new BigInteger(a, 2); // 11
		BigInteger number2 = new BigInteger(b, 2);
		BigInteger sum = number1.add(number2);
		return sum.toString(2);
	}

	public static void main(String[] args) {

		String a = "11";
		String b = "1";

		System.out.println(addBinary(a, b));
		
	}
}