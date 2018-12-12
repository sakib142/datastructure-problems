package com.oopsconcept.immutableclassproblem;

import java.util.Objects;

public final class AddrRef {
	
	private final String street;

	public AddrRef(final Address addr){
		if(Objects.nonNull(addr)){
			street = addr.getStreet();
		}else{
			street = "";
		}
	}
	public String getStreet() {
		return street;
	}

}
