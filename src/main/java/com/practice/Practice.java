package com.practice;

public class Practice {
	
	public static void main(String[] args) {
		Address1 address = new Address1();
		address.setStreet("street");
		ImmutableTest immutableTest = new ImmutableTest(1, address);
		System.out.println(immutableTest.getId());
		System.out.println(immutableTest.getAddress().getStreet());
		
		address.setStreet("new Street");
		System.out.println(immutableTest.getAddress().getStreet());
	}

}
