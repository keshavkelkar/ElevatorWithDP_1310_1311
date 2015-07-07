package elevatorWithDP_1310_1311;

public class DoorClose extends Door{

	DoorClose(){
		doorStatus="close";
	}

	@Override
	public void handleDoor(DoorContext c) {
		DoorOpen dc = new DoorOpen();
		c.changeDoorStatus(dc);	
	}

}
