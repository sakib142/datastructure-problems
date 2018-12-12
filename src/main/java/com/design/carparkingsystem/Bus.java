package com.design.carparkingsystem;

public class Bus extends Vehicle {

	public Bus(String numberPlate) {
		spotsNeeded = 1;
		size = VehicleSize.Large;
		this.numberPlate = numberPlate;
	}
	
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}
	
	@Override
	public String toString() {
		return "Bus: "+this.numberPlate;
	}

}
