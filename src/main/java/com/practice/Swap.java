package com.practice;

public class Swap {
	public static void main(String[] args) {
		Integer x = 10;
		Integer y = 20;
		swap(x, y);
		System.out.println("x = " + x + ", y = " + y);
	}

	static void swap(Integer a, Integer b) {
		Integer tmp = a;
		a = b;
		b = tmp;
		System.out.println("A :"+a+", B :"+b);
	}
}
