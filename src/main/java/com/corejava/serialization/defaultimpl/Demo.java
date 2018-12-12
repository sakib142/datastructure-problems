package com.corejava.serialization.defaultimpl;

class Demo implements java.io.Serializable {
	
	// TEST by commenting the serialVersionUID
	private static final long serialVersionUID = 1L;
	
	public int a;
	public String b;
	public String c;

	// Default constructor
	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

}
