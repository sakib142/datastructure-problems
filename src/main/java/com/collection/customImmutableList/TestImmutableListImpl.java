package com.collection.customImmutableList;

import java.util.ArrayList;
import java.util.List;

public class TestImmutableListImpl {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("abc");
		lst.add("def");
		
		List<String> list = ImmutableConverterUtil.unmodifiableList(lst);
		list.add("def");
	}

}
