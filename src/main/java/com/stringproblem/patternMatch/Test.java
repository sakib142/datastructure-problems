package com.stringproblem.patternMatch;

public class Test {

	public char findMostRepeatedChar(String word) {

		char[] wordCharacters = word.trim().toCharArray();
		int[] charCount = new int[256];
		int max = -1;
		char result = 0;

		for (int i = 0; i < wordCharacters.length; i++) {
			charCount[wordCharacters[i]]++;
		}

		for (int i = 0; i < wordCharacters.length; i++) {
			if (max < charCount[wordCharacters[i]]) {
				max = charCount[wordCharacters[i]];
				result = wordCharacters[i];

			}

		}

		return result;
	}

	public static void main(String[] args) {
		Test t = new Test();
		char result = t.findMostRepeatedChar("Myname sakib");
		System.out.println("Most repeated chars " + result);
	}
}
