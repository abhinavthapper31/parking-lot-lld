package policies;

public interface ParkingPolicy {

	public void addSlot(Integer slotNumber);

	public void removeSlot(Integer slotNumber);

	public Integer getNextFreeSlot();

}
