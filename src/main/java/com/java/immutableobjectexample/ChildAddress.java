package com.java.immutableobjectexample;
/*
Option 1) 
	We will not provide any setter methods in Address class so that nobody can change properties of address class.
 	If you will answer this, interviewer will counter you saying Address is a third-part java class i.e.
  	It is being referred from third party jar file and we do not have access to the source code of Address.

Option 2) 
	So what should we do to change the behaviour of Address class and remove setter methods from it? 
	We can create child class of Address class,
 	override all the setter methods and then explicitely throw UnsupportedOperationException from those setter methods.
*/

public class ChildAddress extends Address {

	public ChildAddress(String firstLine, String secondLine, String city) {
		super(firstLine, secondLine, city);
	}

	public void setFirstLine(String firstLine) {
		throw new UnsupportedOperationException();
	}

	public void setSecondLine(String secondLine) {
		throw new UnsupportedOperationException();
	}

	public void setCity(String city) {
		throw new UnsupportedOperationException();
	}
}
