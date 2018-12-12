package com.datastructure.Tree.BSTInSortedOrder;

public class SortBST {
	private static void printSorted(int[] arr, int start, int end) {
		if (start > end)
			return;

		// print left subtree
		printSorted(arr, start * 2 + 1, end);

		// print root
		System.out.print(arr[start] + " ");

		// print right subtree
		printSorted(arr, start * 2 + 2, end);
	}

	// driver program to test above function
	public static void main(String[] args) {
		int arr[] = { 4, 2, 5, 1, 3 };

		printSorted(arr, 0, arr.length - 1);
	}
}
