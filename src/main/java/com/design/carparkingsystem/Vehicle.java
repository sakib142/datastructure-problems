package com.design.carparkingsystem;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
	protected List<ParkingSpot> parkingSpot = new ArrayList<ParkingSpot>();
	protected int spotsNeeded;
	protected VehicleSize size; 
	protected String numberPlate;
	
	public int getSpotsNeeded() {
		return spotsNeeded;
	}
	public VehicleSize getSize() {
		return size;
	}
	
	public List<ParkingSpot> getParkedSpots(){
		return this.parkingSpot;
	}
	
	public void clearSpots(){
		for(ParkingSpot spot: parkingSpot){
			spot.removeVehicle();
		}
	}
	
	public abstract boolean canFitInSpot(ParkingSpot spot);
}
