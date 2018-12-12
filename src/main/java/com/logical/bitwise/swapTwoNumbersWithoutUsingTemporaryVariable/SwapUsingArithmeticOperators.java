package com.logical.bitwise.swapTwoNumbersWithoutUsingTemporaryVariable;

public class SwapUsingArithmeticOperators {
	
	public static void main(String[] args) {
		 int x = 10, y = 5;
		 
		  // Code to swap 'x' and 'y'
		  x = x + y;  // x now becomes 15
		  y = x - y;  // y becomes 10
		  x = x - y;  // x becomes 5
		 
		  System.out.println("After Swapping x = "+x+" ,  y = "+y) ;
		 

	}

}
