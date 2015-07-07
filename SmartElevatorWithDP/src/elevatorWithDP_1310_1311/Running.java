/*Program:-
 * Author:- Keshav Murtimant Kelkar
 * Date Created:-6 June 2015
 * Date Modified:- 7 June 2015
 */
package elevatorWithDP_1310_1311;

public class Running extends State {
	
	Running(){
		statename="Running";
	}
	public void handle(Context context){
		Static s = new Static();
		context.setState(s);
		System.out.println("Lift is Currently "+s.statename);
	}

}
