package com.java.immutableobjectexample;

/* 
	So what should we do to change the behaviour of Address class and remove setter methods from it? 
	We can create child class of Address class,
	override all the setter methods and then explicitely throw UnsupportedOperationException from those setter methods.
	*/
public class TestImmutabilityWithCloning {

	public static void main(String s[]) throws CloneNotSupportedException {

		User u = new User("Sherlock", "Homes", new ChildAddress("221B", "Baker Street", "London"));

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
	 * Is there any problem with this approach?
	 * 
	 * Well yes. what if some of the reference variables inside Address class is
	 * also Mutable Objects. In that case we need to override their setter methods
	 * as well. This approch becomes more complex when there are many nested Mutable
	 * class references.
	 */
}
