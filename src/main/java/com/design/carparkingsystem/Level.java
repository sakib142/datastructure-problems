package com.design.carparkingsystem;

public class Level {
	private int floor;
	private ParkingSpot[] spots;

	private int availableSpots = 0;

	public Level(int floor, int noOfSpots) {
		this.floor = floor;
		this.availableSpots = noOfSpots;
		spots = new ParkingSpot[noOfSpots];
		int TW = noOfSpots / 3;
		int COM = TW + noOfSpots / 3;
		int LRG = COM;

		for (int i = 0; i < TW; i++) {
			ParkingSpot spot = new ParkingSpot(VehicleSize.TwoWheeler, this, 1, i);
			spots[i] = spot;
		}
		for (int i = TW; i < COM; i++) {
			ParkingSpot spot = new ParkingSpot(VehicleSize.Compact, this, 1, i);
			spots[i] = spot;
		}
		for (int i = COM; i < noOfSpots; i++) {
			ParkingSpot spot = new ParkingSpot(VehicleSize.Large, this, 1, i);
			spots[i] = spot;
		}
	}

	public int availableSpots() {
		return availableSpots;
	}

	public boolean parkVehicle(Vehicle vehicle) {

		for (int i = 0; i < spots.length; i++) {
			ParkingSpot spot = spots[i];
			if (spot.park(vehicle)) {
				this.availableSpots--;
				return true;
			}
		}

		return false;
	}

	public ParkingSpot[] getSpots() {
		return spots;
	}

	@Override
	public String toString() {
		return "Level: " + floor;
	}

	public void spotFreed() {
		availableSpots++;
	}

	private boolean parkStartingAtSpot(int num, Vehicle vehicle) {
		return false;
	}

	private int findAvailableSpots(Vehicle vehicle) {

		return -1;
	}
}
