package com.design.carparkingsystem;

import java.util.ArrayList;
import java.util.List;

public class ParkingLotTest {
	public static void main(String[] args) {
		createParkingLot();

	}

	private static void createParkingLot() {
		ParkingLot parkingLot = new ParkingLot(3, 3);
		List<Vehicle> vehicles = new ArrayList<Vehicle>();
		Vehicle bus1 = new Bus("KA54 4562");
		Vehicle bus2 = new Bus("KA65 8453");
		Vehicle bus3 = new Bus("KA51 6540");
		Vehicle car1 = new Car("KA53 8681");
		Vehicle car2 = new Car("KA51 8746");
		Vehicle car3 = new Car("KA54 5432");
		Vehicle motorCycle1 = new Motorcycle("KA54 4872");
		Vehicle motorCycle2 = new Motorcycle("KA47 2456");
		Vehicle motorCycle3 = new Motorcycle("KA44 7843");
		Vehicle motorCycle4 = new Motorcycle("KA54 1065");
		Vehicle motorCycle5 = new Motorcycle("KA46 0424");
		vehicles.add(bus1);
		vehicles.add(bus2);
		vehicles.add(bus3);
		vehicles.add(car1);
		vehicles.add(car2);
		vehicles.add(car3);
		vehicles.add(motorCycle1);
		vehicles.add(motorCycle2);
		vehicles.add(motorCycle3);
		vehicles.add(motorCycle4);
		vehicles.add(motorCycle5);

		for (Vehicle vehicle : vehicles) {
			parkingLot.parkVehicle(vehicle);
		}

		System.out.println(motorCycle4.getParkedSpots());
		parkingLot.display();

		motorCycle3.clearSpots();
		System.out.println("--------------------");
		parkingLot.display();

		parkingLot.parkVehicle(motorCycle4);
		System.out.println(motorCycle4.getParkedSpots());
	}

}
