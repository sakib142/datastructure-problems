package com.multithreading.PrintOddEvenNumber;

class Printer {

	boolean isOdd = false;

	synchronized void printEven(int number) {

		while (isOdd == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Even:" + number);
		isOdd = false;
		notifyAll();
	}

	synchronized void printOdd(int number) {
		while (isOdd == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Odd:" + number);
		isOdd = true;
		notifyAll();
	}

}
