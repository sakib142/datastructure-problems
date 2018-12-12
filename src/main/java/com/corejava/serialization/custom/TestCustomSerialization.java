package com.corejava.serialization.custom;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;

public class TestCustomSerialization {
	public static void main(String[] args) {
		// Create new User object
		User myDetails = new User("Lokesh", "Gupta", 102825, new Date(Calendar.getInstance().getTimeInMillis()));

		// Serialization code
		try {
			FileOutputStream fileOut = new FileOutputStream("User.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(myDetails);
			out.close();
			fileOut.close();
		} catch (IOException i) {
			i.printStackTrace();
		}

		// De-serialization code
		User deserializedUser = null;
		try {
			FileInputStream fileIn = new FileInputStream("User.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			deserializedUser = (User) in.readObject();
			in.close();
			fileIn.close();

			// verify the object state
			System.out.println(deserializedUser.getFirstName());
			System.out.println(deserializedUser.getLastName());
			System.out.println(deserializedUser.getAccountNumber());
			System.out.println(deserializedUser.getDateOpened());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}
}