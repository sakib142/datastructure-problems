package com.java.immutableobjectexample;

import java.util.ArrayList;

public class TestImmutabilityWithUnmodifiableCollection {
	public static void main(String s[]) throws CloneNotSupportedException {

		ArrayList<Address> addressList = new ArrayList<Address>();
		addressList.add(new Address("221B", "Baker Street", "London"));
		addressList.add(new Address("66", "Perry Street", "West Village"));

		User3 u = new User3("Sherlock", "Homes", addressList);

		// fetch address list from the User object and store it in local variable
		// localAddressList
		ArrayList<Address> localAddressList = u.getAddressList();
		System.out.println(localAddressList);

		// remove address at 0th position in ArrayList
		localAddressList.remove(0);

		// display address list from User object
		System.out.println(u.getAddressList());
	}
}
