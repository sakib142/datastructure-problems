package com.design.carparkingsystem;

public class Motorcycle extends Vehicle {

	public Motorcycle(String numberPlate) {
		spotsNeeded = 1;
		size = VehicleSize.TwoWheeler;
		this.numberPlate = numberPlate;
	}
	
	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}

	@Override
	public String toString() {
		return "Motorcycle: "+this.numberPlate;
	}
}
