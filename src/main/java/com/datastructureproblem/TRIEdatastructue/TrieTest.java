package com.datastructureproblem.TRIEdatastructue;

public class TrieTest {
	
	public static void main(String[] args) {
		Trie trie = new Trie();
		// Let the given dictionary be following
		// Let the given dictionary be following
        String Dict[] = {"go", "bat", "me", "eat",
                           "goal", "boy", "run"} ;
        for (String word : Dict) {
        	trie.insert(word);
		}
        
        System.out.println(trie.search("goal"));
		
	}

}
