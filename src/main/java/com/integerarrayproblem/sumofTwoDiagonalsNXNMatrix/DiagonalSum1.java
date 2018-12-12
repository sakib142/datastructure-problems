package com.integerarrayproblem.sumofTwoDiagonalsNXNMatrix;

public class DiagonalSum1 {

	public static int difference(int arr[][], int n) {
		// Initialize sums of diagonals
		int d1 = 0, d2 = 0;

		for (int i = 0; i < n; i++) {
			d1 += arr[i][i];
			d2 += arr[i][n - i - 1];
		}

		// Absolute difference of the sums
		// across the diagonals
		return Math.abs(d1 - d2);
	}

	/* Driver program to test above function */
	public static void main(String[] args) {
		int n = 3;

		int arr[][] = { { 11, 2, 4 }, { 4, 5, 6 }, { 10, 8, -12 } };

		System.out.print(difference(arr, n));

	}

}
