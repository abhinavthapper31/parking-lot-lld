package policies;

import java.util.TreeSet;

import exception.NoFreeSlotAvailableException;

public class NaturalNumberOrderingPolicy implements ParkingPolicy {

	private TreeSet<Integer> set;

	public NaturalNumberOrderingPolicy() {
		this.set = new TreeSet<Integer>();
	}

	public void addSlot(Integer slotNumber) {
		this.set.add(slotNumber);

	}

	public void removeSlot(Integer slotNumber) {
		this.set.remove(slotNumber);

	}

	public Integer getNextFreeSlot() {
		if (set.isEmpty()) {
			throw new NoFreeSlotAvailableException();
		}
		return this.set.first();
	}

}
