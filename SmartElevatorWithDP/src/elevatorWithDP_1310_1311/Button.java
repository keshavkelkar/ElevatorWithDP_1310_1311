/*Program:-
 * Author:- Scheweta G. Naik
 * Date Created:-6 June 2015
 * Date Modified:- 7 June 2015
 */
package elevatorWithDP_1310_1311;

public abstract class Button {

    String buttonStatus;
	
	Button(){
		this.buttonStatus="reset";
    }

	public String getButtonStatus(){
			return buttonStatus;	
	}
	
	public void setButtonStatus(String buttonStatus){
		this.buttonStatus=buttonStatus;	
	}
	
	public abstract void callElevator(Elevator e1, Integer dest,Integer curr);
		
}
