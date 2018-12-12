package com.collection.customArraylist;

import java.util.ArrayList;

class CustomArrayList {
	// custom class which has data type
	// class has defined the type of data ArrayList
	// size of input 4
	int n = 4;

	// the custom datatype class
	class Data {
		// global variables of the class
		int roll;
		String name;
		int marks;
		long phone;

		// constructor has type of data that is required
		Data(int roll, String name, int marks, long phone) {
			// initialize the input variable from main
			// function to the global variable of the class
			this.roll = roll;
			this.name = name;
			this.marks = marks;
			this.phone = phone;
		}
	}

	public void addValues(int roll[], String name[], int marks[], long phone[]) {
		// local custom arraylist of data type
		// Data having (int, String, int, long) type
		// from the class
		ArrayList<Data> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			// create an object and send values to the
			// constructor to be saved in the Data class
			list.add(new Data(roll[i], name[i], marks[i], phone[i]));
		}

		// after adding values printing the values to test
		// the custom arraylist
		printValues(list);
	}

	public void printValues(ArrayList<Data> list) {
		// list- the custom arraylist is sent from
		// previous function

		for (int i = 0; i < n; i++) {
			// the data received from arraylist is of Data type
			// which is custom (int, String, int, long)
			// based on class Data

			Data data = list.get(i);

			// data variable of type Data has four primitive datatypes
			// roll -int
			// name- String
			// marks- int
			// phone- long
			System.out.println(data.roll + " " + data.name + " " + data.marks + " " + data.phone);
		}
	}

	public static void main(String args[]) {
		// suppose the custom input data
		int roll[] = { 1, 2, 3, 4 };
		String name[] = { "Shubham", "Atul", "Ayush", "Rupesh" };
		int marks[] = { 100, 99, 93, 94 };
		long phone[] = { 8762357381L, 8762357382L, 8762357383L, 8762357384L };

		// Create an object of the class
		CustomArrayList custom = new CustomArrayList();

		// and call the function to add the values to the arraylist
		custom.addValues(roll, name, marks, phone);
	}

}
