package com.java.immutableobjectexample;

/**
 * @author Mohammad.Sakib
 * 
 *         Users field Address class has setter methods and hence now User class
 *         has one mutable member field. Can this break immutability of User
 *         class? Lets try to break immutability of User class.
 *
 */
public class TestImmutabilityWithoutCloning {

	public static void main(String s[]) {

		User u = new User("Sherlock", "Homes", new Address("221B", "Baker Street", "London"));

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

	/*
	 * Output : Address [firstLine=221B, secondLine=Baker Street, city=London]
	 * Address [firstLine=001D, secondLine=Chandani Chawk, city=Delhi]
	 * 
	 * Here, first we got reference of address object using getAddress() method. We
	 * have stored this reference in new local variable, it was still pointing to
	 * the same address instance. So, when we changed value of firstLine, secondLine
	 * and city fields of address instance, it updated the address instance being
	 * used by User object. And hence, when we tried to get address of user, it
	 * printed updated address. User class is no more Immutable.
	 */
}
