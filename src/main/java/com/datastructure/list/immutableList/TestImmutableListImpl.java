package com.datastructure.list.immutableList;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammad.Sakib
 *
 */
public class TestImmutableListImpl {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();
		lst.add("abc");
		lst.add("def");

		List<String> list = ImmutableConverterUtil.unmodifiableList(lst);
		list.add("abdef");
	}

}
