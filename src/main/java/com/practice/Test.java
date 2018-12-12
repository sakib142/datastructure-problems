package com.practice;

public class Test {
	static final int ASCII_SIZE = 256;

	static void getMaxOccuringChar(String str) {
		// Create array to keep the count of individual
		// characters and initialize the array as 0
		int count[] = new int[ASCII_SIZE];

		int[] x = { 1, 2, 3, 3, 4, 4 };

		for (int i = 0; i < x.length; i++){
			count[x[i]]++;
		}

		for (int i = 0; i < x.length; i++) {
			if (count[x[i]] == 1) {
				System.out.println(x[i]);
			}
		}

	}

	// Driver Method
	public static void main(String[] args) {
		String str = "sample string";
		getMaxOccuringChar(str);
	}
}
