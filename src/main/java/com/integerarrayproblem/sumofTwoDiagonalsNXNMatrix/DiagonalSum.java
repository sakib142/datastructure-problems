package com.integerarrayproblem.sumofTwoDiagonalsNXNMatrix;

public class DiagonalSum {

	public static int difference(int arr[][], int n) {
		// Initialize sums of diagonals
		int d1 = 0, d2 = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				// finding sum of primary diagonal
				if (i == j)
					d1 += arr[i][j];

				// finding sum of secondary diagonal
				if (i == n - j - 1)
					d2 += arr[i][j];
			}
		}

		// Absolute difference of the sums
		// across the diagonals
		return Math.subtractExact(d1, d2);
	}

	public static void main(String[] args) {
		int n = 3;

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		System.out.print(difference(arr, n));

		if (difference(arr, n) == 0) {
			System.out.println("Diagonals are same !");
		}
	}

}

// Time complexity : O(n*n)