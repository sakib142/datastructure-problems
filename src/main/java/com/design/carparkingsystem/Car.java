package com.design.carparkingsystem;

public class Car extends Vehicle {

	public Car(String numberPlate) {
		spotsNeeded = 1;
		size = VehicleSize.Compact;
		this.numberPlate = numberPlate;
	}

	@Override
	public boolean canFitInSpot(ParkingSpot spot) {
		return false;
	}

	@Override
	public String toString() {
		return "Car: " + this.numberPlate;
	}
}
