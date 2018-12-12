package com.stringproblem.patternMatch;

public class PatternMatcher {

	public static void main(String[] args) {

		String text = "abcdefdddgggg";
		String pattern = "ddd";
		int count = 0;

		char c, p;

		for (int i = 0; i < text.length() - pattern.length(); i++) {

			c = text.charAt(i);
			p = pattern.charAt(0);

			if (c == p) {

				for (int j = i, k = 0; j < i + pattern.length(); j++, k++) {

					c = text.charAt(i);
					p = pattern.charAt(k);

					if (c == p) {
						count++;
					}

				}
			}

		}

		if (count == pattern.length()) {
			System.out.println("Pattern Found");
		} else {
			System.out.println("Not found");
		}
	}

}
