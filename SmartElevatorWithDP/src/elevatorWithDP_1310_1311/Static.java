/*Program:-
 * Author:- Keshav Murtimant Kelkar
 * Date Created:-6 June 2015
 * Date Modified:- 7 June 2015
 */
package elevatorWithDP_1310_1311;

public class Static extends State {

	public Static(){
		statename="Static";
	}
	public void handle(Context context){
		
		Running r = new Running();
		context.setState(r);
		System.out.println("Lift is Currently "+r.statename);

	}
}
