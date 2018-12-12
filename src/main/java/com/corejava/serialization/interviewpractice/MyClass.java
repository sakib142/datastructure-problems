package com.corejava.serialization.interviewpractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*During deserialization, the fields of non-serializable classes will be initialized 
using the public or protected no-arg constructor of the class. 
A no-arg constructor must be accessible to the subclass that is serializable. 
The fields of serializable subclasses will be restored from the stream.*/

class MyClass extends NewClass1 implements Serializable {

	private String s;
	//private NewClass1 n;

	MyClass(String s) {
		this.s = s;
		setVal(20);
	}

	public String toString() {
		return s + "--- " + getVal();
	}

	public static void main(String args[]) {
		MyClass m = new MyClass("Serial");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serial.txt"));
			oos.writeObject(m); // writing current state
			oos.flush();
			oos.close();
			System.out.print(m); // display current state object value
		} catch (IOException e) {
			System.out.print(e);
		}
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serial.txt"));
			MyClass o = (MyClass) ois.readObject(); // reading saved object
			ois.close();
			System.out.print(o); // display saved object state
		} catch (Exception e) {
			System.out.print(e);
		}
	}
}
