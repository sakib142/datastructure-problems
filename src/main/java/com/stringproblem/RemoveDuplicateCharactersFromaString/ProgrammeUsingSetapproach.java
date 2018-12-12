package com.stringproblem.RemoveDuplicateCharactersFromaString;

import java.util.HashSet;
import java.util.Set;

public class ProgrammeUsingSetapproach {

	public static void main(String[] args) {
		String stringWithDuplicates = "sssssaaaasakib";
		char[] characters = stringWithDuplicates.toCharArray();
		Set<Character> set = new HashSet<Character>();
		StringBuilder sb = new StringBuilder();
		System.out.println("String with duplicates : " + stringWithDuplicates);
		for (char c : characters) {
			if (!set.contains(c)) {
				set.add(c);
				sb.append(c);
			}
		}
		System.out.println("String after duplicates removed : " + sb.toString());
	}

}
