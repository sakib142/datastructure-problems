package com.practice;

public class NumberSystem {

	public static void main(String[] args) {
		// System.out.println(getNewBase(42224, 62));

		System.out.println(getNumber("aZ2", 62));
	}

	private static String getNewBase(int number, int base) {

		String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

		StringBuilder stringBuilder = new StringBuilder();
		while (number > 0) {
			int remainder = number % base;
			stringBuilder.append(str.charAt(remainder));
			number = number / base;

		}
		return stringBuilder.reverse().toString();
	}

	private static String getNumber(String number, int base) {

		int number1 = 0;
		
		StringBuilder  stringBuilder = new StringBuilder(number);
		String s = stringBuilder.reverse().toString();
		System.out.println(s);
		
		for (int i = 0; i < number.length(); i++) {
			String str = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

			//char c = s.charAt(i);
			int num = str.indexOf(s.charAt(i));
			System.out.println(num);
			number1 = number1 + (int) (num * (Math.pow(base, i)));
		}

		return "" + number1;

	}

}
