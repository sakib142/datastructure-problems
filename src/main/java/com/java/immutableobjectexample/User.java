package com.java.immutableobjectexample;

/*
 * class User which has three fields firstName, lastName and Address of type String. To make this class immutable,

	We will declare class as final and all the fields as private final.
	We will provide one parameterized constructor and getter methods.
	We will not provide any setter method, so that field values can not be changed after object creation.
	
*/
public final class User {
	private final String firstName;
	private final String lastName;

	// When address is just a String - No need to do any thing -  It is immutable
	// private final String address;
	
	// In case Address is a Class - Now its a mutable object
	private final Address address;

	public User(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}
}
