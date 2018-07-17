package com.datastructure.list.immutableList;

import java.util.List;

/**
 * @author Mohammad.Sakib
 *
 */
public class ImmutableConverterUtil {

	public static List<String> unmodifiableList(List<String> lst) {
		return new CustomImmutableList(lst);
	}

}
