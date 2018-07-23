package com.java.immutableobjectexample;

import java.util.ArrayList;
import java.util.Collections;

/*
 * Option 1)

When we have Collection like ArrayList or LinkedList as member variables, 
we should not use their in-built clone() method. 
Their clone() method returns shallow copy of this ArrayList instance. 
The elements themselves are not copied. 
So in such case, we can write our own method to deep copy ArrayList object.
*/
public class User3 {

	String firstName;
	String lastName;
	ArrayList<Address> addressList;

	public User3(String firstName, String lastName, ArrayList<Address> addressList) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.addressList = addressList;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	/*Their clone() method returns shallow copy of this ArrayList instance. The elements themselves are not copied. 
	So in such case, we can write our own method to deep copy ArrayList object*/
	
	/*public ArrayList<Address> getAddress() {
		return (ArrayList) addressList.clone();
	}*/
	
	public ArrayList<Address> getAddressList(){
        return (ArrayList)Collections.unmodifiableCollection(addressList);
    }

}
