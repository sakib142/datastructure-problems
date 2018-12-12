package com.corejava.collection.hashmap;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mohammad.Sakib
 *
 */
public class Includeduplicatekeysinhashmap {

	static Map<Integer, List<String>> map = new LinkedHashMap<Integer, List<String>>();

	public void add(Integer key, String newValue) {
		List<String> currentValue = map.get(key);
		if (currentValue == null) {
			currentValue = new ArrayList<String>();
			map.put(key, currentValue);
		}
		currentValue.add(newValue);
	}

	public static void main(String[] args) {
		Includeduplicatekeysinhashmap i = new Includeduplicatekeysinhashmap();
		i.add(1, "Shahnawaz");
		i.add(1, "Sakib");

		Iterator it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
	}

}
