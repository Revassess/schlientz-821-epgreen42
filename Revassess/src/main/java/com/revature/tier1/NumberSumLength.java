package com.revature.tier1;

public class NumberSumLength {

	public static boolean checkNumberPowerLength(long num) {
		
		String numToString = String.valueOf(num);
		String[] eachDigit = numToString.split("");
		double power = eachDigit.length;
		long newNum = 0L;
		for(String digit : eachDigit) {
			newNum += (long) Math.pow(Long.parseLong(digit), power);
		}
		return (newNum == num);
	}
}
