package com.corejava.collection.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SortMapByValue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);

		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> lst = new ArrayList<>(set);

		Collections.sort(lst, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		});

		for (Entry<String, Integer> entry : lst) {
			System.out.println("Key :" + entry.getKey() + "<------->" + "Value :" + entry.getValue());
		}
	}

}
