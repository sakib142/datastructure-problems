package com.thread.reentrantlock;

import java.util.HashMap;
import java.util.Map;

public class Runner {

	public static void main(String[] args) {

		Map<String, String> map = getMap();
		System.out.println(map.get("san"));
	}

	private static Map<String, String> getMap() {
		Map<String, String> map = new HashMap();
		map.put("san", "san");
		map.put("jay", "san");
		map.put("tt", "san");
		map.put("qq", "san");
		CustomMap<String, String> customMap = new CustomMap<String, String>(map);
		return customMap;
	}
}
