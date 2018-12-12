package com.practice;

public class ImmutableTest {

	private final int id;
	private final Address1 address;

	public ImmutableTest(int id, Address1 address) {
		super();
		this.id = id;
		Address1 address1 = new Address1();
		address1.setStreet(address.getStreet());
		this.address = address1;
	}

	public int getId() {
		return id;
	}

	public Address1 getAddress() {
		return address;
	}

}
