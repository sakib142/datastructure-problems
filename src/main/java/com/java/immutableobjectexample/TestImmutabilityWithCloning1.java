package com.java.immutableobjectexample;

public class TestImmutabilityWithCloning1 {

	public static void main(String s[]) throws CloneNotSupportedException {

		User2 u = new User2("Sherlock", "Homes", new Address("221B", "Baker Street", "London"));

		// fetch address from the User object and store it in local variable address
		Address address = u.getAddress();
		System.out.println(address);

		// change address in local variable
		address.setFirstLine("001D");
		address.setSecondLine("Chandani Chawk");
		address.setCity("Delhi");

		// display address from User object
		System.out.println(u.getAddress());
	}
}
