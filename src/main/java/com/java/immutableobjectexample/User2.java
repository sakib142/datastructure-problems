package com.java.immutableobjectexample;

/**
 * @author Mohammad.Sakib
 * 
 *         Option 3) 
 *         Another option is to modify getAddress method of User
 *         class. Instead of returning the original Address instance, we will
 *         return deep cloned copy of that Adress instance. Even if third party
 *         user makes any changes to this cloned address object, it will not
 *         affect the original address object of User object.
 *
 */
public final class User2 {

	private final String firstName;
	private final String lastName;
	private final Address address;

	public User2(String firstName, String lastName, Address address) {
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

	public Address getAddress() throws CloneNotSupportedException {
		return (Address) address.clone();
	}
}
