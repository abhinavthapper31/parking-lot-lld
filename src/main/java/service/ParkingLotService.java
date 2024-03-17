package service;

import exception.ParkingLotException;
import models.Car;
import models.ParkingLot;
import policies.ParkingPolicy;

/*
 * Responsible for interacting with Parking lot
 * 
 * */
public class ParkingLotService {

	private ParkingLot parkingLot;
	private ParkingPolicy parkingPolicy;

	public void createParkingLot(final ParkingLot parkingLot, final ParkingPolicy policy) {

		if (this.parkingLot != null) {
			throw new ParkingLotException("Parking lot already exists.");
		}

		this.parkingLot = parkingLot;
		this.parkingPolicy = policy;

		for (int i = 1; i <= parkingLot.getCapacity(); i++) {
			parkingPolicy.addSlot(i);
		}

	}

	public Integer parkCar(Car car) {

		final Integer nextFreeSlot = parkingPolicy.getNextFreeSlot();
		parkingLot.parkCar(car, nextFreeSlot);

		// slot has been used
		parkingPolicy.removeSlot(nextFreeSlot);
		return nextFreeSlot;
	}

}
