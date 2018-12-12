package com.stringproblem.CheckPangram;

public class PangramCheck {
	
	public static void main(String[] args) {
		findMissingLetters("The quick brown fox jumps odfdfver the lazy dog");
	}

	public static void findMissingLetters(String input){
		boolean isPangram = true;
		boolean[] present = new boolean[26];
		input = input.toLowerCase();
		for(int i=0;i<input.length();i++){
			char c = input.charAt(i);
			if(c>='a' && c<='z'){
				present[c-'a'] = true;
			}
		}
		for(int i=0;i<26;i++){
			if(!present[i]){
				System.out.print((char)(i+'a') +  "   ");
				isPangram = false;
			}
		}
		
		if(isPangram) {
			System.out.println("The String is a Panagram");
		}
		else {
			System.out.println("This String is not Panagram");
		}
	}

}
