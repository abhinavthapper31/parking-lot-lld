package models;

import java.util.Map;

import exception.ParkingLotException;
import policies.ParkingPolicy;

public class ParkingLot {

	private ParkingPolicy parkingPolicy;
	private Integer MAX_CAPACITY = 10000;
	private int capacity;
	private Map<Integer, Slot> slots;

	ParkingLot(int capcity, ParkingPolicy policy) {
		if (capacity > MAX_CAPACITY || capacity <= 0) {
			throw new ParkingLotException("Invalid capacity given for parking lot.");
		}
		this.capacity = capcity;
		this.parkingPolicy = policy;
	}

	public int getCapacity() {
		return capacity;
	}

	public Map<Integer, Slot> getSlots() {
		return slots;
	}

	public void parkCar(Car car, Integer freeSlot) {

	}

}
