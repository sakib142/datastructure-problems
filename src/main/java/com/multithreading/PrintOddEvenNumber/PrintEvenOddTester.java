package com.multithreading.PrintOddEvenNumber;

public class PrintEvenOddTester {

	public static void main(String... args) {
		Printer print = new Printer();
		Thread t1 = new Thread(new TaskEvenOdd(print, 10, false));
		Thread t2 = new Thread(new TaskEvenOdd(print, 10, true));
		t1.start();
		t2.start();
	}

}
