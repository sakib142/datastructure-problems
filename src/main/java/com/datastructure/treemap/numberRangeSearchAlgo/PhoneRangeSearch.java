package com.datastructure.treemap.numberRangeSearchAlgo;

import java.util.TreeMap;

public class PhoneRangeSearch {
	private class PhoneRange {
		int start;
		int end;
		String state;

		public PhoneRange(int start, int end, String state) {
			this.start = start;
			this.end = end;
			this.state = state;
		}
	}

	TreeMap<Integer, PhoneRange> phoneRangeTreeMap = new TreeMap<>();

	public void addRange(int start, int end, String state) {
		PhoneRange range = new PhoneRange(start, end, state);
		phoneRangeTreeMap.put(start, range);
	}

	public String getState(int phone) {
		return phoneRangeTreeMap.floorEntry(phone).getValue().state;
	}
	
	public static void main(String[] args) {
		PhoneRangeSearch phoneRangeSearch = new PhoneRangeSearch();
		phoneRangeSearch.addRange(91000000, 91999999, "HP");
		phoneRangeSearch.addRange(92000000, 92999999, "JK");
		phoneRangeSearch.addRange(93000000, 93999999, "PB");
		phoneRangeSearch.addRange(94000000, 94999999, "HR");
		phoneRangeSearch.addRange(95000000, 95999999, "UP");
		/*assertEquals("HR", phoneRangeSearch.getState(94251212));
		assertEquals("PB", phoneRangeSearch.getState(93158200));
		assertEquals("HP", phoneRangeSearch.getState(91543543));
		assertEquals("JK", phoneRangeSearch.getState(92100004));*/
		
		System.out.println(phoneRangeSearch.getState(94251212));
		System.out.println(phoneRangeSearch.getState(93158200));
		System.out.println(phoneRangeSearch.getState(91543543));
		System.out.println(phoneRangeSearch.getState(92100004));
	}
}