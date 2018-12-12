package com.stringproblem.ReverseStringusingRecursion;

public class StringReverseWithOutFunction {
	public static void main(String[] args) {
     StringBuffer str=new StringBuffer("Upendra");
     
     for(int i=str.length()-1;i>=0;i--){
    	 System.out.print(str.charAt(i));
     }
     System.out.println("");
     System.out.println(str.reverse());
    
	}
}
