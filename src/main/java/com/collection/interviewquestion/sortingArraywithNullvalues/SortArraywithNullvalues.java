package com.collection.interviewquestion.sortingArraywithNullvalues;

import java.util.Arrays;
import java.util.Comparator;

public class SortArraywithNullvalues {

	public static void sortStringArraywithNullvalues() {

		String[] myArray = { "Apple", "Banana", null, "Durian", null, null, "Grapes" };
		Arrays.sort(myArray, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if (o1 == null && o2 == null) {
					return 0;
				}
				if (o1 == null) {
					return -1;
				}
				if (o2 == null) {
					return 1;
				}
				return o1.compareTo(o2);
			}
		});

		for (String string : myArray) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		sortStringArraywithNullvalues();
	}

}
