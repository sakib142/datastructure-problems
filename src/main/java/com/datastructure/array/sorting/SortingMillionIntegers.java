
package com.datastructure.array.sorting;

/**
 * @author Mohammad.Sakib
 * 
 *         Problem Statement : Given a collection of 1 million integers ranging
 *         from 1 to 9, how would you sort them in Big O(n) time
 *
 */
public class SortingMillionIntegers {

	public static void main(String[] args) {
		int[] array = { 2, 1, 5, 1, 2, 3, 4, 3, 5, 6, 7, 8, 5, 6, 7, 0 };
		new SortingMillionIntegers().sort(array, 0, 8);
	}

	public void sort(int[] array, int min, int max) {
		int range = max - min + 1;
		int[] result = new int[range];

		// It will create a bucket on the basis of its position
		for (int i : array) {
			result[i]++;
		}

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i]; j++) {
				System.out.println(i);
			}
		}

	}
}
