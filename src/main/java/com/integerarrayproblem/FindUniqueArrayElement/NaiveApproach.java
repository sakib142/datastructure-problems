package com.integerarrayproblem.FindUniqueArrayElement;

import java.util.Arrays;

public class NaiveApproach {
	
	public static int naiveApproach(int[] inputArray)
	{
	    Arrays.sort(inputArray);
	     
	    int i=0;
	    while(i<inputArray.length)
	    {
	        if(inputArray[i]!=inputArray[i+1])
	        {
	            return inputArray[i];
	        }
	        i=i+2;
	    }
	     
	    return -1;
	}

}

/*Time Complexity 

Let's say , n is a size of input array.

Here, Time complexity of Arrays.sort() method is O(n logn) in worst case scenario.
Once array is sorted, traversing an array takes n/2 iterations. 
So total time complexity of above algorithm is O(n logn + n/2)   i.e   O(n logn)*/
