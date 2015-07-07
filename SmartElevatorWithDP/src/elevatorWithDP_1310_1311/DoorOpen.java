package elevatorWithDP_1310_1311;

public class DoorOpen extends Door{
	
	DoorOpen(){
		doorStatus="open";
	}

	@Override
	public void handleDoor(DoorContext c) {
		DoorClose dc = new DoorClose();
		c.changeDoorStatus(dc);	
	}
	
}
