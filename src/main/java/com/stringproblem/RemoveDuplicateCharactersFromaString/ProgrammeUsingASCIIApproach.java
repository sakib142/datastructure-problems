package com.stringproblem.RemoveDuplicateCharactersFromaString;

public class ProgrammeUsingASCIIApproach {
	public static void main(String[] args) {

		String stringWithDuplicates = "sssssaaaasakib";
		char[] characters = stringWithDuplicates.toCharArray();
		
		boolean[] found = new boolean[256];
		StringBuilder sb = new StringBuilder();
		System.out.println("String with duplicates : " + stringWithDuplicates);
		
		for (char c : characters) {
			if (!found[c]) {
				found[c] = true;
				sb.append(c);
			}
		}
		System.out.println("String after duplicates removed : " + sb.toString());
	}
}

// http://codippa.com/how-to-remove-duplicate-characters-from-string-in-java/
// Complexity - O(n)