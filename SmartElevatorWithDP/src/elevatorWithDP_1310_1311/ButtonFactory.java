/*Program:-
 * Author:- Scheweta G. Naik
 * Date Created:-6 June 2015
 * Date Modified:- 7 June 2015
 */
package elevatorWithDP_1310_1311;

public class ButtonFactory {

	public Button getButtonType(String type,int id){
		if(type.equals("PannelButton"))
			return new PannelButton(id);
		else if(type.equals("FloorButton"))
			return new FloorButton();
		else
			return null;
	}
}
