package elevatorWithDP_1310_1311;

public class DoorContext {

	Door d;

	DoorContext(Door s){
		d=s;
	}
	
	public Door getDoorStatus(){
		return d;
	}
	
	public void changeDoorStatus(Door s){
		d=s;
	}
	
	public void Switch(){
		d.handleDoor(this);
		
	}
}
