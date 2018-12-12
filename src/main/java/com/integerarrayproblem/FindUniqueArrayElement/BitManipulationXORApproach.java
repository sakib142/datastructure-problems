package com.integerarrayproblem.FindUniqueArrayElement;

public class BitManipulationXORApproach {

	public static int xorApproach(int[] inputArray) {
		int result = 0;
		for (int i = 0; i < inputArray.length; i++) {
			result ^= inputArray[i];
		}

		return (result > 0 ? result : -1);

	}
}
