package models;

public class Slot {

	private int slotNumber;
	private Car parkedCar;

	public Slot(int slotNumber) {
		this.slotNumber = slotNumber;
	}

	public void assignCar(Car car) {
		this.parkedCar = car;
	}

	public void unassignCar() {
		this.parkedCar = null;
	}

	public Integer getSlotNumber() {
		return slotNumber;
	}

	public Car getParkedCar() {
		return parkedCar;
	}

	public boolean isSlotFree() {
		return parkedCar == null;
	}

}
