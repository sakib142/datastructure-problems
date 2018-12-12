package com.design.carparkingsystem;

public class ParkingSpot {
	private Vehicle vehicle;
	private VehicleSize spotSize;
	private Level level;
	private int row;
	private int spotNumber;
	
	public ParkingSpot(VehicleSize spotSize, Level level, int row,	int spotNumber) {
		this.spotSize = spotSize;
		this.level = level;
		this.row = row;
		this.spotNumber = spotNumber;
	}
	
	public boolean isAvailable(){
		return vehicle == null;
	}
	
	public boolean canFitVehicle(Vehicle vehicle){
		return this.vehicle == null && this.spotSize == vehicle.size;
	}
	
	public boolean park(Vehicle vehicle){
		if(canFitVehicle(vehicle)){
			this.vehicle = vehicle;
			vehicle.parkingSpot.add(this);
			return true;
		}
		return false;
	}
	
	public void removeVehicle(){
		vehicle = null;
		level.spotFreed();
	}
	
	public int getRow(){
		return row;
	}
	
	public int getSpotNumber(){
		return spotNumber;
	}
	
	@Override
	public String toString() {
		return level+", Spot Number: "+getSpotNumber()+", Vehicle: "+vehicle;
	}
}
