package com.collection.customImmutableList;

import java.util.List;

public class ImmutableConverterUtil {
	
	public static List<String> unmodifiableList(List lst) {
		return new CustomImmutableList(lst);
	}

}
