/*Program:-
 * Author:- Scheweta G. Naik
 * Date Created:-6 June 2015
 * Date Modified:- 7 June 2015
 */
package elevatorWithDP_1310_1311;

public class PannelButton extends Button{

	Integer id;
	PannelButton(Integer id){
		this.id=id;
	}
	
	public Integer getButtonId(){
		return id;
	}
	@Override
	public void callElevator(Elevator e1, Integer dest, Integer curr) {
		// TODO Auto-generated method stub
		
	}

}
