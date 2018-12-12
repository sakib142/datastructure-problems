package com.integerarrayproblem.FindUniqueArrayElement;

import java.util.HashMap;
import java.util.Map;

public class HashMapApproach {

	public static int hashMapApproach(int[] inputArray) {
		HashMap<Integer, Integer> map = new HashMap<>(inputArray.length);

		for (int num : inputArray) {
			Integer occurrence = map.get(num);

			// if occurrence is null, set it to 1,
			// else increment the occurrence
			map.put(num, occurrence == null ? 1 : occurrence + 1);
		}

		// traversing entryset to find the key with occurrence == 1
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() == 1) {
				return e.getKey();
			}
		}

		return -1;
	}

}

/*

Time Complexity

Let's say , n is a size of input array.

In best and average case, Time Complexity of HashMap insertion operation is O(1)  
and in worst case it is O(n). 
Once all the elements are inserted into HashMap, we need to traverse through  
(Capacity of HashMap + size of HashMap)  elements of HashMap i.e O(capacity + n)  
So total time complexity of above algorithm is O(n)

Space Complexity

In this approach, we are using an additional datastructure i.e. 
HashMap of size n. So space complexity of above program is O(n) */
