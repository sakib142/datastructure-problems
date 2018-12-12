package com.design.carparkingsystem;

public class ParkingLot {
	private Level[] levels;
	private int nomLevels;
	
	public ParkingLot(int nomLevels, int noOfSpots){
		this.nomLevels = nomLevels;
		levels = new Level[nomLevels];
		for(int i=0;i<nomLevels;i++){
			Level level = new Level(i, noOfSpots);
			levels[i] = level;
		}
	}
	
	public boolean parkVehicle(Vehicle vehicle){
		int spotsNeeded = vehicle.spotsNeeded;
		
		for(int i=0;i<nomLevels;i++){
			Level level = levels[i];
			
			if(level.availableSpots() >= spotsNeeded){
				if(level.parkVehicle(vehicle)){
					return true;
				}
					
			}
		}
		return false;
	}
	
	public void display() {
		
		for(Level level : levels){
			ParkingSpot[] spots =  level.getSpots();
			for(ParkingSpot spot: spots){
				System.out.print(spot+" || ");
			}
			System.out.println();
		}
	}
}
