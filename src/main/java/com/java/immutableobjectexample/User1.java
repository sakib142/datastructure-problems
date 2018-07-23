package com.java.immutableobjectexample;

public final class User1 {
	String firstName;
	String lastName;
	ChildAddress address;

	public User1(String firstName, String lastName, ChildAddress address) {
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

	public ChildAddress getAddress() throws CloneNotSupportedException {
		return (ChildAddress) address.clone();
	}

}